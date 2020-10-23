import java.util.Scanner;

public class l5e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Informe quatro valores inteiros [A][B][C][D]:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if((b>c)&&(d>a)&&(c+d>a+b)&&(c>0)&&(d>0)&&(a%2==0)){
            System.out.println("Valores aceitos!");
        }else{
            System.out.println("Valores não aceitos!");
        }
    }
}