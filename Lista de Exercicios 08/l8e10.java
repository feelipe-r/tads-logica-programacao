import java.util.Scanner;

public class l8e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int soma=0;

        for(int i=0; i<v1.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor [v1]:");
            v1[i] = sc.nextInt();

            soma = (soma+v1[i]);

            if(i==0){
                v2[i] = v1[i];
            }else{
                v2[i] = soma;
            }
        }
        System.out.print("Vetor v[1]:\n[ ");
        for(int i=0; i<v1.length; i++){
            System.out.print(v1[i]+" ");
        }
        System.out.print("]\nVetor v[2]:\n[ ");
        for(int i=0; i<v2.length; i++){
            System.out.print(v2[i]+" "); 
        }
        System.out.print("]");
    }
}