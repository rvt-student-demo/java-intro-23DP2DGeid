package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;
        String group;
        System.out.println("Ievade savu vārdu: ");
        name=scanner.nextLine();
        System.out.println("Ievade savu uzvārdu: ");
        surname = scanner.nextLine();
        System.out.println("Ievade savu grupu: ");
        group = scanner.nextLine();

        
        System.out.println("Jūsu atbilde: ");
        System.out.println(name + " " + surname+ " " + group);
    scanner.close();
    }

}
