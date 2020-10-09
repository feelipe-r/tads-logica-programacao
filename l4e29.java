import java.util.Scanner;

public class l4e29{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int aux=100, a=0, dig1, dig2, dig3, dig_aux, prod;

        while(aux<1000){
            dig1 = (aux/100);
            dig_aux = (aux%100);
            dig2 = (dig_aux/10);
            dig3 = (dig_aux%10);
            prod = (dig1*dig2*dig3);
            
            System.out.println("Número: "+aux+" - Produto dos digitos: "+prod);
            
            aux++;
            a++;

            if(a==20){
                System.out.println(" ");

                while(a!=0){
                    System.out.println("Para continuar digite 0:");
                    a = sc.nextInt();
                }
                System.out.println(" ");
            }
        }
    }
}