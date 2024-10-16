public class Poupanca extends Conta{
    
    Poupanca(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
    }
    
    Poupanca(Gerente gerente){
        super(gerente);
    }

    void extrato(){
        System.out.println("***EXTRATO DE CONTA-POUPANÇA***");
        super.extrato();
    }

    void rendimento(double juros){
        this.saldo = this.saldo + ((this.saldo/100)*juros); 
    }
}
