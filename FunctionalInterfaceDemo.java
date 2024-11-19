//functional Interfaces
//lambda Expressions
//Annotations

@FunctionalInterface
interface  A {

    void show(int i);

}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        //because we are using a functional interface, we are sure of having only method
        //so instead of typing out whole code line of declaring the function, we just describe it here, in line 19

        A obj=(int i)->System.out.println("Lambda Expressions :"+i);
        // A obj = i -> System.out.println("Lambda Expressions :" + i);   bcz only one argument

        obj.show(5);
    }
}
