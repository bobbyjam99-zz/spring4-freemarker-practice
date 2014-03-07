package spring4.freemarker.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @Setter
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    @Getter
    @Setter
    private Date birthDate;

    public User() {

    }

    public User(String firstname, String lastname, Date birthDate) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }
}
