package lv.rvt;

public class Student extends Person {
private int credits;
private String initialName;
private String adress;


    public Student(String initialName, String adress ){

        super(initialName, adress);
        this.initialName = initialName;
        this.adress = adress;
    }

    public int credits(){
        return credits;
    }
    public int study(){
        
        return credits++;

    }
    public String toString(){
        return initialName + "\n" + "  " + adress +  "\n" + "  " + "Study credits " + credits;
    }
    

}
