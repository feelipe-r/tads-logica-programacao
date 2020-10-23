import java.util.Scanner;

public class l6e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char loop = 'S';
        int n;

        while(loop!='N'){
            System.out.println("Informe um número inteiro positivo:");
            n = sc.nextInt();

            while(n<1){
                System.out.println("Número inválido!\nInforme um novo número:");
                n = sc.nextInt();
            }
            for(int i=1; i<n; i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
            System.out.println("\nDeseja informar um novo número?\n[S]-Sim\n[N]-Não");
            loop = sc.next().charAt(0);
        }
    }
}