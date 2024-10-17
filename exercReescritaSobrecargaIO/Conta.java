import java.util.Scanner;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente gerente;
    Scanner teclado = new Scanner(System.in);

    Conta(String numero, Pessoa titular, Gerente gerente, Data criacao){
        this.numero = numero;
        this.titular = titular;
        this.criacao = criacao;
        this.gerente = gerente;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema");
    }

    Conta(Gerente gerente){
        System.out.println("Digite o numero da conta:");
        this.numero = teclado.next();
        this.titular = new Pessoa();
        System.out.println("Digite a data de criacao da conta");
        this.criacao = new Data();
        this.gerente = gerente;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema");
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    double disponivel(){
        return this.saldo;
    }

    void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.CPF);
        System.out.println("Saldo disponivel para saque: " + this.disponivel());
    }

    boolean sacar(double valor){
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta: " + this.numero + " realizado com sucesso.");
            System.out.println("Novo saldo: " + this.disponivel());
            return true;
        }else{
            System.out.println("ERRO: Saque na conta " + this.numero + " nao foi realizado.");
            System.out.println("Valor disponível: " + this.disponivel());
            return false;
        }
    }

    boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.numero + " para a conta " + destino.numero + " foi realizada com sucesso");
            return true;
        }else{
            System.out.println("ERRO: Não foi possível transferir " + valor + " da conta " + this.numero + " para a conta " + destino.numero);
            System.out.println("Valor disponivel: " + this.disponivel());
            return false;
        }

    }
    
}
