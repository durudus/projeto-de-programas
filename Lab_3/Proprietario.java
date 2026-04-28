public class Proprietario {
    String nome;
    int cnh;
    int anoNascimento;

    public Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    public Proprietario(){
        this(" ", 0 ,0);
    }

    public int getIdade(int anoReferencia){
        return  anoReferencia - this.anoNascimento;
    }

    public String getDescricao(){
        return String.format("Proprietario: nome=%s, cnh=%d, anoNascimento=%d.", nome, cnh, anoNascimento);
    }

}
