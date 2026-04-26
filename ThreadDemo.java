//class 'Threads' implements 'Runnable' interface. to faciliate multi-inheritance we use interface(Runnable) directly

// class A extends Thread {
// class C1 implements Runnable {

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             try {
//                 System.out.println("Hiiiii...");
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
// class C2 implements Runnable {

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             try {
//                 System.out.println("Hellooo...");
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadDemo {
    public static void main(String[] args) {

        // extends class
        // C1 obj1 = new C1();
        // C2 obj2 = new C2();
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());
        // obj1.start();
        // onj2.start();

        // Implements Runnable
        // Runnable obj1 = new C1();
        // Runnable obj2 = new C2();

        // Implements Runnable using lambda expression, here runnable is functional interface`
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    System.out.println("Hiiiii...");
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    System.out.println("HELLOOOO...");
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
