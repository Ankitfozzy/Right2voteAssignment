import java.util.ArrayList;
import java.util.List;

public class ClothingCombinations {

    public static void main(String[] args) {
        double budget = 600.00;
        double tShirtPrice = 50.00;
        double jeansPrice = 80.00;
        double jacketPrice = 100.00;

        // Finding the maximum number of each item that can be purchased
        int maxTShirts = (int) (budget / tShirtPrice);
        int maxJeans = (int) (budget / jeansPrice);
        int maxJackets = (int) (budget / jacketPrice);

        // Declaring a List of List(Integer) to store all the combinations
        List<List<Integer>> combinations = new ArrayList<>();

        // Generating all the possible combinations
        for(int tShirts = 1; tShirts <= maxTShirts; tShirts++) {
            for(int jeans = 1; jeans <= maxJeans; jeans++) {
                for(int jackets = 1; jackets <= maxJackets; jackets++) {
                    double totalCost = (tShirts * tShirtPrice) + (jeans * jeansPrice) + (jackets * jacketPrice);
                    double remainingBudget = budget - totalCost;
                    if(totalCost <= budget && remainingBudget <= tShirtPrice) {
                        List<Integer> combination = new ArrayList<>();
                        combination.add(tShirts);
                        combination.add(jeans);
                        combination.add(jackets);
                        combinations.add(combination);
                    }
                }
            }
        }

        // Printing all the valid combinations
        for(List<Integer> combination : combinations) {
            System.out.println("T-shirts: " + combination.get(0)
                    + ", Jeans: " + combination.get(1)
                    + ", Jackets: " + combination.get(2));
        }
    }
}
