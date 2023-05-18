package br.com.CaixaEletronic.Project.models;

import br.com.CaixaEletronic.Project.models.Banco;

public class ContaCorrente  extends Banco {
    private boolean emprestimo;
    private double limiteEmprestimo;
    private boolean cartaoDeCredito;
    private double limiteCartao;

    public boolean isEmprestimo() {
        if (getSaldo() > 2000) {
            limiteEmprestimo = getSaldo() * 0.10;
            System.out.println("Possui limite de emprestimo de R$ " + limiteEmprestimo);
            return emprestimo = true;
        } else {
            System.out.println("Não possui limite seu saldo é abaixo de R$ 2000,00");
            return emprestimo = false;
        }
    }

    private double setLimiteEmprestimo() {
        if (emprestimo == true) {
            limiteEmprestimo = getSaldo() * 0.10;
            return limiteEmprestimo;
        } else {
            limiteEmprestimo = 0;
            return limiteEmprestimo;
        }
    }

    public boolean isCartaoDeCredito() {
        if (getSaldo() > 2000 && isEmprestimo() == true) {
            getLimiteCartao();
            System.out.println("Possui limite no cartão de credito de R$" + limiteCartao) ;
            return cartaoDeCredito = true;
        } else {
            System.out.println("Não possui limite de cartão pois seu saldo é abaixo de 2000 e não possui limite de emprestimo");
            return cartaoDeCredito = false;
        }
    }

    private double getLimiteCartao() {
        if (cartaoDeCredito == true) {
            limiteCartao = getSaldo() * 2;
            return limiteCartao;
        } else {
            return limiteCartao;
        }
    }
}
