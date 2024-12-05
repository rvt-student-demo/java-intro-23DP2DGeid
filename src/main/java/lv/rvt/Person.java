package lv.rvt;


public class Person {
    private int age;
    private String name;
    private int heigth;
    private int weigth;
    private int weighings;


    public Person(String initialName, int age, int heigth, int weigth){
        this.name = initialName;
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
       
    }
    public int getWeight(){
       return weigth;
    }
    public int feeds(){
        return this.weigth++;
    }
 
    public int getAge()
    {
        return age;
    }
    
    public String toString(){
        return this.name + " " +  this.age + " " +this.weigth  + " " + this.heigth ;
    }

    public String getName() {
        return name;
    }


    

}

