package entity;

import enums.UserType;

//Абстрактный класс чтоб на основе него создать типы пользователей
public abstract class User {
    //Поля для описания класса User
    protected Long id;
    protected String login;
    protected String password;
    protected UserType userType;
    protected Long balance;


    //Геттеры сеттеры для получения и вствки значений
    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public User setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public UserType getUserType() {
        return userType;
    }

    public User setUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
