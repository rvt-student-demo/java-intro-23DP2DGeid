package lv.rvt;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        Statistics statistics = new Statistics();
        int number = 0;
        int even = 0;
        int odd = 0;
        while (number != -1) 
        {
            statistics.addNumber(number);
            if (number % 2 == 0) {
                even += number;
            }
            else{
                odd += number;
            }
            number = scan.nextInt();

            
        }
        
        

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
    
}