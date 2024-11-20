package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class PersomManager {
    public static ArrayList<Person>getPersomList() throws IOException{
        BufferedReader reader = Helper.getReader("persom.csv");
        
        ArrayList <Person> persomList = new ArrayList();
        reader.readLine();
        String list;
        while ((list = reader.readLine()) != null) {
            String[] parts = list.split(", ");
            Person nam = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persomList.add(nam);
        }
                return persomList; 

    }
    public static void addPersom(Person persom) throws Exception{
        
    }
}
