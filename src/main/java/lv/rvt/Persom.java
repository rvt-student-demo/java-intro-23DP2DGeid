package lv.rvt;

public class Persom {
    private int age;
    private String name;
    private int heigth;
    private int weigth;

    public Persom(String initialName, int age, int weigth, int heigth){
        this.name = initialName;
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    

}
