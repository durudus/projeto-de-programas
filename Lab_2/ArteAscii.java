
import java.util.Scanner;

class ArteAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numAsterisco = scan.nextInt();
        scan.close();
        char[] vetor = new char[numAsterisco];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = '*';
        }

        while(numAsterisco >= 1){
            for(int i = 0; i < numAsterisco; i++){
                System.out.print(vetor[i]);
            }
            if(numAsterisco != 1){
                System.out.println();
            }
            numAsterisco--;
        }

        while (numAsterisco <= vetor.length) { 
            for(int i = 0; i < numAsterisco; i++){
                System.out.print(vetor[i]);
            }
            System.out.println();
            numAsterisco++;
        }
    }    
}
