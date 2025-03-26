package JavaEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondLargestnumber {
    public static void main(String args []){
    List<Integer> list= Arrays.asList(0,0,0,1,2,3,4);
    Optional secondlargestno=list.stream()
            .sorted(Comparator.reverseOrder())
            .distinct()
            .skip(5)
            .findFirst();
    secondlargestno.ifPresent(System.out::println);

        Integer reduce = list.stream().reduce(0, (a, b)-> a + b);
        System.out.println(reduce);
    }
}
