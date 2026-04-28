
import java.util.ArrayList;
import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int falta = scan.nextInt();
        int[] week = {0, 0, 0, 0, 0, 0, 0};
        int len = 0;
        
        while(falta != -1){
            week[falta -1] = week[falta -1] + 1;                
            len++;
            falta  = scan.nextInt();
        }

        for(int i = 1; i < 7; i++){
            double porcentagem = (week[i]/(double)len)*100.0;
            System.out.printf("%.1f ", porcentagem);
        }
        
        scan.close();

    }
}
