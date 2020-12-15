import java.util.Scanner;

public class Ex03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=10;

        System.out.print("Incrementando 1 em cada passo:\n");
        for(int i=10; i<=20; i++){
            if((i%2==0)&&(i!=16)){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nCom um loop infinito (break):");
        while(n>=10){
            if(n!=16){
                System.out.print(n+" ");
            }
            n = (n+2);

            if(n>20){
                break;
            }
        }
    }
}