import java.util.Scanner;

public class AproximacaoDePi{
    public static void main(String[] args){
      
        Scanner in = new Scanner(System.in);
        int iteracoes;
        double d=1, soma=0, pi;

        System.out.println("Quantas interacoes serao feitas?");
        iteracoes = in.nextInt();

        for(int i=1; i<=iteracoes; i++){
            if(i%2!=0){
                soma = (soma+(1/d));
            }else{
                soma = (soma-(1/d));
            }
            d = (d+2);    
        }
        pi = (soma*4);
        System.out.println("Aproximacao de PI: "+pi);
    }
}