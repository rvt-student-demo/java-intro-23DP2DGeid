package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if (points < 0)
        {
            System.out.println("Grade: Impossible");

        }
        else if (points > 0 && points < 50 )
        {
            System.out.println("Grade: failed");

        }
        else if (points >=  50 && points < 60 )
        {
            System.out.println("Grade: 1");

        }
        else if (points >= 60 && points < 70 )
        {
            System.out.println("Grade: 2");

        }
        else if (points >= 70 && points < 80 )
        {
            System.out.println("Grade: 3");

        }
        else if (points >= 80 && points < 90 )
        {
            System.out.println("Grade: 4");

        }
        else if (points >= 90 && points <= 100 )
        {
            System.out.println("Grade: 5");

        }
        else if (points > 100 )
        {
            System.out.println("Grade: incredible!");

        }


        scanner.close();
    }
}

