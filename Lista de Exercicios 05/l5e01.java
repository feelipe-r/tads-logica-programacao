import java.util.Scanner;

public class l5e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int notas100=0, notas50=0, notas20=0, notas10=0, notas5=0, notas2=0;
        int moedas1=0, moedas50=0, moedas25=0, moedas10=0, moedas5=0, moedas_r=0;
        float valor;

        System.out.println("Informe um valor:");
        valor = sc.nextFloat();

        if(valor>=100){
            notas100 = (int)(valor/100.0f);
            valor = (valor%100);
        }
        if(valor>=50){
            notas50 = (int)(valor/50.0f);
            valor = (valor%50);
        }
        if(valor>=20){
            notas20 = (int)(valor/20.0f);
            valor = (valor%20);
        }
        if(valor>=10){
            notas10 = (int)(valor/10.0f);
            valor = (valor%10);
        }
        if(valor>=5){
            notas5 = (int)(valor/5.0f);
            valor = (valor%5);
        }
        if(valor>=2){
            notas2 = (int)(valor/2.0f);
            valor = (valor%2);
        }
        if(valor>=1){
            moedas1 = (int)(valor/1.0f);
            valor = (valor%1);
        }
        if(valor>=0.50f){
            moedas50 = (int)(valor/0.50f);
            valor = (valor%0.50f);
        }
        if(valor>=0.25f){
            moedas25 = (int)(valor/0.25f);
            valor = (valor%0.25f);
        }
        if(valor>=0.10f){
            moedas10 = (int)(valor/0.10f);
            valor = (valor%0.10f);
        }
        if(valor>=0.05f){
            moedas5 = (int)(valor/0.05f);
            valor = (valor%0.05f);
        }
        if(valor>=0.01f){
            moedas_r = (int)(valor/0.01f);
        }
        System.out.println("NOTAS:");
        System.out.println(notas100+" Nota(s) de 100\n"+notas50+" Nota(s) de 50\n"+notas20+" Nota(s) de 20\n"+notas10+" Nota(s) de 10\n"+notas5+" Nota(s) de 5\n"+notas2+" Nota(s) de 2");
        System.out.println("MOEDAS:");
        System.out.println(+moedas1+" Moeda(s) de 1\n"+moedas50+" Moeda(s) de 0.50\n"+moedas25+" Moeda(s) de 0.25\n"+moedas10+" Moeda(s) de 0.10\n"+moedas5+" Moeda(s) de 0.05\n"+moedas_r+" Moeda(s) de 0.01");
    }
}