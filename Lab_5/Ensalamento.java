
import java.util.ArrayList;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento(){
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento =  new ArrayList<TurmaEmSala>();
    }

    public void addSala(Sala sala){
        this.salas.add(sala);
    }

    public void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    public Sala getSala(Turma turma){
        for (TurmaEmSala t : this.ensalamento) {
            if (t.turma.equals(turma)) {
                return t.sala;
            }
        }
        return null; 
    }

    public boolean salaDisponivel(Sala sala, int horario){
        boolean disponivel = true;
        for (TurmaEmSala t: this.ensalamento){
            if(t.sala.equals(sala)){
                for (int hour : t.turma.horarios) {
                    if(hour == horario){
                        disponivel = false;
                    }
                }
                // for(int i = 0; i < t.turma.horarios.size(); i++){
                //     disponivel = false;
                // }
            }
        }
        return disponivel; 
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
        boolean disponivel = true;
        for (Integer horario : horarios){
            if(!salaDisponivel(sala, horario)){
                disponivel = false;
            }
        }
        return disponivel; 
    }

    public boolean alocar(Turma turma, Sala sala) {
        TurmaEmSala turmaEmSala = new TurmaEmSala(turma, sala);
        if (((turma.acessivel == sala.acessivel) || (sala.acessivel)) && (turma.numAlunos <= sala.capacidade) && (salaDisponivel(sala, turma.horarios))){
            this.ensalamento.add(turmaEmSala);
            
            return true;
        }
        return false;
    }
    
    public void alocarTodas() {
        for (Turma turma : turmas) {
            for (Sala sala : salas) {
                if (alocar(turma, sala)) { break; }
            }
        }
    }

    public int getTotalTurmasAlocadas(){
        int c = 0;
        for (TurmaEmSala t : this.ensalamento) {
            if(t.sala != null){
                c++;
            }
        }
        return c;
    }

    public int getTotalEspacoLivre(){
        int c = 0;
        for (TurmaEmSala t : ensalamento) {
            c += t.sala.capacidade - t.turma.numAlunos;
        }
        return c;
    }

    public String relatorioResumoEnsalamento() {
        int totalSalas = this.salas.size();
        int totalTurmas = this.turmas.size();
        int turmasAlocadas = this.getTotalTurmasAlocadas();
        int espacoLivre = this.getTotalEspacoLivre();

        return String.format("Total de Salas: %d\nTotal de Turmas: %d\nTurmas Alocadas: %d\nEspaços Livres: %d\n", totalSalas, totalTurmas, turmasAlocadas, espacoLivre);
    }

    public String relatorioTurmasPorSala() {
        StringBuilder str = new StringBuilder(relatorioResumoEnsalamento());
        for (Sala sala : this.salas) {
            str.append(String.format("\n--- %s ---\n\n", sala.getDescricao()));
            for (TurmaEmSala turmaEmSala : this.ensalamento) 
                if (turmaEmSala.sala == sala) 
                    str.append(String.format("%s\n", turmaEmSala.turma.getDescricao()));
            
        }
        return str.toString();
    }

    public String relatorioSalasPorTurma() {
        StringBuilder str = new StringBuilder(relatorioResumoEnsalamento());
        for (Turma turma : turmas) {
            str.append(String.format("\n%s", turma.getDescricao()));

            if (getSala(turma) != null) 
                str.append(String.format("\nSala: %s\n", getSala(turma).getDescricao()));
            else 
                str.append("\nSala: SEM SALA\n\n");
        }
        return str.toString();
    }
}
