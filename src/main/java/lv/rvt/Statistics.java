package lv.rvt;

public class Statistics {
    private int count = 0;
    int numbers = 0;
    
    public Statistics() {
        
    }

    public void addNumber(int number) {
        this.numbers += number;
        count++;


    }

    public int getCount() 
    {
        return count;
    }

    public int sum() 
    {
      return numbers;
    }

    public double average() {
        return Double.valueOf(numbers)/count;
    }
}
