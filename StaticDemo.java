class Mobile {

    int price;
    String brand;
    static String phoneType;

    public Mobile(int pric, String mobBrand, String mobType) {

        price = pric;
        brand = mobBrand;
        phoneType = mobType;

    }

    //we can call a static block to initialise static variables. it is only called once, and is called first(when classloader loads the class)
    // static{
    //     phoneType="Smartphone";
    // }

    public void printSpecifics() {

        System.out.println(brand + ": " + phoneType);

    }
}

public class StaticDemo {
    public static void main(String args[]) {

        Mobile obj1 = new Mobile(0, "Samsung", "Smartphone");
        obj1.printSpecifics();

        Mobile obj2 = new Mobile(0, "Appke", "Network Phone");
        obj1.printSpecifics();
        obj2.printSpecifics();
        System.out.println(Mobile.phoneType);

        // Class.forName("Mobile");
        //this will load the class even if we dont initialise any object of the class, so static block will be called
    }
}
