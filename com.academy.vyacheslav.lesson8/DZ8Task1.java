import java.util.Scanner;

public class DZ8Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String consistency = scanner.nextLine();

        if(consistency.startsWith("abc")){
            System.out.println(consistency.replace("abc", "www"));
        } else {
            System.out.println(consistency + "zzz"); 
        }
        scanner.close();
    }
}
