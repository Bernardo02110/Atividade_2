public class Dragoes extends Personagens{

    double distancia;

    public Dragoes(double pontos, double distancia, String nome) {
        this.pontos = pontos;
        this.distancia = distancia;
        this.nome = nome;
    }

    @Override
    public String atacar(){
        double ataque;

        ataque = this.pontos / this.distancia;

        return nome + ataque;
    }
}
