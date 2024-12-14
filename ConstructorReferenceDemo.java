import java.util.Arrays;
import java.util.List;

class Student {

    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + "]";
    }
    

}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Priyanka", "Harsh", "Vinay");

        List<Student> student = names.stream()
                .map(Student::new)
                .toList();

        System.out.println(student);

    }
}
