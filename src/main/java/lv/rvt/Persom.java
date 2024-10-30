package lv.rvt;

public class Persom {
    private int age;
    private String name;


    public Persom(String initialName){
        this.name = initialName;
    }
    public Persom(int age) {
        this.age = age;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    

}
