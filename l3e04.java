import java.util.Scanner;

public class l3e04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor1, valor2, valor3;

        System.out.println("Informe três valores:");
        valor1 = sc.nextFloat();
        valor2 = sc.nextFloat();
        valor3 = sc.nextFloat();

        if((valor1<valor2)&&(valor2<valor3)){
            System.out.println("Valores em ordem crescente: "+valor1+" "+valor2+" "+valor3);
        }
        else if((valor1<valor3)&&(valor3<valor2)){
            System.out.println("Valores em ordem crescente: "+valor1+" "+valor3+" "+valor2);
        }
        else if((valor2<valor1)&&(valor1<valor3)){
            System.out.println("Valores em ordem crescente: "+valor2+" "+valor1+" "+valor3);
        }
        else if((valor2<valor3)&&(valor3<valor1)){
            System.out.println("Valores em ordem crescente: "+valor2+" "+valor3+" "+valor1);
        }
        else if((valor3<valor1)&&(valor1<valor2)){
            System.out.println("Valores em ordem crescente: "+valor3+" "+valor1+" "+valor2);
        }else{
            System.out.println("Valores em ordem crescente: "+valor3+" "+valor2+" "+valor1);
        }
    }
}