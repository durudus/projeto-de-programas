public class TurmaMain {
    public static void main(String[] args){
        // Aluno n1 = new Aluno();
        // n1.nome = "isa";
        // n1.matricula = 12345;
        // n1.anoNascimento = 2000;

        // System.out.println(n1.getDescricao());
        
        // Professor p1Professor = new Professor();
        // p1Professor.titulacao = "Dr.";
        // p1Professor.nome = "Maria";
        // p1Professor.matricula = 2235;

        // System.out.println(p1Professor.getDescricao());

        Aluno aluno1 = new Aluno("Maria Eduarda", 2244, 2005 );
        Aluno aluno2 = new Aluno("Isabela Monteiro", 2255, 2005);
        Aluno aluno3 = new Aluno("Sofia Costa", 2233, 2003);
        
        Professor profT1 = new Professor("Dr.", "Hubert J. Farnsworth", 2208);

        
        Turma t1 = new Turma("Iniciação Tecnológica e Científica",2016 , 1, profT1);
        t1.addAluno(aluno1);
        t1.addAluno(aluno2);
        t1.addAluno(aluno3);

        System.out.println(t1.getDescricao());
    }
}
