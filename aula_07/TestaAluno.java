public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ale");
        Aluno a2 = new Aluno("Mignon", 4.5, 5.0);

        a1.nota1 = 6.0;
        a1.nota2 = 7.0;

        System.out.println(a1.calculaMedia());
        System.out.println(a2.calculaMedia());
    }
}
