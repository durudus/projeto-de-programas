public class CarroMain {
    public static void main(String[] args) {
        Proprietario euProprietario = new Proprietario("Jaide",12354166,2012 );
        // System.out.println(euProprietario.getDescricao());
        // euProprietario.nome = "fafa";
        // System.out.println(euProprietario.getDescricao());

        Placa novaPlaca = new Placa("OB2-9875", 6);
        // System.out.println(novaPlaca.getDescricao());
        
        Motor novoMotor = new Motor(1, 0.0, 130);
        // System.out.println(novoMotor.getDescricao());

        Carro novoCarro = new Carro("DECOLAR", "BYD", euProprietario, novaPlaca, novoMotor);
        System.out.println(novoCarro.getDescricao());
    }

}
