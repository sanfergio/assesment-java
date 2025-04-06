import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {

        // classe Produto
        class Produto {
            // atributos
            String produto;
            int quantidade;
            double precoUnitario;
        }

        Scanner scanner = new Scanner(System.in);

        // permitindo 3 produtos cadastrados dentro do array
        Produto[] conteudo = new Produto[3];

        // coletando dados do usuário (vai se repetir 3 vezes o looping de scanner)
        for (int i = 0; i < conteudo.length; i++) {

            conteudo[i] = new Produto(); // instanciando o objeto

            System.out.println("Produto " + i + ":");

            System.out.print("Nome do produto: ");
            conteudo[i].produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            conteudo[i].quantidade = scanner.nextInt();

            System.out.print("Preço unitário: ");
            conteudo[i].precoUnitario = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            System.out.println();
        }

        // definindo nome no arquivo
        BufferedWriter texto = new BufferedWriter(new FileWriter("compras.txt"));

        // looping para add o produto no txt
        for (int i = 0; i < conteudo.length; i++) {
            texto.write("Produto " + i + ":");
            texto.newLine();
            texto.write("Nome: " + conteudo[i].produto);
            texto.newLine();
            texto.write("Quantidade: " + conteudo[i].quantidade);
            texto.newLine();
            texto.write(String.format("Preço Unitário: R$%.2f", conteudo[i].precoUnitario));
            texto.newLine();
            texto.write("--------------------------");
            texto.newLine();
        }

        texto.close();
        System.out.println("'compras.txt' criado com sucesso!");

        scanner.close();

        // Chamando a classe que lê o arquivo
        LeitorDeArquivo.lerArquivo("compras.txt");
    }
}

// classe para ler o arquivo sem try/catch

class LeitorDeArquivo {
    public static void lerArquivo(String nomeArquivo) throws Exception {
        System.out.println("\nConteúdo do arquivo '" + nomeArquivo + "':\n");
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            System.out.println(linha);
        }
        leitor.close();
    }
}
