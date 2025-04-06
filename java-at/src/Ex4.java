import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("*** Empréstimo Bancário ***");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();

        System.out.print("Quantas parcelas deseja pagar (min. 6 e max. 48): ");
        int parcelas= scanner.nextInt();

        double taxaJuros = 0.03;
        double fator = Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = emprestimo * (taxaJuros * fator) / (fator - 1);
        double totalPago = valorParcela * parcelas;

        System.out.printf("\nCliente: %s\n", nome);
        System.out.printf("Valor da parcela: R$ %.2f\nem %dx\n", valorParcela, parcelas);
        System.out.printf("Valor total pago: R$ %.2f\n", totalPago);

        scanner.close();
    }
}