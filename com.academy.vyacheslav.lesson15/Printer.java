public class Printer {
    public void print(String text) {
        synchronized (System.out) {
            System.out.println(text);
        }
    }
}
