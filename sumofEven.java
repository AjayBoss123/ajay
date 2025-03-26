package JavaEight;

import java.util.Arrays;
import java.util.List;
//find the sum for all the square of even number in the list
public class sumofEven {
    public static void main(String [] args){
        List<Integer> list= Arrays.asList(2,5,3,6,4,75);
        int result=list.stream()
                .filter(c->c%2==0)
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println(result);


    }
}
