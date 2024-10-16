public class Gerente extends Pessoa {
    String matricula, senha;
    
    Gerente(String nome, String CPF, char sexo, Data dtnasc, String matricula, String senha){
        super(nome, CPF, sexo, dtnasc);
        this.matricula = matricula;
        this.senha = senha;
    }

    boolean validarAcesso(String senha2){
        return this.senha.equals(senha2); 
    }
}
