import java.util.Scanner;

public class l9e11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float[][] matriz = new float[12][4];
        float[] vet_m = new float[matriz.length];
        float[] vet_s = new float[matriz[0].length];
        float total_a = 0, total_m = 0, total_s = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.println("Informe o valor de vendas do mês "+(i+1)+" na semana "+(j+1)+":");
                matriz[i][j] = sc.nextFloat();
            }
        }
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                total_m = (total_m+matriz[i][j]);
            }
            total_a = (total_a+total_m); //Valor total durante o ano
            vet_m[i] = total_m; 
            total_m = 0; 
        }
        for(int i=0; i<matriz[0].length; i++){
            for(int j=0; j<matriz.length; j++){
                total_s = (total_s+matriz[j][i]);
            }
            vet_s[i] = total_s;
            total_s = 0;  
        }
        System.out.println("====================================");
        System.out.println("Total vendido em cada mês do ano:");
        for(int i=0; i<vet_m.length; i++){
            System.out.println("Mês "+(i+1)+": R$"+vet_m[i]);
        }
        System.out.println("====================================");
        System.out.println("Total vendido em cada semana do ano:");
        for(int i=0; i<vet_s.length; i++){
            System.out.println("Semana "+(i+1)+": R$"+vet_s[i]);
        }
        System.out.println("====================================");
        System.out.println("Total vendido no ano: R$"+total_a);
        System.out.println("====================================");
    }
}