package lv.rvt;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tries = 0;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        int number = rand.nextInt(10);
        while (tries < 3) {
            int guess = Integer.valueOf(scanner.nextLine());
             
            if (guess == number) {
                System.err.println("RIGHT!");
                System.out.println("You have won the game.");
                break;
            }
            else if (guess != number) 
            {       
                if (tries == 2) {
                    System.out.println("wrong");
                    System.out.println("The correct number was " + number);
                    System.out.println("You have lost the game.");
                    break;
                
                }
                else if (guess == number - 2 || guess-2 == number) {
                    System.out.println("warm");
                }
                else if (guess == number - 1 || guess-1 == number) {
                    System.out.println("hot");
                }
                else{
                    System.out.println("cold");
                }
            }
            tries++;

        }
        





        scanner.close();

    }


}