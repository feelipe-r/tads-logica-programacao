import java.util.Scanner;

public class l6e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n, t;

        System.out.println("Informe um valor:");
        n = sc.nextInt();
        t = (n*2);
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<t; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            t = (t-2);
        }
    }
}