public class Fighter {
    private String nome;
    private Weight weight;

    public Fighter(String nome, Weight weight) {
        this.nome = nome;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "Nome='" + nome + '\'' +
                ", Peso='" + weight.getWeight() + " kg" +'\'' +
                ", Categoria='" + weight.getCategory() + '\'' +
                '}';
    }
}