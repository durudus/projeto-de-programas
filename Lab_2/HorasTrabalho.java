import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sum;
        while(num != -1){
            sum = num;
            for(int i = 0; i < 6; i++){
                num = scan.nextInt();
                sum = sum + num;
            }

            System.out.println(sum);
            num = scan.nextInt();
        }
    }
}
