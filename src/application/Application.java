package application;

import commandFabric.CommandHandler;
import utils.Input;

//Данный класс будет запускать наш проект
public class Application {
    //Обьявил переменную commandHandler
    private CommandHandler commandHandler;

    //Конструктор чтоб выдать значения обьекту commandHandler
    public Application() {
        commandHandler = new CommandHandler();
    }

    public void run(){
        System.out.println("Добро пожаловать в онлайн магазин 'MUSLIM'");

        try{
            while(true){
                System.out.print("Введите команду: ");
                commandHandler.findCommand(Input.inputLine());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
