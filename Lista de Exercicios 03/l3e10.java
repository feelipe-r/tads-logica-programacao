import java.util.Scanner;

public class l3e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int sx;
        float h, peso;

        System.out.println("Informe o sexo:\n1-Feminino\n2-Masculino");
        sx = sc.nextInt();

        System.out.println("Informe a altura:");
        h = sc.nextFloat();

        if(sx==1){
            peso = ((62.1f*h)-44.7f);
            System.out.printf("Peso ideal: %.2f%n",peso);
        }else{
            peso = ((72.7f*h)-58f);
            System.out.printf("Peso ideal: %.2f%n",peso);
        }
    }
}