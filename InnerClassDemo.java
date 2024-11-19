class A{//cant make static outer class

    public void show(){
        System.out.println("In A show");
    }

    //static inner class
    // static class B{
    //     public void config(){
    //         System.out.println("In B");
    //     }
    // }
    
    class B {
        public void config() {
            System.out.println("In B");
        }
    }
}

public class InnerClassDemo {

    
    public static void main(String[] args) {
        
        A obj =new A();
        obj.show();

        // static inner class
        // A.B obj1 = new A.B();

        //inner class
        A.B obj1=obj.new B();

        obj1.config();

    }
}
