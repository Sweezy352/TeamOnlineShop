package entity;

import enums.UserType;

//Класс который наследуется от User
public class Salesman extends User{
    //Конструктор чтоб инициализировать переменную userType на Salesman
    public Salesman() {
        this.userType = UserType.SALESMAN;
    }
}
