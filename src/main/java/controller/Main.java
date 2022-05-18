package controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.City;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.getenv("path_to_file");
        CommandHandler commandHandler = new CommandHandler();
        ObjectMapper mapper = new ObjectMapper();
        HashSet<City> cities = new HashSet<>();
        Commands commands = new Commands();
        String jsonData = "";
        Scanner input;
        System.out.println("Type 'help' for help");
        try {
            File file = new File("file.json"); // change to env variable
            input = new Scanner(file);

            while (input.hasNextLine()) {
                jsonData += input.nextLine();
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            cities = mapper.readValue(jsonData, new TypeReference<HashSet<City>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        commands.setCities(cities);
        commandHandler.setCommands(commands);


        input = new Scanner(System.in);
        //reading commands
        while (true){
            String userCommand = input.nextLine();
            commandHandler.validateCommand(userCommand);
        }


    }


}
