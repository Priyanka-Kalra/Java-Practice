
//refer ComparatorDemo.java
import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Predicate<Integer> p =  t->t%2==0;

        int result = nums.stream()
                .filter(n -> n % 2 == 0)// returns a stream
                // .filter(p) //implementaion of predicate in filter
                .map(n -> n * 2)// returns a stream
                .reduce(0, (c, e) -> c + e);// returns int/declared type here integer

        System.out.println(result);
    }
}
