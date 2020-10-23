import java.util.Scanner;

public class l6e03{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float alt=1, peso, imc;
        int p=1, ab_peso=0, peso_normal=0, sobrepeso=0, ob_g1=0, ob_g2=0, ob_g3=0;

        while(alt>0){
            System.out.println("Informe a altura da pessoa "+p+":");
            alt = sc.nextFloat();

            if(alt<=0){
                break;
            }
            System.out.println("Informe o peso da pessoa "+p+":");
            peso = sc.nextFloat();

            imc = (peso/(alt*alt));

            if(imc<=18.5f){
                ab_peso++;
            }
            else if((imc>18.5f)&&(imc<=24.9f)){
                peso_normal++;
            }
            else if((imc>24.9f)&&(imc<=29.9f)){
                sobrepeso++;
            }
            else if((imc>29.9)&&(imc<=34.9f)){
                ob_g1++;
            }
            else if((imc>34.9f)&&(imc>=39.9f)){
                ob_g2++;
            }else{
                ob_g3++;
            }
            p++;
        }
        System.out.println("Número de pessoas abaixo do peso: "+ab_peso);
        System.out.println("Número de pessoas com peso normal: "+peso_normal);
        System.out.println("Número de pessoas com sobrepeso: "+sobrepeso);
        System.out.println("Número de pessoas com grau I de obesidade: "+ob_g1);
        System.out.println("Número de pessoas com grau II de obesidade: "+ob_g2);
        System.out.println("Número de pessoas com grau III de obesidade: "+ob_g3);
    }
}