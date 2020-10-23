import java.util.Scanner;

public class l5e14{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int var1, var2, var3, var4;

        System.out.println("Informe o comprimento de quatro varetas:");
        var1 = sc.nextInt();
        var2 = sc.nextInt();
        var3 = sc.nextInt();
        var4 = sc.nextInt();

        if((var1<var2+var3)&&(var2<var1+var3)&&(var3<var1+var2)){
            System.out.println("S\nÉ possivel formar um triângulo");
        }
        else if((var2<var3+var4)&&(var3<var2+var4)&&(var4<var2+var3)){
            System.out.println("S\nÉ possivel formar um triângulo");
        }
        else if((var1<var3+var4)&&(var3<var1+var4)&&(var4<var1+var3)){
            System.out.println("S\nÉ possivel formar um triângulo");
        }
        else if((var1<var2+var4)&&(var2<var1+var4)&&(var4<var1+var2)){
            System.out.println("S\nÉ possivel formar um triângulo");
        }else{
            System.out.println("N\nNÃO é possivel formar um triângulo");
        }
    }
}