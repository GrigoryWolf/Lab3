package Person;

public class Person implements Ageable {
    private String name;
    private Health type;
    private int age;
    private boolean isHereToBeHired;
    public Person(String name, Health type, int age, boolean isHereToBeHired){
        this.name = name;
        this.type = type;
        this.age = age;
        this.isHereToBeHired = isHereToBeHired;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        switch (type){
            case LAME: return "хромой";
            case LEGLESS: return "безногий";
            case ARMLESS: return "безрукий";
            case SICK: return "больной";
            case WEAK:return "слабосильный";
            case NORMAL:return "нормальный";
            default:return null;
        }

    }
    public boolean isHereToBeHired(){
        return isHereToBeHired;
    }
    public boolean isWorkable(){
        if (age <= 80 & age >= 18 & type == Health.NORMAL){
            return true;
        }
        else{
            return false;
        }
    }
}
