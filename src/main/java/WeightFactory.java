import java.util.HashMap;
import java.util.Map;

public class WeightFactory {
    private static Map<String, Weight> weights = new HashMap<>();

    public static Weight getWeight(String category, float fightingWeight) {
        Weight weight = weights.get(fightingWeight);
        if (weight == null) {
            weight = new Weight(category, fightingWeight);
            weights.put(category, weight);
        }
        return weight;
    }

    public static int getTotalCargos() {
        return weights.size();
    }
}