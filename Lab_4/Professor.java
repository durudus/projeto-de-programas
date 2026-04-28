
public class Professor {
    String titulacao;
    String nome;
    int matricula;

    public Professor(String titulacao, String nome, int matricula){
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Professor(){
        this("", "", 0);
    }

    public String getDescricao(){
        return String.format("Prof. %s %s - mat %d",this.titulacao, this.nome, this.matricula);
    }
}
