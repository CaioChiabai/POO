import java.util.Scanner;

public class Gerente extends Pessoa {
    String matricula, senha;
    Scanner teclado = new Scanner(System.in);

    Gerente(String nome, String CPF, char sexo, Data dtnasc, String matricula){
        super(nome, CPF, sexo, dtnasc);
        this.matricula = matricula;
        this.senha = "123456";
    }

    Gerente(){
        super();
        System.out.println("Digite uma matrícula:");
        this.matricula = teclado.nextLine();
        this.senha = "123456";       
    }

    boolean validarAcesso(String senha2){
        return this.senha.equals(senha2); 
    }

    boolean validarAcesso(){
        String s;
        System.out.println("Digite sua senha:");
        s = teclado.nextLine();
        return this.validarAcesso(s);
    }
}
