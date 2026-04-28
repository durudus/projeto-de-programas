
import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> goalTeam1 = new ArrayList<>();
        ArrayList<Integer> goalTeam2 = new ArrayList<>();
        int num = scan.nextInt();

        while(num != -1){
            goalTeam1.add(num);
            num = scan.nextInt();
        }

        if(num == -1){
            num = scan.nextInt();
            while(num != -1){
                goalTeam2.add(num);
                num = scan.nextInt();
            }   
        }

        scan.close();

        int vitoria = 0;
        int empate = 0;
        int derrota = 0;
        for(int i = 0; i < goalTeam1.size(); i++){
            if(goalTeam1.get(i) > goalTeam2.get(i)){
                vitoria++;
            }
            if(goalTeam1.get(i).equals(goalTeam2.get(i))){
                empate++;
            }
            if (goalTeam1.get(i) < goalTeam2.get(i)) {
                derrota++;
            }
        }

        System.out.printf("%d %d %d", vitoria, empate, derrota);

    }
}
