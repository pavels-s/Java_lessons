package main.java.JavaGuru_2020_Java1.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {
    public static void main(String[] args) {

        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.findUserByIdPositiveTest();
        bankApiImplTest.findUserByIdNegativeTest();
        bankApiImplTest.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }




    void findUserByIdPositiveTest() {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);

        UserCredentials userCredentials = new UserCredentials(roles);
        BankApi bankApi = new BankApiImpl(clients);

        try {
            BankClient result = bankApi.findByUid(userCredentials, "1").get();
            boolean condition = result.equals(new BankClient("1", "Client1"));
            checkResult(condition, "Positive result");
        } catch (AccessDeniedException e) {
            System.out.println("Test FAILED");
        }
    }

    void findUserByIdNegativeTest() {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);

        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            BankApi bankApi = new BankApiImpl(clients);
            Optional<BankClient> result = bankApi.findByUid(userCredentials, "4");
            boolean condition = result.equals(clients.get(1));
            checkResult(condition, "Negative result");
        } catch (AccessDeniedException e) {
            System.out.println("Test FAILED");
        }
    }

    public void checkResult(boolean condition, String testName) {
        if (!condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}