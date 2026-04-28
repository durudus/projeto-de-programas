import java.util.Scanner;

class NumeroNeperiano{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        double neperiano = 0;
        double fat = 1;

        if(num == 1){
            System.out.printf("%.6f\n", fat);
        }else{
            for(int i = 0 ; i < num; i++){
                
                if(i != 0){
                    fat = fat * i;
                }
                neperiano = neperiano + (1.0/fat);
            }
            System.out.printf("%.6f\n", neperiano);
        }

        scan.close();
    }
}