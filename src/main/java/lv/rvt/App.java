package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int fact = Integer.valueOf(scanner.nextLine());
        int ans = 1;
        if(fact == 0)
        {
            System.out.println(1);
            return;
            
        }

        for(int factorial = 1; fact + 1 > factorial ; factorial++)
        {
            ans *= factorial;
        }
        System.out.println(ans);



        scanner.close();
    }
}