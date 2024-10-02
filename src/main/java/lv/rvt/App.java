package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Times ?");

        int reiz = Integer.valueOf(scanner.nextLine());



        while (reiz != 0) {
            printText();
            reiz = reiz -1;
        }


        scanner.close();

    }


    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");

    }
}