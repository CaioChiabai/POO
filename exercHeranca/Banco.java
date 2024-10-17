public class Banco {
    public static void main(String[] args) {
        
        Data dtNascP1 = new Data(10,10,2004);
        Data dtNascP2 = new Data(10,12,2000);
        Data dtNascGer1 = new Data(20, 5, 1992);
        Data dtNascGer2 = new Data(30,2, 1980);
        Data dtAtual = new Data(10,10,2024);
        Data dtCriacao1 = new Data(9,10,2024);
        Data dtCriacao2 = new Data(1,5,2023);
 
        System.out.println("Validação do metodo imprimirData:");
        dtNascP1.imprimirData();
        dtNascP2.imprimirData();

        System.out.println("\n" + "Validação do metodo maior:");
        System.out.println(dtNascP1.maior(dtNascP2));
        System.out.println(dtNascGer2.maior(dtNascGer1) + "\n");
 
        Pessoa p1 = new Pessoa("Maria", "123.456.789-00",'F',dtNascP1);   
        Pessoa p2 = new Pessoa("João", "234.567.890-00", 'M',dtNascP2);
        Gerente ger1 = new Gerente("Mario", "111.111.111-00",'M',dtNascGer1, "101010", "senha");
        Gerente ger2 = new Gerente("Paula", "555.555.555-55", 'F', dtNascGer2, "202020", "senha123");
        
        System.out.println("Validação da senha do gerente:");
        System.out.println(ger2.validarAcesso("senha"));
        System.out.println(ger2.validarAcesso("senha123") + "\n");

        int idadeP1 = p1.idade(dtAtual);
        int idadeP2 = p2.idade(dtAtual);       
        System.out.println("Validação do metodo idade:");
        System.out.println(idadeP1);
        System.out.println(idadeP2 + "\n");
           
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, ger1, dtCriacao1);
        Poupanca c2 = new Poupanca("2345-6", p2, ger2, dtCriacao2);
        
        System.out.println();
        c1.extrato();
        System.out.println();
        c2.extrato();
        System.out.println();

        c1.sacar(150);
        c1.transferir(10, c2);
        c1.transferir(1000, c2); 

        c2.depositar(10000);
        c2.sacar(6010);

        System.out.println("\n" + "Validacao do metodo chequeEspecial");
        System.out.println(c1.saldo);
        for(int i = 1; i <= 120; i++){
            c1.chequeEspecial(0.5);
            
            if(i%30 == 0){
                System.out.printf("Saldo apos %d dia: %.2f\n", i, c1.saldo);
            }   
        }

        System.out.println("\n" + "Validacao do metodo rendimento");
        System.out.println(c2.disponivel());
        for(int i = 1; i <= 120; i++){
            c2.rendimento(0.5);
            
            if(i%30 == 0){
                System.out.printf("Saldo apos %d dia: %.2f\n", i, c2.saldo);
            }   
        }
        
    }

}
