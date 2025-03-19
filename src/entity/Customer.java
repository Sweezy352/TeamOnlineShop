package entity;

import enums.UserType;

//Класс который наследуется от User
public class Customer extends User{
    //Конструктор чтоб инициализировать переменную userType на CUSTOMER
    public Customer() {
        this.userType = UserType.CUSTOMER;
    }
}
