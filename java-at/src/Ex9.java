public class Ex9 {
        public static class ContaBancaria {

            public String nome;
            private double saldo;

            // Método para deposito
            public String depositar(double valor) {

                if (valor <= 0){

                    return "O valor de depósito deve ser positivo";

                } else {
                    saldo = valor + saldo;
                    return "Deposito de R$" + valor + " relizado com sucesso.";

                }

            }

            // Método para saque
            public String sacar(double valor) {
                if (saldo <= 0) {
                    return "Saldo insuficiente para saque!";
                } else if (valor > saldo) {
                    return "Saldo insuficiente para saque!";
                } else {
                    saldo = saldo - valor;
                    return "Saque de " + valor + " realizado com sucesso!";
                }
            }


            // Método para exibir saldo
            public String exibirSaldo() {
                return "Olá " + nome + "! Seu saldo atual é de " + saldo;
            }

        }



    public static void main(String[] args) {
        System.out.println("*** Banco do Brasil ***");

        ContaBancaria conta1 = new ContaBancaria();
        conta1.nome = "Giovani";

        System.out.println(conta1.exibirSaldo());
        System.out.println(conta1.sacar(200));
        System.out.println(conta1.depositar(300));
        System.out.println(conta1.sacar(200));
        System.out.println(conta1.exibirSaldo());
    }

    }

