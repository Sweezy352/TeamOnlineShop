package utils;

import exceptions.InvalidInputException;

import java.util.Scanner;

//Этот класс создан чтоб обьявить scanner и использовать его везде
public class Input {
    //Обьявляю статический scanner
    private static Scanner scanner = new Scanner(System.in);

    //Данный метод возвращает String и проверяет его на пустоту
    public static String inputLine() throws InvalidInputException {
        while(true){
            String insert = scanner.nextLine();
            if(insert.isEmpty()){
                throw new InvalidInputException("Поле не может быть пустым!");
            }
            return insert;
        }
    }

    //Данный метод возвращает Long и проверяет его значение, не ниже ли оно 0
    public static Long inputLong() throws InvalidInputException {
        //Обьявляю предусловный цикл в котором будет проверятся не ниже ли или не равны ли цифры веденные пользователем нулю.
        while(true){
            //Обьявляю переменную типа данных Long и приравневаю к scanner
             Long insertLong = scanner.nextLong();
             //Проверяю не равно ли или не меньше ли число веденные пользователем нулю
            if(insertLong <= 0){
                //Выбрасываю исключение если значение 0 или ниже
                throw new InvalidInputException("Значение не может быть 0 или ниже!");
                //Если пользователь вводит строку вместо чисел то выбрасываем ему исключение
            } else if(scanner.hasNextLine()){
                throw new InvalidInputException("Запрещен ввод букв и символов");
            }

            return insertLong;
        }
    }
}
