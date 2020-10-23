import java.util.Scanner;

public class l6e09{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int x = 9999, st, nd, rd, th;

        while(x>1000){
            st = (x/100);
            nd = (x%100);
            rd = (st+nd);
            th = (rd*rd);

            if(th==x){
                System.out.println(x);
            }
            x--;
        }
    }
}