import java.util.Scanner;

public class l4e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Informe um valor de 1 a 10:");
        n = sc.nextInt();

        while((n<1)||(n>10)){
            System.out.println("Informe um valor dentro do intervalo [1][10]");
            n = sc.nextInt();
        }
        System.out.println(n);
    }
}