
import java.util.Calendar;

public class Aluno{
    String nome;
    int matricula;
    int anoNascimento;

    public Aluno(String nome, int matricula, int anoNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }

    public Aluno(){
        this("", 0 ,0);
    }

    public int getIdade(){
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        return ano - anoNascimento;
    }

    public String getDescricao(){
        return String.format("%s (mat=%d, idade=%d)", this.nome, this.matricula, this.getIdade());
    }
}