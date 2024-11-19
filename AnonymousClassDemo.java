class A {

    public void show() {
        System.out.println("In A show");
    }
}

public class AnonymousClassDemo {

    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("In AnonymousClassDemo show");
            }
        };
        obj.show();

        A obj1=new A();
        obj1.show();

    }
}