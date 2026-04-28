import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double compra = scan.nextDouble();

        if(compra >= 200){
            double desconto = 0.05 * compra;
            compra = compra - desconto;
        }

        System.out.printf("%.2f", compra);
    }
}
