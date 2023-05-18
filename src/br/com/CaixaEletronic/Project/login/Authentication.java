package br.com.CaixaEletronic.Project.login;
import br.com.CaixaEletronic.Project.models.Banco;
import java.util.Scanner;
public class Authentication extends Banco {
    private String login;
    private int password;

    private boolean authenticated;

    Scanner input = new Scanner(System.in);
    public String getLogin() {
        return login;
    }

    public String setLogin() {
        System.out.println("Informe o usuario: ");
        String inputUsuario = input.next();
        return login = inputUsuario;
    }

    public int getPassword() {
        return password;
    }

    public int setPassword() {
        System.out.println("Informe a senha: ");
        int inputSenha = input.nextInt();
        return password = inputSenha;
    }

    public boolean validates() {
        if (getLogin().equals("ldavila") && getPassword() == 156085) {
            System.out.println("Usuario e senha validados");
            return authenticated = true;
        } else {
            System.out.println("Usuario ou senha incorreto");
            return authenticated = false;
        }
    }
    public boolean getAuthenticated(){
        return authenticated;
    }
}
