import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("*** Imposto de Renda ***");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 22847.76) {
            System.out.println("Você está isento do imposto de renda.");
        } else if (salario <= 33919.80) {
            System.out.println("Você vai pagar R$"+ salario * 0.075 + " de imposto");
            System.out.println("Você vai pagar 7,5% de imposto de renda.");
        } else if (salario <= 45012.60) {
            System.out.println("Você vai pagar R$"+ salario * 0.15 + " de imposto");
            System.out.println("Você vai pagar 15% de imposto de renda.");
        } else {
            System.out.println("Você vai pagar R$"+ salario * 0.275 + " de imposto");
            System.out.println("Você vai pagar 27,5% de imposto de renda.");
        }


        scanner.close();
    }
}
