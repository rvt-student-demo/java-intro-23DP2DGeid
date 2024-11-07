package lv.rvt;

public class Statistics {
    private int count = 0;
    
    int number = 0;
    public Statistics() {
        
    }

    public void addNumber(int number) {
        this.number += number;
        count++;


    }

    public int getCount() 
    {
        return count;
    }
}
