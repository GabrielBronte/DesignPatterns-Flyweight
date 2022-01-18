
import java.util.ArrayList;
import java.util.List;

public class Organization {
    private List<Fighter> fighters = new ArrayList<>();


    public void contratar(String fighterName, String weightCategory, float fightingWeight) {
        Weight weight = WeightFactory.getWeight(weightCategory, fightingWeight);
        Fighter fighter = new Fighter(fighterName,weight);
        fighters.add(fighter);
    }
    public List<String> obterFuncionarios() {
        List<String> exibicao = new ArrayList<>();
        for (Fighter fighter : this.fighters) {
            exibicao.add(fighter.toString());
        }
        return exibicao;
    }
}