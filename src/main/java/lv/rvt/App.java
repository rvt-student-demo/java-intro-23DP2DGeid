package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App 
{
    public static void printPersons(ArrayList<Person> persons){
        System.out.println(persons);

    }
    public static void main(String[] args)  {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
        
    }
}