package lv.rvt;

public class Teacher extends Person {
private int salary;
private String initialName;
private String adress;
public Teacher(String initialName, String adress, int salary ){

    super(initialName, adress);
    this.salary = salary;
    this.initialName = initialName;
    this.adress = adress;

}
public String toString(){
    return initialName + "\n" + "  " + adress +  "\n" + "  " + "salary " + salary + "euro/month" ;
}
}
