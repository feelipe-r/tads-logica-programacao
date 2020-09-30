import java.util.Scanner;

public class l2e10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade do nadador:");
        int id = sc.nextInt();

        if(id>=18){
            System.out.println("Categoria - Adulto");
        }
        else if((id>=14)&&(id<18)){
            System.out.println("Categoria - Juvenil");
        }
        else if((id>=9)&&(id<14)){
            System.out.println("Categoria - Infantil");
        }else{
            System.out.println("Categoria - Mirim");
        }
    }
}