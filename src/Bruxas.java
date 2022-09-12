public class Bruxas extends Personagens{

    public Bruxas(double pontos, double vitalidade, String nome) {
        this.pontos = pontos;
        this.vitalidade = vitalidade;
        this.nome = nome;
    }

    @Override
    public String atacar(){
        double ataque;

        ataque = this.pontos / this.vitalidade;

        return nome + ataque;
    }


}
