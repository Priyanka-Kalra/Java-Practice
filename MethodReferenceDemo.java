
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("priyanka", "harsh", "vinay");

        List<String> uName = name.stream()
                .map(String::toUpperCase)
                .toList();

        uName.forEach(System.out::println);
    }
}
