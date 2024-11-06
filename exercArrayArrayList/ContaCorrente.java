import java.util.Scanner;

public class ContaCorrente extends Conta {
    private double limite;
    Scanner teclado = new Scanner(System.in);

    public ContaCorrente(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
        this.limite = 200;
    }

    public ContaCorrente(Pessoa titular, Gerente gerente){
        super(titular, gerente);
        this.limite = 200;
    }
    
    public void alterarLimite(){
        if (this.getGerente().validarAcesso()){
            System.out.println("Digite o novo limite:");
            this.limite = teclado.nextDouble();
        }else{
            System.out.println("ACESSO NEGADO.");
            System.out.println("SENHA INCORRETA.");
        }
    }

    public void alterarLimite(String s, double l){
        if (this.getGerente().validarAcesso(s)){
            this.limite = l;
        }else{
            System.out.println("ACESSO NEGADO.");
            System.out.println("SENHA INCORRETA.");
        }
    }
    
    protected double disponivel(){
        return (super.disponivel() + this.limite);
    }

    public void extrato(){
        System.out.println("***EXTRATO DE CONTA-CORRENTE***");
        super.extrato();
    }

    public void chequeEspecial(double juros){
        if(this.getSaldo() < 0){
            this.setSaldo(this.getSaldo() + ((this.getSaldo()/100)*juros));
        }
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
