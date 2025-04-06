import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha;
        String user;

        System.out.println("*** Cadastro ***");
        System.out.print("Digite seu nome: ");
        user = scanner.nextLine();

        while (true) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("A senha deve possuir no mínimo 8 caracteres, tente novamente.");
            } else if (!senha.matches(".*[A-Z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula, tente novamente.");
            } else if (!senha.matches(".*\\d.*")) {
                System.out.println("A senha deve conter pelo menos um número, tente novamente.");
            } else if (!senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
                System.out.println("A senha deve conter pelo menos um caractere especial, tente novamente.");
            } else {
                System.out.printf("O usuário %s foi cadastrado com sucesso!\n", user);
                break;
            }
        }

        scanner.close();
    }
}
