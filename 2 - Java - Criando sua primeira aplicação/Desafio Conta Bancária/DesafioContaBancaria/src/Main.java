import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 0;
        int opcao;
        double deposito = 0;
        double transfer = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(" ");
        System.out.println("Nome: Diego Silva");
        System.out.println("Tipo de conta: Corrente");
        System.out.printf("Saldo atual: R$ %.2f %n", saldo);
        System.out.println("******************************");

        System.out.println(" ");

        System.out.println("Operações");

        System.out.println(" ");

        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Depositar valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        System.out.println(" ");

        System.out.println("Digite a opção desejada: ");
        opcao = leitor.nextInt();

        while ((opcao >= 1) && (opcao <= 4)) {

            if (opcao == 1) {
                System.out.printf("Seu saldo é: R$ %.2f %n", saldo);
                break;
            } else if (opcao == 2) {
                System.out.println("Qual valor será depositado? ");
                deposito = leitor.nextDouble();
                saldo += deposito;
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir? ");
                transfer = leitor.nextDouble();
                while (transfer > saldo) {
                    System.out.println("O valor digitado é maior que o saldo em conta. Digite outro valor: ");
                } if (transfer < saldo) {
                    saldo -= transfer;
                    System.out.printf("Valor transferido. Seu novo saldo é: R$ %.2f %n", saldo);
                }
            } else if (opcao == 4) {
                break;
            }

        }
    }
}