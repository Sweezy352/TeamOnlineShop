package commandFabric.Commands;

import commandFabric.CommandOrder;
import entity.*;
import enums.UserType;
import utils.Input;

public class Register implements CommandOrder {
    @Override
    public void execute() {
        User user = null;
        System.out.println("Кем вы хотите зарегистрироваться: 1)Покупатель, 2)Продавец, 3)Поставщик, 4)Админ: ");
        long profile = Input.inputLong();
        if (profile == 1) {
            user = new Customer();
        } else if (profile == 2) {
            user = new Salesman();
        } else if (profile == 3) {
            user = new Provider();
        } else if (profile == 4) {
            user = new Admin();
        } else {
            System.out.println("Введите от 1 до 4!");
            return;
        }
        System.out.println("Введите логин: ");
        user.setLogin(Input.inputLine());
        System.out.println("Введите пароль: ");
        user.setPassword(Input.inputLine());
        System.out.println("Введите сколько у вас денег: ");
        user.setBalance(Input.inputLong());
        //TODO
        //надо будет хранить пользователей в txt файлы
    }
}