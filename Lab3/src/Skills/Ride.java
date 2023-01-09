package Skills;
import Filled.Vehicle;
import Place.Street;
import java.util.ArrayList;

public class Ride{
    public static void skill(Vehicle vehicle, ArrayList<Street> way){
        String move;
        int distance;
        int previous_x = 0;
        int previous_y = 0;
        for(int i = 0; i < way.size(); i++){
            if(vehicle.canRide() == false){
                System.out.println(vehicle.getName()+" "+vehicle.getColor()+" "+vehicle.getType()+ " остановился по причине нехватки топлива. "+ vehicle.getPassanges() + " дотолкал(-и) транспорт до локации "+ way.get(way.size()-1).getName());
                break;
            }
            if(i==0){move = " начал движение в локации ";}
            else if(i == way.size()){move = " остановился в локации ";}
            else{move = " проезжает локацию ";}
            System.out.println(vehicle.getName()+" "+vehicle.getColor()+" "+vehicle.getType()+ move + way.get(i).getName()+"("+ way.get(i).getX() + ", "+ way.get(i).getY() + ") "+way.get(i).getDescription());
            distance = Math.toIntExact(Math.round(Math.pow(Math.pow(way.get(i).getX() - previous_x, 2) + Math.pow(way.get(i).getY() - previous_y, 2), 0.5)*0.1));
            vehicle.setFuel(vehicle.getFuel() - distance * vehicle.getFuel_consumption());
            previous_x = way.get(i).getX();
            previous_y = way.get(i).getY();

        }
    }
}
