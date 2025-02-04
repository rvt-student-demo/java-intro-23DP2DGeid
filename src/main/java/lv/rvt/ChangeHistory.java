package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    ArrayList<Double> history;
    public ChangeHistory(){
        ArrayList<Double> history;
    }
    public void add(double status){
        history.add(status);
    }
    public void clear(){
        history.clear();
    }
    public String toString(){
        return String(history);
    }
    public double maxValue(){
     
    }

}
