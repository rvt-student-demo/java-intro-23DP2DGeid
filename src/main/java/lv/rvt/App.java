package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers");
        int rep = 0;
        float sum = 0;
        float num = 0;
        int even = 0;
        int odd = 0;
        while (rep != -1) {
            rep = Integer.valueOf(scanner.nextLine());
            if(rep == -1){
                break;
            }
            
            sum =  sum + rep;
            num++;
            if (rep % 2 == 0 && rep >= 0) {
                even++;
                
            }
            else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers:" + num);
        System.out.println("Average:"+ (sum/num));
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
        

        scanner.close();

    }
}