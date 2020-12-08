import java.util.Scanner;

public class l9e01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println("Informe um número para linha "+i+" e coluna "+j+" da matriz[a]:");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                System.out.println("Informe um número para linha "+i+" e coluna "+j+" da matriz[b]:");
                b[i][j] = sc.nextInt();

                c[i][j] = (a[i][j]+b[i][j]);
            }
        }
        System.out.print("Matriz[a]:\n");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.print("Matriz[b]:\n");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.print("Matriz[c]:\n");
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}