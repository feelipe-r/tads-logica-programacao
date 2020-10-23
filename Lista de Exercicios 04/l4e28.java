import java.util.Scanner;

public class l4e28{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int notas100=0, notas50=0, notas10=0, notas5=0, notas1=0, valor;

        System.out.println("Informe um valor:");
        valor = sc.nextInt();

        while(valor!=0){
            if(valor>=100){
                notas100 = (valor/100);
                valor = (valor%100);
            }
            else if(valor>=50){
                notas50 = (valor/50);
                valor = (valor%50);   
            }
            else if(valor>=10){
                notas10 = (valor/10);
                valor = (valor%10);
            }
            else if(valor>=5){
                notas5 = (valor/5);
                valor = (valor%5);
            }
            else if(valor>=1){
                notas1 = (valor/1);
                valor = (valor%1);
            }
        }
        System.out.println(notas100+" Nota(s) de 100\n"+notas50+" Nota(s) de 50\n"+notas10+ " Nota(s) de 10\n"+notas5+" Nota(s) de 5\n"+notas1+" Nota(s) de 1");
    }
}