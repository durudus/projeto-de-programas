
import java.util.Scanner;

class Fahrenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        float celsius = scan.nextFloat();
        float fahrenheit = ((9*celsius)/5) + 32;
        scan.close();
        System.out.printf("%.1f", fahrenheit);
    }
}
