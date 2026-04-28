import java.util.Scanner;

class AproximacaoSeno{ 
    public static double fatorial(double num){
        if(num == 1.0 || num == 0){
            return 1.0;
        }else{
            return fatorial(num - 1) * num;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ang = scan.nextDouble();
        ang = Math.toRadians(ang);
        double num = scan.nextDouble(); 
        double sen = 0;
        double fat;

        for(int i = 0; i < num; i++){
            for(int j = 0; j < i + 1; j++){
                fat = fatorial(2*j + 1);

                if(j % 2 == 0){
                    sen = sen + Math.pow(ang, (2*j + 1))/fat;
                }
                else{
                    sen -= Math.pow(ang,(2*j + 1))/fat;
                }
            }

            System.out.printf("%.10f\n", sen);
            sen = 0;
        }
        scan.close();
    }
}