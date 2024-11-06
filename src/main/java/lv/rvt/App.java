package lv.rvt;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args)
    {
        Product nam = new Product("banan",1.3, 5 );
        decreasing dec = new decreasing(100);
        Agent bond = new Agent("James", "Bond");
        
        bond.toString(); //Prints Nothing

        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");

        System.out.println(ionic);

    }
    
}