package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Times ?");

        int reiz = Integer.valueOf(scanner.nextLine());



            printUntilNumber(reiz);
         


        scanner.close();

    }


    public static void printUntilNumber(int number){
        int num = 0;
        while (num < number) {
            System.out.println(num+=1);       
        }
    }
}