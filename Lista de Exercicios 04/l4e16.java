import java.util.Scanner;

public class l4e16{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int x, y, pot, aux=1;

        System.out.println("Informe um número inteiro:");
        x = sc.nextInt();

        System.out.println("Informe o número do expoente:");
        y = sc.nextInt();

        pot = x;
        
        while(aux<y){
            pot = (pot*x);
            aux++;
        }
        System.out.println("Resultado da potência: "+pot);
    }
}
