package br.com.CaixaEletronic.Project.menu;

public class Menu {
    public void menu() {
        System.out.println(" ");
        System.out.println("Operações");
        System.out.println(" ");
        System.out.println("""
                        1- Consultar Saldos
                        2- Depositar valor
                        3- Transferir valor
                        4- Verificar emprestimo
                        5- Verificar cartão
                        6- Verificar Financiamento
                        7- Sair
                        """);
        System.out.println(" ");
        System.out.println("Digite a opção desejada: ");
    }

    public void mensagemBoasVindas() {
        System.out.println("""
                Bem vindo ao CH Bank!!!
                
                Precisamos de alguns dados iniciais para dar inicio a sua conta!!
         
                """);
    }
}
