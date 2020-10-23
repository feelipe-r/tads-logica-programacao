import java.util.Scanner;

public class l6e08{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=0, dobro=1000; 

        while(n<=dobro){
            System.out.println("Informe um número inteiro positivo:");
            n = sc.nextInt(); 
            
            if(n>dobro){
                break;
            }
            dobro = (n+n);
        }   
    }
}