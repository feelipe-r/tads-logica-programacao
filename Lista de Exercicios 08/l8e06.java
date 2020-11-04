import java.util.Scanner;

public class l8e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;
        
        System.out.println("Informe a quantidade de letras presentes na palavra:");
        t = sc.nextInt();
        
        char[] word = new char[t];

        for(int i=0; i<word.length; i++){
            System.out.println("Informe uma letra para posição "+i+" do vetor:");
            word[i] = sc.next().charAt(0);
        }
        for(int i=0; i<word.length; i++){
            System.out.print(word[i]);
        }
    }
}