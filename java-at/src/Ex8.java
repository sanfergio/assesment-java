public class Ex8 {
    public static class Funcionario {

        // Atributos da classe
        String nome;
        // criei a de cargo, pra poder usar o nome do funcionario
        String cargo;
        double salarioBase;

        // Método para gerentes
        public String Gerente() {
            if (cargo.equalsIgnoreCase("Gerente")) {
                double bonus = salarioBase * 0.20;
                salarioBase += bonus;
                return  nome + ", Você é gerente! Recebe um bônus de 20% no seu salário base. " +
                        "Seu salário agora é R$ " + salarioBase;
            }
            return nome + ", Você não é gerente.";
        }

        // Método para estagiários
        public String Estagiario() {
            if (cargo.equalsIgnoreCase("Estagiario")) {
                double desconto = salarioBase * 0.10;
                salarioBase -= desconto;
                return nome + ", Você é estagiário! Houve um desconto de 10%. " +
                        "Seu salário agora é R$ " + salarioBase;
            }
            return nome + ", Você não é estagiário.";
        }
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Giovani";
        funcionario1.cargo = "Gerente";
        funcionario1.salarioBase = 1200;

        System.out.println(funcionario1.Gerente());
        System.out.println(funcionario1.Estagiario());

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Marlon";
        funcionario2.cargo = "Estagiario";
        funcionario2.salarioBase = 1200;

        System.out.println();
        System.out.println(funcionario2.Gerente());
        System.out.println(funcionario2.Estagiario());
    }
}
