public class Carro {
    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;

    public Carro(String modelo, String marca, Proprietario proprietario, Placa placa, Motor motor){
        this.modelo = modelo;
        this.marca = marca;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    public String getDescricao(){
        return String.format("Carro %s/%s. %s %s %s", this.modelo, this.marca, proprietario.getDescricao(), placa.getDescricao(),motor.getDescricao());
    }
}


