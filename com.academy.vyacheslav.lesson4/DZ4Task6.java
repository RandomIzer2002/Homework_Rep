import java.util.Arrays;

public class DZ4Task6 {
    public static void main(String[] args) {
        int[] arrae = { 3, 5, 1, 7, 9, 4, 2, 6, 8 };
        sort(arrae);
        System.out.println(Arrays.toString(arrae));
    }
    
    public static void sort(int[] arrae) {
        quickSort(arrae, 0, arrae.length - 1);
    }
    
    private static void quickSort(int[] arrae, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arrae[(left + right) / 2];
        int index = partition(arrae, left, right, pivot);
        quickSort(arrae, left, index - 1);
        quickSort(arrae, index, right);
    }
    
    private static int partition(int[] arrae, int left, int right, int pivot) {
        while (left <= right) {
            while (arrae[left] < pivot) {
                left++;
            }
            
            while (arrae[right] > pivot) {
                right--;
            }
            
            if (left <= right) {
                swap(arrae, left, right);
                left++;
                right--;
            }
        }
        
        return left;
    }
    
    private static void swap(int[] arrae, int i, int j) {
        int temp = arrae[i];
        arrae[i] = arrae[j];
        arrae[j] = temp;
    }
}
