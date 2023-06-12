public class DZ9Task2 {
    public static void main(String[] args){
        int theFirst = 20;
        int theSecond = 12;
        Pair<Integer> twoValues = new Pair<>(theFirst, theSecond);
        System.out.println("Первый элемент: " + twoValues.first() + ", второй элемент:" + twoValues.second());
        
        twoValues.swap();
        System.out.println("Первый элемент: " + twoValues.first() + ", второй элемент:" + twoValues.second());
        
        twoValues.replaceFirst(5);
        twoValues.replaceLast(10);
        System.out.println("Первый элемент: " + twoValues.first() + ", второй элемент:" + twoValues.second());
        
        twoValues.swap();
        System.out.println("Первый элемент: " + twoValues.first() + ", второй элемент:" + twoValues.second());
    }
}
