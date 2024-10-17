public class Banco {
    public static void main(String[] args) {
        
        Data dt1 = new Data(1,10,2004);
        dt1.imprimirData();
        Data dt2 = new Data(10,12,2000);
        dt2.imprimirData();
        Data dt_atual = new Data(2,10,2024);

        Pessoa p1 = new Pessoa("Maria", "123.456.789-00", 18, 'F',dt1);   
        Pessoa p2 = new Pessoa("João", "234.567.890-00", 22, 'M',dt2);
        
        int idade_p1 = p1.calc_idade(dt_atual);
        int idade_p2 = p2.calc_idade(dt_atual);       
        System.out.println(idade_p1);
        System.out.println(idade_p2);
         
        Conta c1 = new Conta("1234-5",p1);
        Conta c2 = new Conta("2345-6", p2);
        
        c1.extrato();
        c2.extrato();

        c1.sacar(150);
        c1.transferir(100, c2);
        c1.sacar(100);
        c1.depositar(100);
        c1.transferir(200, c2);

        for(int i = 1; i <= 120; i++){
            c1.chequeEspecial(0.5);
            
            if(i%30 == 0){
                System.out.printf("Saldo apos %d dia: %.2f\n", i, c1.saldo);
            }   
        }
        
    }

}
