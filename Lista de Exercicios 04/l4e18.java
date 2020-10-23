import java.util.Scanner;

public class l4e18{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int aux=1, id=1, maior_id=0, menor_id=100;
        float soma_id=0, media_id;

        while(id!=0){
            System.out.println("Informe a idade da pessoa "+aux+":");
            id = sc.nextInt();

            if(id==0){
                break;
            }
            soma_id = (soma_id+id);

            if(id>maior_id){
                maior_id = id;
            }
            if(id<menor_id){
                menor_id = id;
            }
            aux++;
        }
        aux = (aux-1);
        media_id = (soma_id/aux);
        System.out.println("Número de pessoas: "+aux);
        System.out.printf("Idade média do grupo: %.2f%n",media_id);
        System.out.println("Maior idade do grupo: "+maior_id+"\nMenor idade do grupo: "+menor_id);
    }
}