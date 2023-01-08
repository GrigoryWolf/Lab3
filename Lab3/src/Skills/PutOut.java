package Skills;
import Filled.Filled;
import Person.Person;
public class PutOut implements Skill{
    public static void skill(Person person, Filled filled){
        System.out.println(person.getName() + " достаёт из " + filled.getName() + " " + filled.getFilling());
    }
}
