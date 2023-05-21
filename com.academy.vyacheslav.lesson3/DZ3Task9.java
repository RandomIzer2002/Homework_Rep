public class DZ3Task9 {
    public static void main(String[] args) {
        String sub = "";
        String k = "1";
        String zero= "";
        int i = 0;
        while(true){
            sub += Integer.toString(i * Integer.parseInt(k));
            i++;
            if(k.equals("1111") &&  i == 10){
                break;
            }
            if (i == 10){
                k += 1;
                i = 0;
                zero += '0';
                sub += zero; 
            }
        }

        System.out.println(sub);
    }
}
