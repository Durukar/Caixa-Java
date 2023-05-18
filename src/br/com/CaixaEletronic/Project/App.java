package br.com.CaixaEletronic.Project;

import br.com.CaixaEletronic.Project.models.ContaCorrente;
import br.com.CaixaEletronic.Project.menu.Menu;
import br.com.CaixaEletronic.Project.login.Authentication;

import javax.naming.AuthenticationException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Authentication authentication = new Authentication();
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        while (!authentication.getAutenticado()) {
            authentication.setLogin();
            authentication.setSenha();
            authentication.valida();
        }
        while (true) {
            menu.menu();
            int opcao = input.nextInt();
            if (opcao != 7 && opcao < 8) {
                if (opcao == 1) {
                    System.out.println("O saldo da conta é: " + conta.getSaldo());
                } else if (opcao == 2) {
                    conta.setDeposito();
                } else if (opcao == 3) {
                    conta.setTransferir();
                } else if (opcao == 4) {
                    conta.isEmprestimo();
                } else if (opcao == 5) {
                    conta.isCartaoDeCredito();
                } else {
                    System.out.println("Modulo ainda não aplicado");
                }
            } else {
                System.out.println("Obrigado por utilizar a CH Bank!");
                System.out.println("Aplicação será encerrada...");
                break;
            }
        }
    }
}