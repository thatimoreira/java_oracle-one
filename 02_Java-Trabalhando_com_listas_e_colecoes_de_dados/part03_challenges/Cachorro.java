package part03_challenges;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
}
