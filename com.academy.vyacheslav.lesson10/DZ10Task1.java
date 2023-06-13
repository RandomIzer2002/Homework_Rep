public class DZ10Task1 {
    public static void main (String[] args){
        String s = null;
        
        try{
        if (Math.random() > 0.5) {
            s.length();
        } else {
            Integer.parseInt(s);
        }
        } catch(NullPointerException e) {
            System.out.println("NullPointerException was thrown");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException was thrown");
            e.printStackTrace();
        }
    }
}