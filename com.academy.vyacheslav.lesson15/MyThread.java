public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            synchronized (DZ15Task3.value) {
                DZ15Task3.value++;
            }
            if (i % 10 == 0) {
                throw new RuntimeException("Поток прерван");
            }
        }
    }
}