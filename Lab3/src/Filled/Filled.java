package Filled;

import Filling.Filling;

import java.util.ArrayList;

public abstract class Filled {
    private String name;
    private  ArrayList<Filling> filling;
    public Filled(String name, ArrayList<Filling> filling){
        this.name = name;
        this.filling = filling;
    }
    public String getName(){
        return name;
    }
    public String getFilling(){
        String local = "";
        for(int i = 0; i < filling.size(); i++){
            if(i == 0){
            local += filling.get(i).getName() ;}
            else{local += ", " + filling.get(i).getName() ;}

        }
        return local;
    }
}
