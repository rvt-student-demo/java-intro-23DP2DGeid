package lv.rvt;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args)
    {
        Product nam = new Product("banan",1.3, 5 );
        decreasing dec = new decreasing(100);
        //nam.printProduct();
        dec.printValue();
        dec.decrement();
        dec.reset();
        dec.printValue();
        dec.decrement();
        dec.printValue();
    }
    
}