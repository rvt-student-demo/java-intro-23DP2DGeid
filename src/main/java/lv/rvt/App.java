package lv.rvt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App 
{
     public static void main(String[] args) throws Exception  { 
        ArrayList<Persom> persoms = PersomManager.getPersomList();

        for (Persom persom : persoms) {
            System.out.println(persom);

          }

			
}
}