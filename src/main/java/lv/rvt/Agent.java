package lv.rvt;

import javax.print.DocFlavor.STRING;

public class Agent {
    private String name;
    private String surname;
    
    public Agent(String name, String surname){
        this.name = name  ;
        this.surname = surname;


    }

    public String toString(){
        return this.name + " " + this.surname;
    }

};

