import java.util.Scanner;

public class l4e14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int aux=1, n, a=0, b=0, mult=1, soma=0;

        while(aux<=10){
            System.out.println("Informe um número:");
            n = sc.nextInt();

            if((n>=1)&&(n<=10)){
                mult = (mult*n);
                a++;
            }else{
                soma = (soma+n);
                b++;
            }
            aux++;
        }
        System.out.println("Quantidade de números informados no intervalo [1][10]: "+a);
        System.out.println("Multiplicação entre os números dentro do intervalo: "+mult);
        System.out.println("Quantidade de números informados fora do intervalo: "+b);
        System.out.println("Soma entre os números fora do intervalo: "+soma);
    }
}