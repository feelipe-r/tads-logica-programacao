import java.util.Scanner;

public class l5e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int x=0, y=1;

        while(x!=y){
            System.out.println("Informe o valor de X:");
            x = sc.nextInt();

            System.out.println("Informe o valor de Y:");
            y = sc.nextInt();

            if(x==y){
                break;
            }
            else if(x>y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            a++;
        }
    }
}