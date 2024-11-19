abstract class A {

    abstract public void show();
}

public class AbstractAnonymousClassDemo {

    public static void main(String[] args) {

        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In main :)");
            }
        };
        obj.show();

    }
}