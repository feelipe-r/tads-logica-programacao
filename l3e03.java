import java.util.Scanner;

public class l3e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor1, valor2, valor3, soma;

        System.out.println("Informe três valores:");
        valor1 = sc.nextFloat();
        valor2 = sc.nextFloat();
        valor3 = sc.nextFloat();

        if((valor1>valor2)&&(valor2>valor3)){
            soma = (valor1+valor2);
            System.out.println("Soma dos valores maiores: "+soma);
        }
        else if((valor1>valor3)&&(valor3>valor2)){
            soma = (valor1+valor3);
            System.out.println("Soma dos valores maiores: "+soma);
        }
        else if((valor2>valor1)&&(valor1>valor3)){
            soma = (valor2+valor1);
            System.out.println("Soma dos valores maiores: "+soma);
        }
        else if((valor2>valor3)&&(valor3>valor1)){
            soma = (valor2+valor3);
            System.out.println("Soma dos valores maiores: "+soma);
        }
        else if((valor3>valor1)&&(valor1>valor2)){
            soma = (valor3+valor1);
            System.out.println("Soma dos valores maiores: "+soma);
        }else{
            soma = (valor3+valor2);
            System.out.println("Soma dos valores maiores: "+soma);
        }
    }
}