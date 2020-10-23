import java.util.Scanner;

public class l6e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int soma_div=0;

        for(int i=1; i<=1000; i++){
            for(int j=1; j<i; j++){
                if(i%j==0){
                    soma_div = (soma_div+j);
                }
            }
            if(soma_div==i){
                System.out.println("Número perfeito: "+i);
            }
            soma_div=0;
        }
    }
}