import java.util.Scanner;

public class FatoresPrimos{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        int numero, a=0;

        System.out.println("Informe o numero a ser decomposto em fatores primos:");
        numero = in.nextInt();

        for(int i=2; i<=numero; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    a++;
                }
            }
            if((a==0)&&(numero%i==0)){
                while(numero%i==0){
                    System.out.print(i+" ");
                    numero = (numero/i);
                }
                System.out.println(" ");
            }
            a=0;
        }
    }
}