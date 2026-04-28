public class Motor {
    int tipo;
    double capacidade;
    int potencia;

    public Motor(int tipo, double capacidade, int potencia){
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    public Motor(){
        this(0, 0.0, 0);
    }

    public String getTipoString(){
        switch (this.tipo) {
            case 1:
                return "Gasolina";
            case 2:
                return "Alcool";
            case 3:
                return "Flex";
            case 4:
                return "Diesel";
            case 5:
                return "Eletrico";
            default:
                return "Outros";
        }
    }

    public String getDescricao(){
        return String.format("Motor: tipo=%s, capacidade=%.1fL, potencia=%dCV.", this.getTipoString(), this.capacidade, this.potencia);
    }
}
