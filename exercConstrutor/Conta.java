public class Conta {
    
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente gerente;

    Conta(String numero, Pessoa titular, Gerente gerente, Data criacao){
        this.numero = numero;
        this.titular = titular;
        this.criacao = criacao;
        this.gerente = gerente;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema");
    }

    void depositar(double valor){
        this.saldo += valor;
    }
    
}
