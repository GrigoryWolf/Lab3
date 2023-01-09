package Skills;
import Person.Person;

import java.util.ArrayList;

public class Hire{
    public static void skill(Person employer, ArrayList<Person> employes){
        System.out.println(employer.getName() + " начинает отбор кандидатов");
        for(int i = 0; i<employes.size(); i++){
            if(employes.get(i).isHereToBeHired()==false){
                System.out.println(employes.get(i).getName()+" не собирается работать. Видимо попал в очередь случайно ");
                continue;
            }
            System.out.println(employer.getName() + " рассматривает кандидатуру " + employes.get(i).getName() + ". Возраст: " + employes.get(i).getAge()+ " Состояние здоровья: "+ employes.get(i).getType());
            String answer = employes.get(i).isWorkable() ? "" : " не";
            System.out.println(employes.get(i).getName()+answer+" принят(а) на работу");

        }
        System.out.println(employer.getName() + " заканчивает отбор кандидатов");

    }
}
