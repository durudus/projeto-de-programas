import java.util.Scanner;

class SomaDigitos{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rest; 
        int sum = 0;
        scan.close();
        
        while(number>0){
            rest = number % 10;
            number = number/10;
            sum += rest;
        }

        System.out.printf("%d", sum);
    }
}