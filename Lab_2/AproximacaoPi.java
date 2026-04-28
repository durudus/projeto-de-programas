import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        double d1 = 2;
        double d2 = 3;
        double d3 = 4;
        double piAprox = 3;
        
        for(int i = 0; i < num; i++){
            if(i % 2 == 0 && i != 0){
                piAprox = piAprox - (4.0/(d1*d2*d3));
                d1 += 2;
                d2 += 2;
                d3 += 2;

            }else if (i % 2 == 1) {
                piAprox = piAprox + (4.0/(d1*d2*d3));
                d1 += 2;
                d2 += 2;
                d3 += 2;
            }

            System.out.printf("%.6f\n", piAprox);
        }


        scan.close();
    }
}
