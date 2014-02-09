package spring4.freemarker.model;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    @Setter
    private String firstname;
    @Getter
    @Setter
    private String lastname;

    public User() {
    }

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
