package lv.rvt;

public class decreasing {

    private int value;   // a variable that remembers the value of the counter

    public decreasing(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
       value--;
       if (value < 0) {
            value =0;
       }
       
    }
    public void reset(){
        value=0;
    }

    
}

