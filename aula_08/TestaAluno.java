public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ale");
        Aluno a2 = new Aluno("Mignon", 4.5, 5.0);

        a1.setNota1(6.0);
        a1.setNota2(7.0);

        System.out.printf("N1: %.1f N2: %.1f\n", a1.getNota1(), a1.getNota2());
        System.out.println(a1.calculaMedia());
        System.out.println(a2.calculaMedia());
    }
}
