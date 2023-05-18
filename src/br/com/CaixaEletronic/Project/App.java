package br.com.CaixaEletronic.Project;

import br.com.CaixaEletronic.Project.models.CheckingAccount;
import br.com.CaixaEletronic.Project.menu.Menu;
import br.com.CaixaEletronic.Project.login.Authentication;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        Authentication authentication = new Authentication();
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        while (!authentication.getAuthenticated()) {
            authentication.setLogin();
            authentication.setPassword();
            authentication.validates();
        }
        while (true) {
            menu.menu();
            int option = input.nextInt();
            if (option != 7 && option < 8) {
                if (option == 1) {
                    System.out.println("The account balance is: " + account.getBalance());
                } else if (option == 2) {
                    account.setDeposit();
                } else if (option == 3) {
                    account.setTransfer();
                } else if (option == 4) {
                    account.isLoan();
                } else if (option == 5) {
                    account.isCreditCard();
                } else {
                    System.out.println("Module not yet applied");
                }
            } else {
                System.out.println("Thanks for using CH Bank!");
                System.out.println("Application will be terminated...");
                break;
            }
        }
    }
}