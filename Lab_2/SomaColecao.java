
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int num = scan.nextInt();

        while (num != -1){
            soma = soma + num;
            num = scan.nextInt();
        }

        if(num == -1){
            System.out.print(soma);
        }
        scan.close();
    }
}
