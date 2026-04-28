import java.util.Scanner;
public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int num = scan.nextInt();
        boolean continua = true;
        int div = 0;

        while(continua){
            while (num != -1){
                soma = soma + num;
                num = scan.nextInt();
                div++;
            }
            
            if(num == -1){
                float media = (float)soma/div;
                System.out.printf("%.2f\n", media);
                soma = 0;
                div = 0;
                num = scan.nextInt();
                if(num == -1){
                    scan.close();
                    continua = false;
                }
            }
        }
    }
}

