import java.util.Scanner;

public class ValorExpoente{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble(); 
        double sum = 0;
        int exp = 1;
        int flag = 1;

        while(flag == 1){
            sum = sum + Math.pow(2.0, exp);
        
            if(sum > num){
                System.out.printf("%d", exp);
                flag = 0;
            }
            exp = exp + 1;
        }
        
        scan.close();
    }
}