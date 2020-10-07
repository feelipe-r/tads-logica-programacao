import java.util.Scanner;

public class l4e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int id;

        System.out.println("Informe uma idade:");
        id = sc.nextInt();

        while((id<1)||(id>150)){
            System.out.println("Idade inválida! Informe uma nova idade:");
            id = sc.nextInt();
        }
        System.out.println("Idade validada!");
    }
}