import java.util.ArrayList;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos;

    public Turma(String disciplina, int ano, int semestre, Professor professor){
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    public Aluno getAluno(int matricula){
        for (Aluno aluno : alunos){
            if(aluno.matricula == matricula){
                return aluno;
            }
        }
        return null;
    }

    public void addAluno(Aluno aluno){
        if(getAluno(aluno.matricula) == null){
            alunos.add(aluno);
        }
    }

    public double getMediaIdade(){
        int idadeGeral = 0;
        int qtd = alunos.size();
        for (Aluno aluno : alunos) {
            idadeGeral += aluno.getIdade();
        }

        return ((double)idadeGeral)/qtd;
    }

    public String getDescricao(){
        String descricao = String.format("Turma %s - %d/%d (%s):\n", disciplina, ano, semestre, professor.getDescricao());
        int count = 1;
        for (Aluno aluno : alunos) {
            descricao = descricao + "  -Aluno " + count + ": " + aluno.getDescricao() + ("\n");
            count++;
        }

        return descricao;
    }
}
