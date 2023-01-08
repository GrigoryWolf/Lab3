package Filled;

import Filled.Filled;
import Filling.Filling;
import Person.Person;

import java.util.ArrayList;

public class Vehicle extends Filled {
    private String color;
    private VehicleType type;
    private int fuel_reserve;
    private ArrayList<Person> passangers;
    private int fuel_consumption;

    public Vehicle(String name, ArrayList<Filling> filling, ArrayList<Person> passangers, String color, VehicleType type, int fuel_reserve, int fuel_consumption) {
        super(name, filling);
        this.color = color;
        this.type = type;
        this.fuel_reserve = fuel_reserve;
        this.passangers = passangers;
        this.fuel_consumption = fuel_consumption;
    }
    public String getColor() {
        return color;
    }

    public String getType() {
        switch (type) {
            case BUS:
                return "автобус";
            case CAR:
                return "машина";
            case VAN:
                return "автофургон";
            case MOTORCYCLE:
                return "мотоцикл";
            case TRUCK:
                return "грузовик";
            default:
                return "";

        }
    }

    public String getPassanges() {
        String local = "";
        for (int i = 0; i < passangers.size(); i++) {
            if (i == 0) {
                local += passangers.get(i).getName();
            } else {
                local += ", " + passangers.get(i).getName();
            }
        }
        return local;
    }
    public int getFuel(){
        return fuel_reserve;
    }
    public void setFuel(int fuel){
        fuel_reserve = fuel;
    }
    public int getFuel_consumption(){
        return fuel_consumption;
    }
    public boolean canRide() {
        return fuel_reserve > 0 ? true : false;
    }
}

