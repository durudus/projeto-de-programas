import java.util.Scanner;

class CifraCesar{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tam = scan.nextInt();
        String frase = scan.nextLine();
        char newChar;
        
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
                if((int) (frase.charAt(i) + tam) > 122){
                    newChar = (char) (frase.charAt(i)+tam);
                    newChar = (char) (96 + newChar - 122);
                }else{
                    newChar = (char) (frase.charAt(i)+ tam);
                }
                
                System.out.printf("%C", newChar);
            }else{
                if(i != 0){
                    System.out.printf("%C", frase.charAt(i));
                }
            }
        }
        scan.close();
    }
    
}