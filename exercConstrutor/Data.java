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
}
