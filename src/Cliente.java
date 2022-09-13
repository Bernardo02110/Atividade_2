import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente {

    ArrayList<Personagens> tab = new ArrayList<>();

    Cliente(ArrayList<Personagens> personagens){
        this.tab = personagens;
    }

    public void ataque(Personagens x){
        System.out.println(x.atacar());
    }
}
