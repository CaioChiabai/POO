public class Pessoa {

    String nome, CPF;
    int idade;
    char sexo;
    Data dtNasc;

    Pessoa(String nome, String CPF, int idade, char sexo, Data dtNasc){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
    }

    Pessoa(){
    }

    int calc_idade(Data atualData){
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
