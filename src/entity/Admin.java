package entity;

import enums.UserType;

//Класс который наследуется от User
public class Admin extends User{
    //Конструктор чтоб инициализировать переменную userType на Salesman
    public Admin() {
        this.userType = UserType.ADMIN;
    }
}
