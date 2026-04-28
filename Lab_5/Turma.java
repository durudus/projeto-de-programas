
import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<Integer>();

    public Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    public Turma(){
        this("", "",0, true);
    }

    public void addHorario(int horario){
        this.horarios.add(horario);
    }

    public String getHorarioString(int horario){
        int column, line;
        int hour[] = {8, 10, 12, 14, 16, 18, 20};
        String days[] = {"segunda", "terça", "quarta", "quinta", "sexta"};

        column = horario/7;
        line = horario - (column*7) - 1;
        if(horario % 7 == 0){
            line=6; column--;
        }

        return days[column] + " " + hour[line] + "hs";
    }

    public String getHorariosString(){
       StringBuilder descricao = new StringBuilder();
       Iterator index =  this.horarios.iterator();
       int num;

       while(index.hasNext()){
            num = (int) index.next();
            descricao.append(getHorarioString(num));

            if((index.hasNext())){
                descricao.append(", ");
            }
       }
       return String.format("%s", descricao);
    }


    public String getDescricao(){
        String acessivel = this.acessivel ? "sim" : "não";
        
        return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %d\nHorário: %s\nAcessível: %s", this.nome, this.professor, this.numAlunos, this.getHorariosString(), acessivel);
    }


}
