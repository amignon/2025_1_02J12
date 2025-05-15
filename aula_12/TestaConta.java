package aula_12;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Ale", 1000);
        System.out.printf("Saldo CB: %.2f\n", cb.getSaldo());
        cb.sacar(1200);
        System.out.printf("Saldo CB: %.2f\n", cb.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Mignon", 2000, 0.05);
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());
        cp.sacar(200);
        cp.aplicarRendimento();
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());

        ContaCorrente cc = new ContaCorrente("Ale Mignon", 1000, 500);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
        cc.sacar(1800);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
        cc.sacar(500);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
    } 
}
