public class DZ9Task1 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);
        System.out.println(genericIntArray.getElement(2)); // 3
        System.out.println(genericIntArray.getElement(5)); // IndexOutOfBoundsException

        String[] strArray = {"one", "two", "three"};
        GenericArray<String> genericStrArray = new GenericArray<>(strArray);
        System.out.println(genericStrArray.getElement(1)); // two
    }
}
