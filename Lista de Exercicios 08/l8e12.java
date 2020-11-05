import java.util.Scanner;

public class l8e12{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] id = new int[10];
        int maior_id=0, menor_id=0;

        for(int i=0; i<id.length; i++){
            System.out.println("Informe uma idade para posição "+i+" do vetor:");
            id[i] = sc.nextInt();

            if(id[i]>18){
                maior_id++;
            }
            else if(id[i]<18){
                menor_id++;
            }
        }
        System.out.println("Pessoas maior de idade: "+maior_id);
        System.out.println("Pessoas menor de idade: "+menor_id);
    }
}