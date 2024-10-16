public class Pessoa {

    String nome, CPF;
    char sexo;
    Data dtNasc;

    Pessoa(String nome, String CPF, char sexo, Data dtNasc){
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
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
