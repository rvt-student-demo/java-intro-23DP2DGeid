package lv.rvt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App 
{
     public static void main(String[] args) throws Exception  { 
        BufferedReader reader = Utils.getReader("persom.csv");
        
        ArrayList <Persom> persomList = new ArrayList();

        int summ = 0;
        String list;

        reader.readLine();

        while ((list = reader.readLine()) != null) {
            String[] parts = list.split(", ");
            Persom nam = new Persom(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persomList.add(nam);
        }

        for (Persom element : persomList) {
            System.out.println(element);
            summ += element.getAge();

          }
          System.out.println("Vidējais vecums " + summ/4);
			
}
}