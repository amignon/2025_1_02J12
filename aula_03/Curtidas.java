import java.util.Scanner;

public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de Publicações: ");
        int numeroPublicacoes = entrada.nextInt();
        int totalCurtidas = 0;
        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Curtidas para a Publicação #%d: ", i);
            int numeroCurtidas = entrada.nextInt();
            totalCurtidas = totalCurtidas + numeroCurtidas;
            if (numeroCurtidas >= 100) {
                System.out.println("\tPublicação popular!");
            }
            else {
                System.out.println("\tPublicação com poucas curtidas");
            }
        }
        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
        System.out.printf("Média de curtidas = %.1f\n", mediaCurtidas);
        System.out.printf("Número de publicações = %d\n", numeroPublicacoes);
        entrada.close();
    }
}