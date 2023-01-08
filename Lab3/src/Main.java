import Filled.*;
import Filling.*;
import Person.*;
import Place.*;
import Skills.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Street garbage = new Street("Мусорный тупичок", "заполненный макаронными автофургонами", 123, 12);
        Street ghetto = new Street("Трущобная улица", "заполненный макаронными автофургонами", 123, 53);
        Street hotel = new Street("двор гостинницы Дрянинга", 234, 23);

        ArrayList<Street> way = new ArrayList<>();
        way.add(garbage);
        way.add(ghetto);
        way.add(hotel);

        Food sausages = new Food("сосиски");
        Food bread = new Food("хлеб");
        Furniture table = new Furniture("деревянный стол");
        Furniture sit1 = new Furniture("первый стул");
        Furniture sit2 = new Furniture("второй стул");
        Item jornal = new Item("Макаронный журнал");

        ArrayList<Filling> first_van_filling = new ArrayList<>();
        first_van_filling.add(sausages);
        first_van_filling.add(bread);

        ArrayList<Filling> second_van_filling = new ArrayList<>();
        second_van_filling.add(table);
        second_van_filling.add(sit1);
        second_van_filling.add(sit2);

        ArrayList<Filling> manager_bag_filling = new ArrayList<>();
        manager_bag_filling.add(jornal);

        ArrayList<Filling> motorcycle_filling = new ArrayList<>();

        Person sausage_man = new Person("Сосисочник", Health.NORMAL, 45, false);
        Person scooperfield = new Person("Скуперфильд", Health.NORMAL, 68, false);
        Person manager = new Person("Управляющий", Health.NORMAL, 43, false);
        Person driver = new Person("Шофёр", Health.NORMAL, 23, false);
        Person legless_carl = new Person("Карл", Health.LEGLESS, 54, true);
        Person george = new Person("Гриша", Health.WEAK, 18, false);
        Person ann = new Person("Анюта", Health.NORMAL, 2, true);
        Person arnold = new Person("Арнольд", Health.NORMAL, 18, true);
        Person weak_henry = new Person("Генри", Health.WEAK, 38, true);

        ArrayList<Person> first_van_passangers = new ArrayList<>();
        first_van_passangers.add(sausage_man);
        ArrayList<Person> second_van_passangers = new ArrayList<>();
        second_van_passangers.add(driver);
        second_van_passangers.add(scooperfield);
        second_van_passangers.add(manager);
        ArrayList<Person> motorcycle_passangers = new ArrayList<>();
        motorcycle_passangers.add(george);
        ArrayList<Person> line = new ArrayList<>();
        line.add(legless_carl);
        line.add(george);
        line.add(ann);
        line.add(arnold);
        line.add(weak_henry);

        Vehicle first_van = new Vehicle("Первый", first_van_filling, first_van_passangers, "оранжевый", VehicleType.VAN, 1000,  1);
        Vehicle second_van = new Vehicle("Второй", second_van_filling, second_van_passangers, "оранжевый", VehicleType.VAN, 40, 1);
        Vehicle motorcycle = new Vehicle("Классный", motorcycle_filling, motorcycle_passangers, "чёрный", VehicleType.MOTORCYCLE, 12, 2);
        Bag manager_bag = new Bag("рюкзак", manager_bag_filling);

        Ride.skill(first_van, way);
        Ride.skill(second_van, way);
        Ride.skill(motorcycle, way);
        GetOut.skill(first_van);
        GetOut.skill(second_van);
        GetOut.skill(motorcycle);
        PutOut.skill(sausage_man, first_van);
        PutOut.skill(driver, second_van);
        PutOut.skill(manager, manager_bag);
        Hire.skill(manager, line);
    }
}