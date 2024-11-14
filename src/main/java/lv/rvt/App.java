package lv.rvt;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args)
    {
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
}
}