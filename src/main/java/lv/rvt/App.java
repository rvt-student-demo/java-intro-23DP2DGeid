package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int numberN = 0;
        int numberW = 0; 
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            


            if (number == 0) {
                break;
                
            }
            else{
                numberN = number + number;
                numberW += 1;
                
            }
            
        }
        System.out.println("Number of numbers:" + numberW);
        System.out.println("Sum of the numbers:" + numberN);

        


    }
}

