import java.util.Scanner;

public class l6e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int x;
        double ex, fat, rx;

        System.out.println("Informe o valor de X:");
        x = sc.nextInt();

        ex = (1+x);

        for(int i=2; i<=x; i++){
            fat = i;
            rx = 1;
            
            for(int j=1; j<i; j++){
                fat = (fat*j);
            }
            for(int l=1; l<=i; l++){
                rx = (rx*x);
            }
            ex = (ex+(rx/fat)); 
        }
        System.out.println("EX = "+ex);
    }
}