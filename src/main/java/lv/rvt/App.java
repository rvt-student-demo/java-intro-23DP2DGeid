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
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); 
        juice.addToWarehouse(1.0);
        System.out.println(juice);   
        
    }
}