import java.util.Scanner;

public class l6e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, seq=1, fib=0;

        System.out.println("Informe um número:");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(fib+" ");
            seq = (seq+fib);
            fib = (seq-fib);
        }
    }
}