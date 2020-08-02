package zad2;

import java.time.LocalDateTime;

public class User {
    private String login;
    private String password;
    private String firstName;
    private String email;
    private LocalDateTime creationDate;

    private User(String login, String password, String firstName, String email, LocalDateTime creationDate) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public static User create(String login, String firstName, String email) throws NullParameterException {
        if (login == null || firstName == null || email == null) {
            throw new NullParameterException();
        }

        if (login.length() < 6) {
            throw new IllegalArgumentException();
        }

        return new User(login, "lolz", firstName, email, LocalDateTime.now());
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}