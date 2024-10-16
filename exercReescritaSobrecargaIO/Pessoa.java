import java.util.Scanner;

public class Pessoa {

    String nome, CPF;
    char sexo;
    Data dtNasc;
    Scanner teclado = new Scanner(System.in);

    Pessoa(String nome, String CPF, char sexo, Data dtNasc){
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        System.out.println("Nova pessoa criada.");
    }

    Pessoa(){
        System.out.println("Digite um nome:");
        this.nome = teclado.nextLine();
        System.out.println("Digite um CPF:");
        this.CPF = teclado.nextLine();
        System.out.println("Digite um sexo com F(feminino) ou M(masculino):");
        this.sexo = teclado.next().charAt(0);
        System.out.println("Digite sua data de nascimento:");
        this.dtNasc = new Data();  
    }

    int idade(Data atualData){
        int idade = 0;
        idade = atualData.ano - this.dtNasc.ano;
        if (this.dtNasc.mes > atualData.mes){
            idade--;
        }else if(this.dtNasc.mes == atualData.mes){
            if(this.dtNasc.dia > atualData.dia){
                idade--;
            }
        }
        
        return idade;
    }
}
