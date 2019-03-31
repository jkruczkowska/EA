package eu.aevent.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String userName;

    @Column(name = "surname")
    private String userSurname;

    @ManyToOne
    private Role role;

    @Column(unique = true)
    @Email
    private String email;

    private String login;

    private String password;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    @Column(name = "age")
    private int userAge;

    public User() {
    }

    public User(String userName, String userSurname, Role role, @Email String email, String login,
                String password, LocalDateTime registrationDate, int userAge) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.role = role;
        this.email = email;
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                ", userAge=" + userAge +
                '}';
    }
}
