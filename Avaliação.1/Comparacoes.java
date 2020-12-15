import java.util.Scanner;

public class Comparacoes{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        int valor, p=0, z=0, n=0;

        for(int i=1; i<=100; i++){
            System.out.println("Informe o valor "+i+":");
            valor = in.nextInt();

            if(valor>0){
                p++;
            }
            else if(valor==0){
                z++;
            }
            else if(valor<0){
                n++;
            }
        }
        System.out.println("Quantidade de valores maiores do que ZERO: "+p);
        System.out.println("Quantidade de valores iguais a ZERO: "+z);
        System.out.println("Quantidade de valores menores do que ZERO: "+n);
    }   
}