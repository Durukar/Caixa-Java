import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Lucas Davila";
        String conta = "Corrente";
        double saldo = 2500.00;

        System.out.print("Informe o nome do correntista ->");
        String nomeInput = input.nextLine();
        if (nomeInput.equals(nome)) {
            System.out.println("""
                        **********************************************
                        Dados iniciais do cliente:
                        
                        Nome:           Lucas Davila
                        conta:          Corrente
                        Saldo inicial:  R$ 2500,00
                        **********************************************

                        """);
            while (true) {

                System.out.println(" ");
                System.out.println("Operações");
                System.out.println(" ");
                System.out.println("""
                        1- Consultar Saldos
                        2- Depositar valor
                        3- Transferir valor
                        4- Sair
                        """);
                System.out.println(" ");
                System.out.println("Digite a opção desejada: ");
                int opcao = input.nextInt();
                if (opcao != 4) {
                    if (opcao == 1) {
                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    } else if (opcao == 2) {
                        System.out.print("Digite o valor que deseja depositar: R$");
                        double enviar = input.nextDouble();
                        saldo += enviar;
                        System.out.printf("Valor depositado, saldo atual é de: R$ %.2f%n", saldo);
                    } else if (opcao == 3) {
                        System.out.println("Digite o valor que deseja enviar: R$");
                        double enviar = input.nextDouble();
                        if (saldo - enviar <= 0) {
                            System.out.println("Não é possivel enviar pois esta abaixo do saldo");
                        } else {
                            saldo -= enviar;
                            System.out.printf("Valor enviado, saldo atual é de: R$ %.2f%n", saldo);
                        }
                    }
                } else {
                    System.out.println("Aplicaçao encerrada");
                    break;
                }
            }
        } else {
            System.out.println("Falha no Login");
        }
    }
}