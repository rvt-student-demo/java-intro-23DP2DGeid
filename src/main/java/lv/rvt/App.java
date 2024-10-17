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
        int round = 0;
        int win = 0;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");
        
        while (round != 10) {
           

            int number = rand.nextInt(10);
            tries = 0;
            System.out.println("I am thinking of a number from 1 to 10.");
            System.out.println("You must guess what it is in three tries.");
            System.out.println("Enter a guess:");
            while (true) {
                
            
            
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == number) {
                System.err.println("RIGHT!");
                win++;
                round++;
                System.out.println("You have won " + win + "out of " + round + " rounds.");
                if (round == 10) {
                    break;
                    
                }
                break;


            }
            else if (guess != number) 
            {       
                if (tries == 2) {
                    round++;
                    System.out.println("wrong");
                    System.out.println("The correct number was " + number);
                    System.out.println("You have won " + win + "out of " + round + " rounds.");
                    if (round == 10) {
                        break;
                    }
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
        }
    
        
    if (win < 7) {
        System.out.println("Your rating: amateur.");
    }
    else if (win == 8) {
        System.out.println("Your rating: advanced.");
        
    }
    else if (win == 9) {
        System.out.println("Your rating: professionals.");
        
    }
    else if (win == 10) {
        System.out.println("Your rating: hackers.");
        
    }






        scanner.close();

    }

    
}