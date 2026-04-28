public class Placa {
    String placa;
    int tipo;

    public Placa(String placa, int tipo){
        this.placa = placa;
        this.tipo = tipo;
    }

    public Placa(){
        this("", 0);
    }

    public String getTipoString(){
        switch (this.tipo) {
            case 1:
                return "Normal";
            case 2:
                return "Servico";
            case 3:
                return "Oficial";
            case 4:
                return "Auto Escola";
            case 5:
                return "Prototipo";
            case 6:
                return "Colecionador";
            default:
                return "Outros";
        }

    }

    public boolean temEstacionamentoLivre(){
        if(this.tipo == 2 || this.tipo == 3){
            return true;
        }else{
            return false;
        }
    }

    public String getDescricao(){
        return String.format("Placa: placa=%s, tipo=%s, estacionamentoLivre=%b.", this.placa, this.getTipoString(),this.temEstacionamentoLivre());
    }

}
