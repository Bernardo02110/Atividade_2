public class Main {
    public static void main(String[] args) {

        Orcs orcs = new Orcs(32,23, "Milena ");
        Dragoes dragao = new Dragoes(100, 22, "Bernardo ");
        Bruxas bruxas = new Bruxas(120, 54, "Leonardo ");

        System.out.println(orcs.atacar());
        System.out.println(dragao.atacar());
        System.out.println(bruxas.atacar());

    }
}