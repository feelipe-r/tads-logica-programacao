import java.util.Scanner;

public class l3e05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float a, b, c;

        System.out.println("Informe as medidas A, B e C do triângulo:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if((a<b+c)&&(b<a+c)&&(c<a+b)){
            System.out.println("As medidas formam um triângulo!");
        }else{
            System.out.println("As medidas NÃO formam um triângulo!");
        }
    }
}