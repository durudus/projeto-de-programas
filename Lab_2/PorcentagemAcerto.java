
import java.util.ArrayList;
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        ArrayList<Integer> respostas = new ArrayList<>();
        ArrayList<Integer> gabarito = new ArrayList<>();
        int num = scan.nextInt();
        int numQuestoes = 0;
        while(num != -1){
            respostas.add(num);
            num = scan.nextInt();
            numQuestoes++;
        }

        if(num == -1){
            num = scan.nextInt();
            while(num != -1){
            gabarito.add(num);
            num = scan.nextInt();
            }
        }
        
        int acertos = 0;
        for(int i = 0; i < respostas.size(); i++){
            if(respostas.get(i) == gabarito.get(i)){
                acertos++;
            }
        }
        
        float porcentagem = (float)acertos * 100/numQuestoes;

        System.out.printf("%.2f", porcentagem);

        scan.close();
    }

        
}
