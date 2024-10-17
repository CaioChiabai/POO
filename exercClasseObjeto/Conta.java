public class Conta {
    String numero;
    double saldo, limite;
    Pessoa titular;

    void extrato(){
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.titular.nome);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Saldo disponivel para saque: " + (this.saldo + this.limite));
    }
}
