import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static int menuInicial(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo! Escolha uma opção.\n");
        System.out.println("1) Cadastro");
        System.out.println("2) Movimentação financeira");
        System.out.println("0) Sair");

        return teclado.nextInt();
    }

    public static void menuCadastro(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nO que deseja cadastrar?");
        System.out.println("1) Novo cliente");
        System.out.println("2) Novo gerente");
        System.out.println("3) Nova conta corrente");
        System.out.println("4) Nova conta poupança");

        int op = teclado.nextInt();

        if(op == 1) p.add(new Pessoa());
        if(op == 2) g.add(new Gerente());
        if(op == 3){
            Pessoa titular = escolherPessoa(p);
            Gerente gerente = escolherGerente(g);
            c.add(new ContaCorrente(titular, gerente));
        }
        if(op == 4){
            Pessoa titular = escolherPessoa(p);
            Gerente gerente = escolherGerente(g);
            c.add(new Poupanca(titular, gerente));
        }
    }

    public static Pessoa escolherPessoa(ArrayList<Pessoa> p){
        Scanner teclado = new Scanner(System.in);

        int i = 1;
        System.out.println("Escolha o cliente da conta: ");
        for(Pessoa titular : p){
            System.out.println(i + ") " + titular.getCPF() + " - " + titular.getNome());
            i++;
        }
        int index = teclado.nextInt();
        return p.get(index-1);
    }

    public static Gerente escolherGerente(ArrayList<Gerente> g){
        Scanner teclado = new Scanner(System.in);

        int i = 1;
        System.out.println("Escolha o gerente da conta: ");
        for(Gerente gerente : g){
            System.out.println(i + ") " + gerente.getCPF() + " - " + gerente.getNome());
            i++;
        }
        int index = teclado.nextInt();
        return g.get(index-1);
    }

    public static void menuMovimentacoes(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
        Scanner teclado = new Scanner(System.in);

        Conta conta1 = escolherConta(c);
        System.out.println("Oque deseja realizar?");
        System.out.println("1) Extrato");
        System.out.println("2) Saque");
        System.out.println("3) Depósito");
        System.out.println("4) Transferência");

        int op = teclado.nextInt();

        if(op == 1) conta1.extrato();
        if(op == 2) conta1.sacar();
        if(op == 3) conta1.depositar();
        if(op == 4){
            System.out.println("Qual a conta destino?");
            Conta conta2 = escolherConta(c);
            conta1.transferir(conta2);
        }
    }

    public static Conta escolherConta(ArrayList<Conta> c){
        Scanner teclado = new Scanner(System.in);

        int i = 1;
        System.out.println("Escolha uma conta: ");
        for(Conta conta : c){
            System.out.println(i + ") " + conta.getNumero() + " - " + conta.getTitular().getNome());
            i++;
        }
        int index = teclado.nextInt();
        return c.get(index - 1);
    }
    
    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();

        int op = menuInicial();
        while(op != 0){
            if(op == 1){
                menuCadastro(pessoas, gerentes, contas);
            }
            if(op == 2){
                menuMovimentacoes(pessoas, gerentes, contas);
            }
            op = menuInicial();
        }
    }
}
