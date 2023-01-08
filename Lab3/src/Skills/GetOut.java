package Skills;

import Filled.Vehicle;

public class GetOut implements Skill {
    public static void skill(Vehicle vehicle){
        System.out.println("Из транспорта " + vehicle.getName() + " " + vehicle.getColor() + " " + vehicle.getType() + " выходит(-ят) " + vehicle.getPassanges());
    }
}
