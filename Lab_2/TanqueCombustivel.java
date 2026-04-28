
import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double altura = scan.nextDouble();
        double opcao = scan.nextDouble();

        scan.close();
        double volumeAr = (Math.PI)/3 * Math.pow(altura, 2) * (3*raio - altura);
        double volumeCombustivel = (4.0/3 * (Math.PI) * Math.pow(raio, 3)) - volumeAr;

        if(opcao == 1){
            System.out.printf("%.4f", volumeAr);
        }else{
            System.out.printf("%.4f", volumeCombustivel);
        }


    }
}
