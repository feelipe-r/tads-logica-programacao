import java.util.Scanner;

public class l4e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;
        int x=1, a=0;

        System.out.println("Informe um número inteiro:");
        n = sc.nextInt();

        while(x<=n){
            if(n%x==0){
                a++;
            }
            x++;
        }
        if(a<=2){
            System.out.println("Número primo!");
        }else{
            System.out.println("NÃO é primo!");
        }
    }
}