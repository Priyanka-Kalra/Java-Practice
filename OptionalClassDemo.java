
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Priyanka", "Abhishek", "Shomesh");

        // if we dont use Optional class,we may get Null point exception if our
        // condition isnt satisfied, so to avoid it we use optional class
        Optional<String> name = names.stream()
                .filter(n -> n.contains("Z"))
                .findFirst();

        System.out.println(name);
    }
}
