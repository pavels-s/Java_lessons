package main.java.JavaGuru_2020_Java1.lesson_12.level_2;

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean getRoles(Role role) {
        return roles.contains(Role.CAN_SEARCH_CLIENTS);
    }
}
