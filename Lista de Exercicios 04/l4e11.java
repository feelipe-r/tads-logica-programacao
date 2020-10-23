import java.util.Scanner;

public class l4e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float valor1, valor2, div;

        System.out.println("Informe o primeiro valor:");
        valor1 = sc.nextFloat();

        System.out.println("Informe o segundo valor:");
        valor2 = sc.nextFloat();

        while(valor2==0){
            System.out.println("O valor não pode ser ZERO! Informe um novo valor:");
            valor2 = sc.nextFloat();
        }
        div = (valor1/valor2);
        System.out.println("Divisão: "+div);
    }
}