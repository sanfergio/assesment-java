import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // array que vai amarzenas todas as mensagens da conversa
                String[] mensagens = new String[10];

                System.out.print("Digite o nome do primeiro usuário: ");
                String usuario1 = scanner.nextLine();

                System.out.print("Digite o nome do segundo usuário: ");
                String usuario2 = scanner.nextLine();

                System.out.println();

                // alternância para envio de mensagens
                for (int i = 0; i < 10; i++) {
                    String usuarioAtual = (i % 2 == 0) ? usuario1 : usuario2;
                    System.out.print(usuarioAtual + ", digite sua mensagem: ");
                    String mensagem = scanner.nextLine();
                    mensagens[i] = usuarioAtual + ": " + mensagem;
                }

                System.out.println();
                System.out.println("===== Histórico de Mensagens =====");
                for (String msg : mensagens) {
                    System.out.println(msg);
                }

                // Mensagem final
                System.out.println();
                System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

                scanner.close();

        }

    }
