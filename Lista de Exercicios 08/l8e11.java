import java.util.Scanner;

public class l8e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t;
        
        System.out.println("Informe um tamanho para os vetores:");
        t = sc.nextInt();

        int[] vet_a = new int[t];
        int[] vet_b = new int[t];
        int[] vet_soma = new int[t];

        for(int i=0; i<vet_a.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor[a]:");
            vet_a[i] = sc.nextInt();
        }
        for(int i=0; i<vet_b.length; i++){
            System.out.println("Informe um valor para posição "+i+" do vetor[b]:");
            vet_b[i] = sc.nextInt();
            vet_soma[i] = (vet_a[i]+vet_b[i]);
        }
        System.out.print("Vetor[Soma]:\n[");
        for(int i=0; i<vet_soma.length; i++){
            if(i==vet_soma.length-1){
                System.out.println(vet_soma[i]+"]");
            }else{
                System.out.print(vet_soma[i]+" ");
            }
        }
    }
}