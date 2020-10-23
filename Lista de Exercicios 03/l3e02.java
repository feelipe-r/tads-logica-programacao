import java.util.Scanner;

public class l3e02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor1, valor2, valor3;

        System.out.println("Informe três valores:");
        valor1 = sc.nextFloat();
        valor2 = sc.nextFloat();
        valor3 = sc.nextFloat();

        if((valor1>valor2)&&(valor1>valor3)){
            System.out.println("Maior valor: "+valor1);
        }
        else if((valor2>valor1)&&(valor2>valor3)){
            System.out.println("Maior valor: "+valor2);
        }else{
            System.out.println("Maior valor: "+valor3);
        }
    }
}