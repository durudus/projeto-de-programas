
import java.util.ArrayList;
import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int num = scan.nextInt();
        boolean continua = true;
        
        while(continua){
            while (num != -1){
                soma = soma + num;
                num = scan.nextInt();
            }
            
            if(num == -1){
                System.out.println(soma);
                soma = 0;
                num = scan.nextInt();
                if(num == -1){
                    scan.close();
                    continua = false;
                }
            }
        }


    }
}
