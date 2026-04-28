public class Sala{
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    public Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public Sala(){
        this(0,0, 0,  true);
    }

    public String getDescricao(){
        String acesso = acessivel ? "acessível" : "não acessível";

        return String.format("Bloco %d, Sala  %d (%d lugares, %s)", this.bloco, this.sala, this.capacidade,acesso);
    }
}