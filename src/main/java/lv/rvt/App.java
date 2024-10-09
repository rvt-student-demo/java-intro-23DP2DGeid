package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int hundred = Integer.valueOf(scanner.nextLine());

        while (hundred<=100) {
            System.out.println(hundred);
            hundred++;
        }
scanner.close();
    }
}