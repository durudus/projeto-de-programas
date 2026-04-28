
import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        for (int row = 0; row < lines; row++) {
            if(row % 2 != 0){
                System.out.print(' ');
            }

            for(int col = 0; col < lines; col++){
                System.out.print("* ");

            }
            System.out.println();
        }

        scan.close();
    }
}
