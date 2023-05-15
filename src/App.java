import br.com.CaixaEletronic.Project.ContaCorrente;
import br.com.CaixaEletronic.Project.Menu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Bem vindo ao CH Bank!!!
                
                Precisamos de alguns dados iniciais para dar inicio a sua conta!!
         
                """);
        conta.setCorrentista();
        System.out.println("Todo correntista começa com o saldo 0.");
        conta.randomizarConta();
        System.out.println("O numero da sua conta é: " + conta.getNumeroDaConta());
        conta.spaceScreen();
        conta.fichaConta();

        while(true) {
            String meuMenu = menu.menu();
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