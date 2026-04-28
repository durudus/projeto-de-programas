public class TurmaEmSala {
    Turma turma;
    Sala sala;

    public TurmaEmSala(Turma turma, Sala sala){
        this.turma = turma;
        this.sala = sala;
    }

    public TurmaEmSala(){
        this(null, null);
    }

}
