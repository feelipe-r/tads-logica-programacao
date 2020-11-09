import java.util.Scanner;

public class l8e13{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[12];
        int x, y, soma;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("Vetor:\n[");
        for(int i=0; i<vetor.length; i++){
            if(i==vetor.length-1){
                System.out.print(vetor[i]+"]");
            }else{
                System.out.print(vetor[i]+" ");
            }
        }
        while((x>=0)&&(y>=0)){
            System.out.println("\nInforme duas posições do vetor:");
            x = sc.nextInt();
            y = sc.nextInt();

            soma = (vetor[x]+vetor[y]);
            System.out.println("Soma dos valores nas posições informadas: "+soma);
        }
    }
}
