import java.util.Scanner;

public class l4e21{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=1, maior_par=0, p=0, menor_impar=9999, i=0;
        float soma_par=0, soma_impar=0, media_par, media_impar;

        while(n>0){
            System.out.println("Informe um número:");
            n = sc.nextInt();

            if(n<=0){
                break;
            }

            if(n%2==0){
                soma_par = (soma_par+n);
                p++;

                if(n>maior_par){
                    maior_par = n;
                }
            }
            if(n%2!=0){
                soma_impar = (soma_impar+n);
                i++;

                if(n<menor_impar){
                    menor_impar = n;
                }
            }
        }
        media_par = (soma_par/p);
        media_impar = (soma_impar/i);
        System.out.println("Quantidade de números pares: "+p+"\nQuantidade de números ímpares: "+i);
        System.out.println("Média dos números pares: "+media_par+"\nMédia dos número ímpares: "+media_impar);
        System.out.println("Maior número par: "+maior_par+"\nMenor número ímpar: "+menor_impar);
    }
}