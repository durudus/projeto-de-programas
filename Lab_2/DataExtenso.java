import java.util.Scanner;

class DataExtenso{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String months[] = {"janeiro","fevereiro","março","abril",
                        "maio","junho","julho","agosto",
                        "setembro","outubro","novembro","dezembro"};

        String entrada = scan.nextLine();
        String day = entrada.substring(0,2);
        String month = entrada.substring(2,4);
        String year = entrada.substring(4,8);

        System.out.println(day + " de " + months[Integer.parseInt(month) - 1] + " de " + year);
        scan.close();
    }
}