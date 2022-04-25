package main.java.student_pavel_sharkel.lesson_12.level_2;


import java.util.Optional;

public interface BankApi {


        Optional<BankClient> findByUid (UserCredentials credentials, String uid)
                throws AccessDeniedException;
}
