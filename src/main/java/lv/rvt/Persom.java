package lv.rvt;


public class Persom {
    private int age;
    private String name;
    private int heigth;
    private int weigth;

    public int getAge()
    {
        return age;
    }

    public Persom(String initialName, int age, int weigth, int heigth){
        this.name = initialName;
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
    }
    public String toString(){
        return this.name + " " +  this.age + " " +this.weigth  + " " + this.heigth ;
    }


    

}

