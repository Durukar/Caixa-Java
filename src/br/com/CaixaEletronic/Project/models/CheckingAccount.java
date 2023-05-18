package br.com.CaixaEletronic.Project.models;

public class CheckingAccount extends Banco {
    private boolean loan;
    private double loanLimit;
    private boolean creditCard;
    private double creditCardLimit;

    public boolean isLoan() {
        if (getBalance() > 2000) {
            loanLimit = getBalance() * 0.10;
            System.out.println("Possui limite de emprestimo de R$ " + loanLimit);
            return loan = true;
        } else {
            System.out.println("Não possui limite seu saldo é abaixo de R$ 2000,00");
            return loan = false;
        }
    }

    private double setLimiteEmprestimo() {
        if (loan == true) {
            loanLimit = getBalance() * 0.10;
            return loanLimit;
        } else {
            loanLimit = 0;
            return loanLimit;
        }
    }

    public boolean isCreditCard() {
        if (getBalance() > 2000 && isLoan() == true) {
            getCreditCardLimit();
            System.out.println("Possui limite no cartão de credito de R$" + creditCardLimit) ;
            return creditCard = true;
        } else {
            System.out.println("Não possui limite de cartão pois seu saldo é abaixo de 2000 e não possui limite de emprestimo");
            return creditCard = false;
        }
    }

    private double getCreditCardLimit() {
        if (creditCard == true) {
            creditCardLimit = getBalance() * 2;
            return creditCardLimit;
        } else {
            return creditCardLimit;
        }
    }
}
