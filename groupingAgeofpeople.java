package JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// grouping age of peoples
class Person{
    int age;
    String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Name: " + name +" " + "age: " +age;
    }

    public int getAge(){
return age;
    }

    public String getName() {
        return name;
    }
}
public class groupingAgeofpeople {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person(20, "Ajay"),
                new Person(30, "Biswa"),
                new Person(50, "sumo"),
                new Person(20, "vijay"));
        Map<Integer, List<Person>> groupingbyage = people.stream().
                collect(Collectors.groupingBy(Person::getAge));

        groupingbyage.forEach((age, persons)
                -> {
            System.out.println("age" + age);
            persons.forEach(p -> System.out.println(" " + p.getName()));
        });
    }
}
