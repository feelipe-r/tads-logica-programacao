import java.util.Scanner;

public class l3e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor;

        System.out.println("Informe um valor:");
        valor = sc.nextFloat();

        if(valor>0){
            System.out.println("Valor positivo!");
        }
        else if(valor==0){
            System.out.println("Valor ZERO!");
        }
        else if(valor<0){
            System.out.println("Valor negativo!");
        }
    }
}