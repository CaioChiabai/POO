import java.util.Scanner;

public class Data {
    int dia, mes, ano;
    Scanner teclado = new Scanner(System.in);

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data(){
        System.out.println("Digite o dia:");
        this.dia = teclado.nextInt();
        System.out.println("Digite o mes:");
        this.mes = teclado.nextInt();
        System.out.println("Digite o ano:");
        this.ano = teclado.nextInt();
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
