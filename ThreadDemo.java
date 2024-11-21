class A extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                System.out.println("Hiiiii...");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                System.out.println("Hellooo...");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
