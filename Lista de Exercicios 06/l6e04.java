import java.util.Scanner;

public class l6e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n; 
        double fat, e=1;

        System.out.println("Informe um valor:");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            fat = i;
            for(int j=1; j<i; j++){
                fat = (fat*j);
            }
            e = (e+(1/fat));
        }
        System.out.println("E = "+e);
    }
}