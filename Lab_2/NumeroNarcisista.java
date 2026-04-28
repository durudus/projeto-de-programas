import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rest, potencia = 0;
        double sum = 0.0;
        int temp1 = num;
        int temp2 = num;
        
        if(num != 0){
            while(temp1 > 0){
                temp1 = temp1/10;
                potencia++; 
            }
            while (temp2 > 0) { 
                rest = temp2 % 10;
                temp2 = temp2/10;
                sum = sum + Math.pow(rest, potencia);
            }

            if(sum == num){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
        }else{
            System.out.println("NAO");
        }
        scan.close();
    }
}
