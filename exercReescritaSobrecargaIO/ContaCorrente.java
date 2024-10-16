import java.util.Scanner;

public class ContaCorrente extends Conta {
    double limite;
    Scanner teclado = new Scanner(System.in);

    ContaCorrente(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
        this.limite = 200;
    }

    ContaCorrente(Gerente gerente){
        super(gerente);
        this.limite = 200;
    }

    void alterarLimite(){
        if (this.gerente.validarAcesso()){
            System.out.println("Digite o novo limite:");
            this.limite = teclado.nextDouble();
        }else{
            System.out.println("ACESSO NEGADO.");
            System.out.println("SENHA INCORRETA.");
        }
    }

    void alterarLimite(String s, double l){
        if (this.gerente.validarAcesso(s)){
            this.limite = l;
        }else{
            System.out.println("ACESSO NEGADO.");
            System.out.println("SENHA INCORRETA.");
        }
    }
    
    double disponivel(){
        return (super.disponivel() + this.limite);
    }

    void extrato(){
        System.out.println("***EXTRATO DE CONTA-CORRENTE***");
        super.extrato();
    }

    void chequeEspecial(double juros){
        if(this.saldo < 0){
            this.saldo = this.saldo + ((this.saldo/100)*juros);
        }
    }

}
