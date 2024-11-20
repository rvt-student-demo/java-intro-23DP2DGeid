package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App 
{
     public static void main(String[] args) throws Exception 
    { 
        BufferedWriter writer =
        Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        
        writer.write("12, Admin");
        writer.newLine();
        writer.close();
    }
}