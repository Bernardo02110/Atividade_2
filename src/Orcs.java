public class Orcs extends Personagens{

    private double peso;

    public Orcs(double pontos, double peso, String nome) {
        this.pontos = pontos;
        this.peso = peso;
        this.nome = nome;
    }
    @Override
    public String atacar(){
        double ataque;

        ataque = this.pontos * this.peso;

        return nome + ataque;
    }
}
