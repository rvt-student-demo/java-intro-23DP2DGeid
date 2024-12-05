package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App 
{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;

        System.out.println("Welcome to person manager, type \"help\" to see avaible commands. ");
        while (isProgramRunning) {
            String command = scanner.nextLine();
            if(command.equals("exit")){
                System.out.println("Thanks, bye bye!");
                isProgramRunning = false;
            } else if (command.equals("show")) {
                System.out.println(PersomManager.getPersomList());
                
            }else if (command.equals("add")){
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                System.out.println("Enter height:");
                int height = scanner.nextInt();;
                System.out.println("Enter weight:");
                int weight = scanner.nextInt();
                Person person = new Person(name, age, height, weight);
                PersomManager.addPerson(person);
                System.out.println("Person was added to the list");
            }else if(command.equals("help")){
                System.out.println("All possible commands: show - shows all users, add - adds user to the user list, exit - exits programm. ");

            }
            System.out.println("Your command was " + command);
        }
    }
}