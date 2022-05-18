package controller;

import entity.City;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CommandHandler {
    private Commands commands;
    //валидация комманды
    public void validateCommand(String command){
        command = command.trim();
        String[] commandElements = command.split(" ", 2);
        String commandName = commandElements[0];

        executeCommand(commandName);
    }
    public void executeCommand(String command){
        switch (command){
            case "help":
                System.out.println("\nhelp\ninfo\nshow\nadd\nupdate\nremove\nclear\nsave\nexecute script\nexit\nadd if max\nadd if min\nremove greater\nsum of car code\nprint ascending\nprint field descending governor");
                break;

            case "info":
                System.out.println(commands.info());
                break;

            case "exit":
                commands.exit();
                break;

            case "clear":
                commands.clear();
                break;

            case "show":
                commands.show();
                break;

            case "add":
                switch (command){
                    
                }

            default:
                System.out.println("Такой команды не существует");
                break;
        }

    }


}
