import java.util.Scanner;

public class Ex04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=1;

        while(n!=0){
            System.out.println("Informe um valor:");
            n = sc.nextInt();

            if(n==0){
                break;
            }
            else if(n%3==0){
                continue;
            }
            else{
                for(int i=0; i<n; i++){
                    if(i%2==0){
                        System.out.print(i+" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}