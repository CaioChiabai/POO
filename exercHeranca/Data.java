public class Data {
    int dia, mes, ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    boolean maior(Data d2){
        if(this.ano < d2.ano){
            return false;
        }else if(this.ano > d2.ano){
            return true;
        }

        else if(this.mes < d2.mes){
            return false;
        }else if(this.mes > d2.mes){
            return true;
        }

        else if(this.dia < d2.dia){
            return false;
        }
        
        else{
            return false;
        }
    }
}
