public class Poupanca extends Conta{
    
    Poupanca(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
    }
    
    double disponivel(){
        return (this.saldo);
    }

    void extrato(){
        System.out.println("***EXTRATO DA CONTA");
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

    void rendimento(double juros){
        this.saldo = this.saldo + ((this.saldo/100)*juros); 
    }
}
