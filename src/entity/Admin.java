package entity;

import enums.UserType;

//Класс который наследуется от User
public class Admin extends User{
    //Конструктор чтоб инициализировать переменную userType на Admin
    public Admin() {
        this.userType = UserType.ADMIN;
    }
}
