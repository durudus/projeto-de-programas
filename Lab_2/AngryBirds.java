import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v0 = scan.nextDouble();
        double angulo = scan.nextDouble();
        double anguloRad = Math.toRadians(angulo);
        double distanciaPP = scan.nextDouble();

        scan.close();

        double alcanceMax = (Math.pow(v0, 2) * 
                            Math.sin(2*anguloRad))/9.8;
        
        boolean atinge = Math.abs(alcanceMax - distanciaPP) <= 0.1;
        System.out.print(atinge ? 1 : 0);
        
    }
}
