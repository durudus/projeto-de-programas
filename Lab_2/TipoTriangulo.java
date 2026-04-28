import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        if(a + b <= c || b + c <= a || a + c <= b || 
            a < 0 || b < 0 || c < 0){
            System.out.print("invalido");
        }else{
            if(a == b && b == c){
                System.out.print("equilatero");
            }
    
            if((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
                System.out.print("isosceles");
            }
            if(a != b && b != c && a!= c){
                System.out.print("escaleno");
            }

        }



    }
}
