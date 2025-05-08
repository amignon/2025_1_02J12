package aula_11;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        GerenciadorPostos postos = new GerenciadorPostos();

        Ponto p1 = new Ponto(3, 5);
        Posto posto1 = new Posto("Mack1", "BR", p1);
        postos.adicionaPosto(posto1);

        postos.adicionaPosto(
            new Posto("Mack2", "Ipiranga", new Ponto(90, 65)));
        postos.adicionaPosto(
            new Posto("Mack3", "Shell", new Ponto(1, 1)));
        postos.adicionaPosto(
            new Posto("Mack4", "BR", new Ponto(40, 60)));
        postos.adicionaPosto(
            new Posto("Mack5", "Ipiranga", new Ponto(1, 1)));

        Circulo c = new Circulo(new Ponto(3, 4), 4);

        ArrayList<Posto> proximos = postos.listaPostosProximos(c);
        for (Posto p : proximos) {
            System.out.printf("%-8s | %-7s\n", p.getNome(), p.getBandeira());
        }
    }
}
