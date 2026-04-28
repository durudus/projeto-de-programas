
import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int celula = scan.nextInt();
        String animal = " ";
        scan.close();
        switch (celula) {
            case 2:
                animal = "Tartaruga";
                break;
            case 5:
                animal = "Garça";
                break;
            case 10:
                animal = "Arara";
                break;
            case 20:
                animal = "Mico-leão-dourado";
                break;
            case 50:
                animal = "Onça-pintada";
                break;
            case 100:
                animal = "Garoupa";
                break;
            default:
                animal = "erro";
                break;
        }

        System.out.print(animal);
    }
}
