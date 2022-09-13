import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Orcs orcs = new Orcs(32,23, "Milena ");
        Dragoes dragao = new Dragoes(100, 22, "Bernardo ");
        Bruxas bruxas = new Bruxas(120, 54, "Leonardo ");

        ArrayList<Personagens> tab = new ArrayList<>();

        tab.add(orcs);
        tab.add(dragao);
        tab.add(bruxas);

        Cliente jogo = new Cliente(tab);

        jogo.ataque(orcs);
        jogo.ataque(dragao);
        jogo.ataque(bruxas);

    }
}