package JavaEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Persons{
    int age;
    String name;
    Persons(int age,String name){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class maxage {
    public static void main(String []args){
        List<Persons> oldest= Arrays.asList(
                new Persons(50,"Raj"),
                new Persons(60,"Mahabir"),
                new Persons(45,"Basant"));
        Optional<Persons> result=oldest.stream()
                .max(Comparator.comparingInt(Persons::getAge));
        result.ifPresent (p->System.out.println(" oldest person: "
                 +p.getName()+" and " +" "+ "Age :" +p.getAge() ));
    }

}
