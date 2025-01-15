package lv.rvt;


public class Person {
    private String initialName;
    private String adress;

  
    public Person(String initialName, String adress){
        this.initialName = initialName;
        this.adress = adress;
        
    }
    public String toString() {
        return this.initialName + "\n"+ " " + this.adress;
        
    }

    


    

}

