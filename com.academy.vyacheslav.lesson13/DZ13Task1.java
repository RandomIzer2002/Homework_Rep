import java.util.ArrayList;
import java.util.List;

public class DZ13Task1 {
    public static void main(String[] args) {
        List<FoodType> foods = new ArrayList<>();
        foods.add(FoodType.FRUIT);
        foods.add(FoodType.UNKNOWN);

        FoodChecker foodChecker = new FoodChecker();
        boolean isVegetarian = foodChecker.isVegetarian(foods);

        System.out.println("Ингредиент вегетерианский?  Ответ: " + isVegetarian);
    }
}