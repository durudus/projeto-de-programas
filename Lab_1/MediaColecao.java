
import java.util.Scanner;

class MediaColecao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int div = 0;
        int sum = 0;

        int input = scan.nextInt();
        
        while(input != -1){
            sum = sum + input;
            div++;
            input = scan.nextInt();
        }
        scan.close();
        
        float media = (float)sum/div;
        System.out.printf("%.2f", media);
    }
}
