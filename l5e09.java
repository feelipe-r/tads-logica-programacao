import java.util.Scanner;

public class l5e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, maior_n=0, ps=0;

        for(int i=1; i<=100; i++){
            System.out.println("Informe o número "+i+":");
            n = sc.nextInt();

            if(n>maior_n){
                maior_n = n;
                ps = i;
            }
        }
        System.out.println("Maior número informado: "+maior_n+"\nPosição: "+ps);
    }
}