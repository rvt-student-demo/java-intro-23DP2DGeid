package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter range: From how much");

        int range = Integer.valueOf(scanner.nextLine());

        System.out.println("To how much");

        int range2 = Integer.valueOf(scanner.nextLine());


            divisibleByThreeInRange(range, range2);
         


        scanner.close();

    }


    public static void divisibleByThreeInRange(int beginning, int end){

        for(int reiz = beginning; end + 1 > reiz; reiz++){

            if (reiz % 3 == 0) {
                System.out.println(reiz);
                
            }

        } 
        

    }
}