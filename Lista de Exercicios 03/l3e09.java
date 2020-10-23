import java.util.Scanner;

public class l3e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota_op, media;
        char op;

        System.out.println("Informe a nota da primeira avaliação:");
        nota1 = sc.nextFloat();

        System.out.println("Informe a nota da segunda avaliação:");
        nota2 = sc.nextFloat();

        System.out.println("Foi realizada avaliação optativa\n[S]-Sim\n[N]-Não");
        op = sc.next().charAt(0);

        if(op=='S'){
            System.out.println("Informe a nota da avaliação optativa:");
            nota_op = sc.nextFloat();
            
            if(nota1<nota2){
                nota1 = nota_op;
                media = ((nota1+nota2)/2);
            }else{
                nota2 = nota_op;
                media = ((nota1+nota2)/2);
            }
            if(media>=6){
                System.out.println("Aprovado!\nMédia: "+media);
            }
            else if((media<6)&&(media>3)){
                System.out.println("Exame!\nMédia: "+media);
            }else{
                System.out.println("Reprovado!\nMédia: "+media);
            }
        }else{
            media = ((nota1+nota2)/2);

            if(media>=6){
                System.out.println("Aprovado!\nMédia: "+media);
            }
            else if((media<6)&&(media>3)){
                System.out.println("Exame!\nMédia: "+media);
            }else{
                System.out.println("Reprovado!\nMédia: "+media);
            }
        }
    }
}