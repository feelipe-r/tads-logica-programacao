import java.util.Scanner;

public class Ex07{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int op=1, maior, menor, p, v;

        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe um valor para posicao "+i+" do vetor:");
            vetor[i] = sc.nextInt();
        }
        while(op!=0){
            System.out.println("Escolha uma opcao:");
            System.out.println("1-Atualizar uma posicao\n2-Mostrar vetor\n3-Maior valor do vetor\n4-Menor valor do vetor\n0-Sair");
            op = sc.nextInt();

            maior = vetor[0];
            menor = vetor[0];
            
            if(op==0){
                break;
            }
            switch(op){
                case 1:
                    System.out.println("Informe a posicao do vetor que deseja atualizar:");
                    p = sc.nextInt();

                    while((p<0)||(p>vetor.length-1)){
                        System.out.println("Posicao invalida! Informe uma nova posicao:");
                        p =sc.nextInt();
                    }
                    System.out.println("Informe um novo valor para posicao:");
                    v = sc.nextInt();

                    vetor[p] = v;
                    break;

                case 2:
                    System.out.print("Vetor:\n[");
                    for(int i=0; i<vetor.length; i++){
                        if(i==vetor.length-1){
                            System.out.print(vetor[i]+"]\n");
                        }else{
                            System.out.print(vetor[i]+" ");
                        }
                    }
                    break;

                case 3:
                    for(int i=0; i<vetor.length; i++){
                        if(vetor[i]>maior){
                            maior = vetor[i];
                        }
                    }
                    System.out.println("Maior valor do vetor: "+maior);
                    break;

                case 4:
                    for(int i=0; i<vetor.length; i++){
                        if(vetor[i]<menor){
                            menor = vetor[i];
                        }
                    }
                    System.out.println("Menor valor do vetor: "+menor);
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}