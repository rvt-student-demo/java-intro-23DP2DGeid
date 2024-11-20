package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class PersomManager {
    public static ArrayList<Persom>getPersomList() throws IOException{
        BufferedReader reader = Helper.getReader("persom.csv");
        
        ArrayList <Persom> persomList = new ArrayList();
        reader.readLine();
        String list;
        while ((list = reader.readLine()) != null) {
            String[] parts = list.split(", ");
            Persom nam = new Persom(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persomList.add(nam);
        }
                return persomList; 


    }
}
