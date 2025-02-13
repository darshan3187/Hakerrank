package class_learning_java;


class Mythread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("thread1 is running");
            System.out.println("I am happy");
        }
    }
}

class Mythread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("thread2 is not running");
            System.out.println("I am sad");
        }
    }
}

public class L1{
    public static void main(String[] args) {
        Mythread1 thread1 = new Mythread1();
        Mythread2 thread2 = new Mythread2();
        thread1.start();
        thread2.start();

    }
}
