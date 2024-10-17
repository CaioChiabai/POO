public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
        this.limite = 200;
    }
    
    double disponivel(){
        return (this.saldo + this.limite);
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

    void chequeEspecial(double juros){
        if(this.saldo < 0){
            this.saldo = this.saldo + ((this.saldo/100)*juros);
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
