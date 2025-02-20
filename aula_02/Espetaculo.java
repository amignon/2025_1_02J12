package aula_02;

import java.util.Scanner;

public class Espetaculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de dados
        System.out.print("Custo de Produção: ");
        float custoProducao = entrada.nextFloat();
        System.out.print("Valor do Ingresso: ");
        float precoIngresso = entrada.nextFloat();
        // processamento
        int qtdeConvites = (int) Math.ceil(custoProducao / precoIngresso);
        int qtdeConvites23 = (int) Math.ceil((custoProducao * 1.23f) / precoIngresso);
        // saida de dados
        System.out.printf("Quantidade de Convites: %d\n", qtdeConvites);
        System.out.printf("Quantidade de Convites 23%%: %d\n", qtdeConvites23);
    }
}
