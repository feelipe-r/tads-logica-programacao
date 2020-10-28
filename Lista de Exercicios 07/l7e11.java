import java.util.Scanner;

public class l7e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        char op;
        int a, b, r;

        System.out.println("Informe o tipo de operação:\n[S]-Soma\n[B]-Subtração\n[M]-Multiplicação\n[D]-Divisão");
        op = sc.next().charAt(0);

        System.out.println("Informe os números para efetuar o cálculo:");
        a = sc.nextInt();
        b = sc.nextInt();

        switch(op){
            case 'S':
                r = (a+b);
                System.out.println("Resultado: "+r);
                break;

            case 'B':
                r = (a-b);
                System.out.println("Resultado: "+r);
                break;

            case 'M':
                r = (a*b);
                System.out.println("Resultado: "+r);
                break;

            case 'D':
                r = (a/b);
                System.out.println("Resultado: "+r);
                break;

            default:
                System.out.println("Operação inválida!");
        }
    }
}