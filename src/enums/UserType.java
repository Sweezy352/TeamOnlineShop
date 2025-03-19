package enums;

//Перечесляемый типы пользователей
public enum UserType {
    CUSTOMER("Покупатель"),
    SALESMAN("Продавец"),
    PROVIDER("Поставщик"),
    ADMIN("Администратор");

    //Переменная чтоб получать описание констант
    private String getDescription;

    //Конструктор чтоб положить описание констант по умолчанию
    UserType(String getDescription) {
        this.getDescription = getDescription;
    }
}
