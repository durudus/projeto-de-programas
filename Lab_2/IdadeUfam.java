
import java.util.Scanner;

class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoAtual = scan.nextInt();
        int fundacaoUfam = 1909;
        int idadeUfam = anoAtual-fundacaoUfam;
        scan.close();
        
        System.out.printf("A UFAM tem %d anos de fundacao", idadeUfam);
    }
}
