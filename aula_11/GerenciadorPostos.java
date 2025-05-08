package aula_11;
import java.util.ArrayList;

public class GerenciadorPostos {
    private ArrayList<Posto> postos;

    public GerenciadorPostos() {
        postos = new ArrayList<>();
    }

    public void adicionaPosto(Posto p) {
        postos.add(p);
    }

    public ArrayList<Posto> listaPostosProximos(Circulo c) {
        ArrayList<Posto> proximos = new ArrayList<>();
        for (Posto posto : postos) {
            Ponto localizacao = posto.getLocalizacao();
            boolean contido = c.estaContido(localizacao);
            if (contido) {
                proximos.add(posto);
            }
        }
        return proximos;
    }


}


