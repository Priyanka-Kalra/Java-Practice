interface A {

    int area=10;
    void show();

    void config();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

}

public class InterfacesDemo {

    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);//we can access variables of interface without having to declare obj
    }
}
