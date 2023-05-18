package br.com.CaixaEletronic.Project.login;
import br.com.CaixaEletronic.Project.models.Banco;
import java.util.Scanner;
public class Authentication extends Banco {
    private String login;
    private int senha;

    private boolean autenticado;

    Scanner input = new Scanner(System.in);
    public String getLogin() {
        return login;
    }

    public String setLogin() {
        System.out.println("Informe o usuario: ");
        String inputUsuario = input.next();
        return login = inputUsuario;
    }

    public int getSenha() {
        return senha;
    }

    public int setSenha() {
        System.out.println("Informe a senha: ");
        int inputSenha = input.nextInt();
        return senha = inputSenha;
    }

    public boolean valida() {
        if (getLogin().equals("ldavila") && getSenha() == 156085) {
            System.out.println("Usuario e senha validados");
            return autenticado = true;
        } else {
            System.out.println("Usuario ou senha incorreto");
            return autenticado = false;
        }
    }
    public boolean getAutenticado(){
        return autenticado;
    }
}
