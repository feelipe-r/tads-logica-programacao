import java.util.Scanner;

public class l8e07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=0, vencedor=0, pst=0;
        int[] vetor = new int[9999];
        int[] votos = new int[5];

        System.out.println("Candidatos:\n[1]-Candidato 1\n[2]-Candidato 2\n[3]-Candidato 3\n[4]-Candidato 4\n[5]-Candidato 5");

        while(a<vetor.length){
            System.out.println("Informe o voto "+(a+1)+":");
            vetor[a] = sc.nextInt();
            
            if((vetor[a]<1)||(vetor[a]>5)){
                break;
            }
            else if(vetor[a]==1){
                votos[0]++;
            }
            else if(vetor[a]==2){
                votos[1]++;
            }
            else if(vetor[a]==3){
                votos[2]++;
            }
            else if(vetor[a]==4){
                votos[3]++;
            }else{
                votos[4]++;
            }
            a++;  
        }
        System.out.println("Tabela de votos:");
        for(int i=0; i<votos.length; i++){
            if(votos[i]>vencedor){
                vencedor = votos[i];
                pst = (i+1);
            }
            System.out.println("Candidato: "+(i+1)+" - Votos: "+votos[i]);
        }
        System.out.println("Candidato vencedor: "+pst+"\nNúmero de votos: "+vencedor);
    }
}