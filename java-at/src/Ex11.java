import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // números sorteados
        int num1 = random.nextInt(1, 61);
        int num2 = random.nextInt(1, 61);
        int num3 = random.nextInt(1, 61);
        int num4 = random.nextInt(1, 61);
        int num5 = random.nextInt(1, 61);
        int num6 = random.nextInt(1, 61);

        // entradas do usuário
        System.out.println("Digite um número de 1 a 60:");
        int user1 = scanner.nextInt();

        System.out.println("Digite outro número de 1 a 60:");
        int user2 = scanner.nextInt();

        System.out.println("Digite outro número de 1 a 60:");
        int user3 = scanner.nextInt();

        System.out.println("Digite outro número de 1 a 60:");
        int user4 = scanner.nextInt();

        System.out.println("Digite outro número de 1 a 60:");
        int user5 = scanner.nextInt();

        System.out.println("Digite o último número de 1 a 60:");
        int user6 = scanner.nextInt();

        // verificando os acertos
        int acertos = 0;

        if (user1 == num1 || user1 == num2 || user1 == num3 || user1 == num4 || user1 == num5 || user1 == num6) {
            acertos++;
        }

        if (user2 == num1 || user2 == num2 || user2 == num3 || user2 == num4 || user2 == num5 || user2 == num6) {
            acertos++;
        }

        if (user3 == num1 || user3 == num2 || user3 == num3 || user3 == num4 || user3 == num5 || user3 == num6) {
            acertos++;
        }

        if (user4 == num1 || user4 == num2 || user4 == num3 || user4 == num4 || user4 == num5 || user4 == num6) {
            acertos++;
        }

        if (user5 == num1 || user5 == num2 || user5 == num3 || user5 == num4 || user5 == num5 || user5 == num6) {
            acertos++;
        }

        if (user6 == num1 || user6 == num2 || user6 == num3 || user6 == num4 || user6 == num5 || user6 == num6) {
            acertos++;
        }

        // números sorteados
        System.out.println("\nNúmeros sorteados:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

        // exibindo resultado
        System.out.println("\nVocê acertou " + acertos + " número(s).");
    }
}
