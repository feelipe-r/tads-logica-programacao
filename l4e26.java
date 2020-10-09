import java.util.Scanner;

public class l4e26{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int vt=1, e=1, cdt_a=0, cdt_b=0, cdt_c=0, branco=0, nulo=0;
        String vencedor = " ";

        while(vt>0){
            System.out.println("Informe o voto do eleitor "+e+":\n[1]-Candidato A\n[2]-Candidato B\n[3]-Candida C\n[4]-Branco\n[5]-Nulo");
            vt = sc.nextInt();

            if(vt<=0){
                break;
            }
            if(vt==1){
                cdt_a++;
            }
            else if(vt==2){
                cdt_b++;
            }
            else if(vt==3){
                cdt_c++;
            }
            else if(vt==4){
                branco++;
            }else{
                nulo++;
            }
            e++;
        }
        if((cdt_a>cdt_b)&&(cdt_a>cdt_c)){
            vencedor = "Candidato A";
        }
        else if((cdt_b>cdt_a)&&(cdt_b>cdt_c)){
            vencedor = "Candidato B";
        }
        else if((cdt_c>cdt_a)&&(cdt_c>cdt_b)){
            vencedor = "Candidato C";
        }
        e = (e-1);
        System.out.println("Número de eleitores que compareceram as urnas: "+e);
        System.out.println("Número de votos em branco: "+branco+"\nNúmero de votos nulos: "+nulo);
        System.out.println("Vencedor: "+vencedor);
    }
}