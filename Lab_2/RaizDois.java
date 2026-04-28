import java.util.Scanner;

class RaizDois{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble(); 
        double den = 1;
        double raizDois;
        for(int i = 0; i < num; i++){
            den = 2 + 1/den;
            raizDois = 1 + 1/den;
            System.out.printf("%.14f\n", raizDois);
        }
        scan.close();
     
    }

}