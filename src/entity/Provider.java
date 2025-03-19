package entity;

import enums.UserType;

//Класс который наследуется от User
public class Provider extends User{
    //Конструктор чтоб инициализировать переменную userType на Provider
    public Provider() {
        this.userType = UserType.PROVIDER;
    }
}
