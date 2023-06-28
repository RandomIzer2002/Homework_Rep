public class DZ15Task3 {
    public static Integer value;

    public static void main(String[] args) throws InterruptedException {
        value = 0;

        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Значение value: " + value);
    }
}