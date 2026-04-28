import java.util.Scanner;

class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int vetor[] = new int[50];
            int len = 0;

            int input = scan.nextInt();

            // vetor vazio (-1 imediato) encerra o programa
            if (input == -1) {
                break;
            }

            // lê os elementos do vetor até encontrar -1
            while (input != -1) {
                vetor[len] = input;
                len++;
                input = scan.nextInt();
            }

            // calcula as estatísticas
            int par = 0;
            int impar = 0;
            float somaTotal = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < len; i++) {
                if (vetor[i] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                somaTotal += vetor[i];
                if (vetor[i] > max) max = vetor[i];
                if (vetor[i] < min) min = vetor[i];
            }

            float media = somaTotal / len;

            System.out.println(len);
            System.out.println(par);
            System.out.println(impar);
            System.out.println((int)somaTotal);
            System.out.printf("%.2f%n", media);
            System.out.println(max);
            System.out.println(min);
        }

        scan.close();
    }
}