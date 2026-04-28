import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Integer> armazenaNum = new ArrayList<>();
        while(num != -1){
            armazenaNum.add(num);
            num = scan.nextInt();
        }
        scan.close();

        
        int size = armazenaNum.size();
        int indexNum1 = size/2 - 1;
        int indexNum2 = indexNum1 + 1;
        if(armazenaNum.size() % 2 == 0){
            float media = (float)(armazenaNum.get(indexNum1) + armazenaNum.get(indexNum2))/2;

            System.out.printf("%.1f", media);
        }else{
            float media = (float)armazenaNum.get(indexNum2);

            System.out.printf("%.1f", media);
        }
    }
}
