import java.util.Scanner;

public class l2e06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma idade em anos/meses/dias:");
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int live = ((a*365)+(m*30)+d);

        System.out.println("Dias vividos: "+live);
    }
}