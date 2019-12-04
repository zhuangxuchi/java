import java.util.Scanner;
public class PTA1001 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int x=n.nextInt();
        int res=0;
        while (x!=1) {
            if (x%2==0) {
                x/=2;
            }else{
                x=(3*x+1)/2;
            }
            res++;
        }
        System.out.println(res);
    }
}