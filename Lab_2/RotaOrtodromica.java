import java.util.Scanner;
import java.util.regex.Matcher;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t1 = scan.nextDouble(); 
        double t1Rad = Math.toRadians(t1); 
        double g1 = scan.nextDouble();
        double g1Rad = Math.toRadians(g1);
        double t2 = scan.nextDouble();
        double t2Rad = Math.toRadians(t2);
        double g2 = scan.nextDouble();
        double g2Rad = Math.toRadians(g2);
        scan.close();

        double d = 6371 * Math.acos(Math.sin(t1Rad) * 
                                    Math.sin(t2Rad) +
                                    Math.cos(t1Rad) *
                                    Math.cos(t2Rad) *
                                    Math.cos(g1Rad - g2Rad));

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", t1,g1,t2,g2, d);
    }
}
