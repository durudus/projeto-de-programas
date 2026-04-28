import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s = (a+b+c)/2;
        scan.close();
        
        if(a + b <= c || b + c <= a || a + c <= b){
            System.out.print("Triangulo invalido");
        }else{
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("%.2f", area);
        }
    }
}
