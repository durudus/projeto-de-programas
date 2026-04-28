import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        double valor;
        int horas;
        try (Scanner scan = new Scanner(System.in)) {
            valor = scan.nextDouble();
            horas = scan.nextInt();
        }

        double salarioBruto = (double)valor*horas;
        double IR = (salarioBruto*(0.11));
        double INSS = (salarioBruto*(0.08));
        double totalDescontos = IR + INSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
        System.out.printf("IR: R$%.2f\n", IR);
        System.out.printf("INSS: R$%.2f\n", INSS);
        System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);
        System.out.printf("Salario liquido: R$%.2f", salarioLiquido);
    }
}
