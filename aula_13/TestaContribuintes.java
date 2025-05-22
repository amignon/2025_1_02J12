package aula_13;

public class TestaContribuintes {
    public static void main(String[] args) {
        Contribuintes contribuintes = new Contribuintes();

        PessoaFisica pf = new PessoaFisica("Ale", 2000);
        Contribuinte pj = new PessoaJuridica("XYZ", 15000);
        contribuintes.adicionaContribuinte(pf);
        contribuintes.adicionaContribuinte(pj);
        contribuintes.adicionaContribuinte(new PessoaFisica("Mignon", 5000));
        contribuintes.adicionaContribuinte(new PessoaJuridica("ABC", 20000));

        contribuintes.apresentaContribuintes();

    }
}
