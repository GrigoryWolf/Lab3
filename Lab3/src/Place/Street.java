package Place;

import Place.Placeable;

public class Street implements Placeable {
    private String name;
    private String description;
    private int x;
    private int y;
    public Street(String name, String description, int x, int y){
        this.name=name;
        this.description=description;
        this.x=x;
        this.y=y;
    }
    public Street(String name, int x, int y){
        this.name=name;
        this.description = "";
        this.x=x;
        this.y=y;
    }
    public String getName(){
        return name;}
    public String getDescription(){
        return description;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
