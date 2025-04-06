public class Ex6 {

    public static class Veiculo {
        // Atributos da classe
        String placa;
        String modelo;
        int anoDeFabricacao;
        double quilometragem;

        // Método para exibir detalhes
        public String exibirDetalhes() {
            return "Placa: " + placa + ", Modelo: " + modelo +
                    ", Ano: " + anoDeFabricacao + ", Km: " + quilometragem;
        }

        // Método para registrar uma viagem
        public String registrarViagem(double km){
            quilometragem = quilometragem + km;
            return km + " km rodados na viagem. Quilometragem total agora é: " + quilometragem + " km.";
        }
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();
        carro1.placa = "ADA-1234";
        carro1.modelo = "Corsinha Amarelo";
        carro1.anoDeFabricacao = 2000;
        carro1.quilometragem = 25000;

        System.out.println(carro1.exibirDetalhes());
        System.out.println(carro1.registrarViagem(120));
        System.out.println(carro1.exibirDetalhes());

        System.out.println();

        Veiculo carro2 = new Veiculo();
        carro2.placa = "DAD-4321";
        carro2.modelo = "Uno com Escada";
        carro2.anoDeFabricacao = 1980;
        carro2.quilometragem = 10000;

        System.out.println(carro2.exibirDetalhes());
        System.out.println(carro2.registrarViagem(75.5));
        System.out.println(carro2.exibirDetalhes());
    }
}
