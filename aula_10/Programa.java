package aula_10;

public class Programa {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3, 4);
        Ponto p2 = new Ponto(28, 15);
        Circulo c = new Circulo(p1, 2.0);
        boolean contido = c.estaContido(p2);
        System.out.println(contido);
    }
}
