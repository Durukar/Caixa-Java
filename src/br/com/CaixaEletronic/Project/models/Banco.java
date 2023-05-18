package br.com.CaixaEletronic.Project.models;
import java.util.Scanner;
import java.util.Random;
public class Banco {
    Scanner input = new Scanner(System.in);
    Random contaRandom = new Random();
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private double deposit;
    private double transfer;


    public void randomizarConta(){
        if (accountNumber <= 0) {
            accountNumber = contaRandom.nextInt(9000);
        } else {
            System.out.println("Operação nao permitida, a conta ja possui numero");
        }
    }


    public double setTransfer() {
        System.out.println("Informe o valor a ser transferido: ");
        transfer = input.nextDouble();
        if (balance < transfer) {
            System.out.println("Não é possivel transferir R$ " + transfer + " pois o valor esta acima do valor que possui na conta.");
            return balance -= 0;
        } else {
            System.out.println("Valor transferido");
            return balance -= transfer;
        }
    }

    public double setDeposit() {
        System.out.println("Informe o valor a ser depositado: ");
        deposit = input.nextDouble();
        return balance += deposit;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setCorrentista() {
        System.out.println("Digite o nome do correntista: ");
        this.accountHolder = input.nextLine();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void fichaConta() {
        System.out.println("""
                        **********************************************
                        Dados do correntista:
                        
                        Nome:           %s
                        conta:          %d
                        Tipo:           Corrente
                        Saldo inicial:  R$ %.2f
                        **********************************************

                        """.formatted(accountHolder, accountNumber, balance));
    }

    public void spaceScreen() {
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }
}