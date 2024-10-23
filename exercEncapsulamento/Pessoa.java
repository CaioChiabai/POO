import java.util.Scanner;

public class Pessoa {

    protected String nome;
    protected String CPF;
    protected char sexo;
    protected Data dtNasc;
    Scanner teclado = new Scanner(System.in);

    public Pessoa(String nome, String CPF, char sexo, Data dtNasc){
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        System.out.println("Nova pessoa criada.");
    }

    public Pessoa(){
        System.out.println("Digite um nome:");
        this.nome = teclado.nextLine();
        System.out.println("Digite um CPF:");
        this.CPF = teclado.nextLine();
        System.out.println("Digite um sexo com F(feminino) ou M(masculino):");
        this.sexo = teclado.next().charAt(0);
        System.out.println("Digite sua data de nascimento:");
        this.dtNasc = new Data();  
    }

    public int idade(Data atualData){
        int idade = 0;
        idade = atualData.getAno() - this.dtNasc.getAno();
        if (this.dtNasc.getMes() > atualData.getMes()){
            idade--;
        }else if(this.dtNasc.getMes() == atualData.getMes()){
            if(this.dtNasc.getDia() > atualData.getDia()){
                idade--;
            }
        }
        
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public char getSexo() {
        return sexo;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }
}
