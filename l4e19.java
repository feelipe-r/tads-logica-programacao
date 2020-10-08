import java.util.Scanner;

public class l4e19{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, aux=1, fib=0, seq=1; 

        System.out.println("Informe a quantidade de números da sequência:");
        n = sc.nextInt();

        while(aux<=n){
            System.out.print(fib+" ");
            seq = (seq+fib);
            fib = (seq-fib);
            aux++;   
        }
    }
}