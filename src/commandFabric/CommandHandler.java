package commandFabric;

import commandFabric.Commands.Register;

import java.util.HashMap;
import java.util.Map;

//Данный класс будет содержать в себе список команд и выполнять их
public class CommandHandler {
    //Обьявил структуру данных ключ значение, которая будет хранить название команды и их класс
    private Map<String, CommandOrder> commands;

    //Конструктор чтоб инициализировать переменную commands
    public CommandHandler() {
        commands = new HashMap<String, CommandOrder>();
        initialize();
    }

    //метод который будет ложить значения в commands
    public void initialize(){
        commands.put("register", new Register());
    }

    //Метод который будет находить команду по его названию
    public void findCommand(String command){
        if(commands.containsKey(command)){
            commands.get(command).execute();
        }

        System.out.println("Команда не найдена!");
    }
}
