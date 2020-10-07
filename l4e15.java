import java.util.Scanner;

public class l4e15{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, aux=1, a=0;

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(aux<=n){
            if(n%aux==0){
                a++;
            }
            aux++;
        }
        if(a<=2){
            System.out.println("Número PRIMO!");
        }else{
            System.out.println("NÃO é primo!");
        }
    }
}