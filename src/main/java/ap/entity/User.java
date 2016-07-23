package ap.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    @NotEmpty(message = "Пожалуйста, введите имя")
    private String name;

    @Column(name = "login", nullable = false)
    @NotEmpty(message = "Пожалуйста, введите логин")
    private String login;

    @Column(name = "password", nullable = false)
    @NotEmpty(message = "Пожалуйста, введите пароль")
    @Size(min = 4, message = "Размер пароля должен быть минимум 4 символов")
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    @Email(message = "Введенный адрес не является корректным адресом почты")
    @NotEmpty(message = "Пожалуйста, введите почтовый адрес")
    private String email;

    @Column(name = "date")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }

    public User(String name, String login, String password, String email, Date date) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
