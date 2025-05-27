import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        int opcao = 0;

        // Exibe dados iniciais do cliente
        System.out.println("********************************************\nDados iniciais do cliente:\n");
        String nome = "Douglas Silva";
        String tipoConta = "Corrente";
        double saldoAtual = 2500.00;
        System.out.printf(
                "%-13s %s%n%-13s %s%n%-13s R$ %.2f",
                "Nome:", nome,
                "Tipo Conta:", tipoConta,
                "Saldo atual:", saldoAtual
        );
        System.out.println("\n********************************************\n");

        Scanner leitura = new Scanner(System.in);

        // Loop principal do menu
        while (opcao != 4) {
            System.out.println("""
                    \nOperações
                    
                    1- Consultar saldo
                    2- Tranferir valor
                    3- Receber valor
                    4- Sair
                    """);

            opcao = leitura.nextInt();

            if (opcao == 1){
                // Mostrar saldo atual
                System.out.printf("Saldo atual: %.2f\n", saldoAtual);
            } else if (opcao == 2) {
                // Transferência
                System.out.println("Insira o valor da transferência: ");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldoAtual){
                    System.out.printf("Saldo insuficiente!\nsaldo atual: %.2f\n", saldoAtual);
                } else {
                    saldoAtual -= valorTransferencia;
                    System.out.printf("Saldo atual: %.2f\n", saldoAtual);
                }
            } else if (opcao == 3) {
                // Depósito
                System.out.println("Valor do depósito: ");
                double valorDeposito = leitura.nextDouble();
                saldoAtual += valorDeposito;
                System.out.printf("Saldo atual: %.2f\n", saldoAtual);
            } else if (opcao == 4) {
                // Encerrar programa
                System.out.println("Menu encerrado.\nFicamos felizes em te-lo como cliente");
            } else {
                // Opção inválida
                System.out.println("Digite uma opção válida.");
            }
        }

        leitura.close();
    }
}
