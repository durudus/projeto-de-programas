import java.util.Scanner;

class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float input1 = scanner.nextFloat();
        float input2 = scanner.nextFloat();
        float input3 = scanner.nextFloat();

        scanner.close();
        
        float sum = input1 + input2 + input3;
        float media = sum/3;
        
        System.out.printf("%.2f", media);
    }
}
