import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alturaTotal = scan.nextDouble();
        double alturaCombustivel = scan.nextDouble();
        double raio = scan.nextDouble();
        double volumeTotal = 0;

        if(alturaTotal > 0){
            double volumeEsfera = (4.0/3.0)*Math.PI*Math.pow(raio,3)/2;
            double volumeCilindro = Math.PI*Math.pow(raio,2)*(alturaCombustivel - raio);

            if(alturaTotal > alturaCombustivel && alturaCombustivel <= alturaTotal - raio && alturaCombustivel >= raio){
                volumeTotal = volumeEsfera + volumeCilindro;
            }else if (alturaCombustivel < raio) {
                volumeTotal = (Math.PI/3.0)*Math.pow(alturaCombustivel, 2)*(3*raio - alturaCombustivel);
            }else if(alturaTotal == alturaCombustivel){
                volumeEsfera /= 2;
                volumeTotal = volumeEsfera + volumeCilindro + volumeEsfera;
            }
            System.out.printf("%.3f", volumeTotal);
        }else{
            System.out.print("-1.000");
        }

        scan.close();
    }
}
