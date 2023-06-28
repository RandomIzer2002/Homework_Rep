import java.util.Arrays;

public class DZ15Task2 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySum arraySum = new ArraySum();
        
        // Разделение массива на две половины
        int mid = array.length / 2;
        int[] firstHalf = Arrays.copyOfRange(array, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(array, mid, array.length);
        
        // Создание и запуск двух потоков
        Thread thread1 = new Thread(() -> {
            int sum = arraySum.sum(firstHalf);
            System.out.println("Первая половина массива: " + sum);
        });
        
        Thread thread2 = new Thread(() -> {
            int sum = arraySum.sum(secondHalf);
            System.out.println("Вторая половина массива: " + sum);
        });
        
        thread1.start();
        thread2.start();
        
        // Ожидание завершения потоков
        thread1.join();
        thread2.join();
        
        // Подсчет общей суммы
        int totalSum = arraySum.sum(firstHalf) + arraySum.sum(secondHalf);
        System.out.println("Общая сумма: " + totalSum);
    }
}
