public class Poupanca extends Conta{
    
    public Poupanca(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
    }
    
    public Poupanca(Gerente gerente){
        super(gerente);
    }

    public void extrato(){
        System.out.println("***EXTRATO DE CONTA-POUPANÇA***");
        super.extrato();
    }

    public void rendimento(double juros){
        this.setSaldo(this.getSaldo() + ((this.getSaldo()/100)*juros)); 
    }
}
