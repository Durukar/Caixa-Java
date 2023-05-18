package br.com.CaixaEletronic.Project.models;
import java.util.Scanner;
import java.util.Random;
public class Banco {
    Scanner input = new Scanner(System.in);
    Random contaRandom = new Random();
    private String correntista;
    private int numeroDaConta;
    private double saldo;
    private double deposito;
    private double transferir;


    public void randomizarConta(){
        if (numeroDaConta <= 0) {
            numeroDaConta = contaRandom.nextInt(9000);
        } else {
            System.out.println("Operação nao permitida, a conta ja possui numero");
        }
    }


    public double setTransferir() {
        System.out.println("Informe o valor a ser transferido: ");
        transferir = input.nextDouble();
        if (saldo < transferir) {
            System.out.println("Não é possivel transferir R$ " + transferir + " pois o valor esta acima do valor que possui na conta.");
            return saldo -= 0;
        } else {
            System.out.println("Valor transferido");
            return saldo -= transferir;
        }
    }

    public double setDeposito() {
        System.out.println("Informe o valor a ser depositado: ");
        deposito = input.nextDouble();
        return saldo += deposito;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista() {
        System.out.println("Digite o nome do correntista: ");
        this.correntista = input.nextLine();
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
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

                        """.formatted(correntista, numeroDaConta, saldo));
    }

    public void spaceScreen() {
        System.out.println("""
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                """);
    }
}