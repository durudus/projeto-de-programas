public class EnsalamentoMain {
    public static void main(String[] args) {
        Sala sala1 = new Sala(6, 101, 100, true);
        Sala sala2 = new Sala(6, 102, 50, true);
        Sala sala3 = new Sala(6, 103, 50, false);
        Sala sala4 = new Sala(6, 104, 100, false);

        // // System.out.println(sala1.getDescricao());

        Turma t1 = new Turma("Algoritmos e Estrutura de Dados I", "Edson", 60, true);
        t1.addHorario(1);
        t1.addHorario(15);
        t1.addHorario(29);

        Turma t3 = new Turma("Algoritmos e Estrutura de Dados II", "Cesar", 60, true);
        t3.addHorario(9);
        t3.addHorario(12);
        t3.addHorario(30);

        Turma t2 = new Turma("Introdução a Computação", "Alberto", 60, true);
        t2.addHorario(5);
        t2.addHorario(17);
        t2.addHorario(27);

        Turma t4 = new Turma("Redes", "Edjard", 100, false);
        t4.addHorario(10);
        t4.addHorario(25);
        t4.addHorario(30);

        // // System.out.println(t1.getDescricao());
        
        // TurmaEmSala s1 = new TurmaEmSala(t1, sala1);
    
        Ensalamento ft = new Ensalamento();
        ft.addSala(sala1);        
        ft.addSala(sala2);        
        ft.addSala(sala3);        
        ft.addSala(sala4);    
        ft.addTurma(t1);    
        ft.addTurma(t2);    
        ft.addTurma(t3);    
        ft.addTurma(t4);    
        ft.alocarTodas();

        System.out.println(ft.getSala(t4).getDescricao());
        System.out.println(ft.getTotalTurmasAlocadas());
        System.out.println(ft.getTotalEspacoLivre());
        System.out.println(ft.relatorioResumoEnsalamento());
        System.out.println(ft.relatorioTurmasPorSala());
        System.out.println(ft.relatorioSalasPorTurma());

    }
}
