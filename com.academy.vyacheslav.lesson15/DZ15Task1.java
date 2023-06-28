public class DZ15Task1 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> printer.print("Thread 1 says hello!"));
        Thread thread2 = new Thread(() -> printer.print("Thread 2 says hi!"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
