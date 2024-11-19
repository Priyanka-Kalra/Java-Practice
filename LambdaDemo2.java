//functional Interfaces
//lambda Expressions
//Annotations

//refer FunctionalInterfaceDemo.java

@FunctionalInterface
interface A {

    int sum(int i,int j);

}
public class LambdaDemo2 {
    public static void main(String[] args) {

        A obj=(int i, int j) -> i+j;

        System.out.println(obj.sum(3, 7));
        
    }
}
