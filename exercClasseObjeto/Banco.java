import org.w3c.dom.ls.LSOutput;

public class Banco {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Caio";
        p1.idade = 35;
        p1.sexo = 'M';
        p1.cpf = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Victor";
        p2.idade = 90;
        p2.sexo = 'M';
        p2.cpf = "111.111.111-00";

        Conta c1 = new Conta();
        c1.titular = p1;
        c1.numero = "1234-5";
        c1.saldo = 100;
        c1.limite = 200;

        Conta c2 = new Conta();
        c2.titular = p2;
        c2.numero = "5555-6";
        c2.saldo = 0;
        c2.limite = 2000;

        c1.extrato();
        c2.extrato();
    }
}
