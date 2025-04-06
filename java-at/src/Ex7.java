import java.util.Scanner;

public class Ex7 {
    public static class Aluno {

        // Atributos da classe
        String nome;
        int matricula;

        double nota1;
        double nota2;
        double nota3;

        // Método para calcular a media do aluno

        public Double calcularMedia(){

            return (nota1 + nota2 + nota3) / 3;

        }


        // Método para exibir aprovação/reprovação

        public String verificarAprovacao() {

            double media = calcularMedia();

            if (media >= 7){
                return "O aluno " + nome + " da matricula " + matricula + ", foi aprovado com a nota na media: " + media;
            } else {
                return "O aluno " + nome + " da matricula " + matricula + ", foi reprovado com a nota na media: " + media;
            }
        }

    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        aluno1.nome = scanner1.nextLine();

        System.out.println("Digite o sua matrícula: ");
        aluno1.matricula = scanner1.nextInt();

        System.out.println("Digite a nota da primeira prova: ");
        aluno1.nota1 = scanner1.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        aluno1.nota2 = scanner1.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        aluno1.nota3 = scanner1.nextDouble();

        System.out.println(aluno1.verificarAprovacao());
        scanner1.close();
    }
}
