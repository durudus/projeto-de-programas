import java.util.Scanner;

public class DiaSemana {
    public static void maior(int vetor[]){
        int maior=vetor[0];

        for(int i = 0; i < 7; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        for(int i = 0;i < 7; i++) {
            if(vetor[i] == maior){
                 System.out.println(i+1);
            }
        }      
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[7];

        int num = scan.nextInt();
        while(num != -1){
            vetor[0] += num;
            
            for(int i = 1; i < 7; i++){
                num = scan.nextInt();
                vetor[i] += num;
            }
            num = scan.nextInt();
        }

        maior(vetor);
        scan.close();
    }

    
}