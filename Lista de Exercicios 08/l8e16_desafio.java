import java.util.Scanner;

public class l8e16_desafio{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[v1.length+v2.length];
        int a=0, aux;

        for(int i=0; i<10; i++){
            if(i<5){
                System.out.println("Informe um valor para posição "+i+" do vetor 1:");
                v1[i] = sc.nextInt();
                v3[i] = v1[i];
            }else{
                System.out.println("informe um valor para posição "+a+" do vetor 2:");
                v2[a] = sc.nextInt();
                v3[i] = v2[a];
                a++;
            }
        }
        System.out.print("Vetor 3:\n[");
        for(int i=0; i<v3.length; i++){
            if(i==v3.length-1){
                System.out.print(v3[i]+"]");
            }else{
                System.out.print(v3[i]+" ");
            }
        }
        for(int i=0; i<v3.length-1; i++){
            for(int j=i+1; j<v3.length; j++){
                if(v3[i]>v3[j]){
                    aux = v3[i];
                    v3[i] = v3[j];
                    v3[j] = aux;
                }
            }
        }
        System.out.print("\nVetor 3 Ordenado:\n[");
        for(int i=0; i<v3.length; i++){
            if(i==v3.length-1){
                System.out.print(v3[i]+"]");
            }else{
                System.out.print(v3[i]+" ");
            }
        }
    }
}