import java.util.Scanner;
public class PTA1011 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        n.nextLine();
        boolean[] res = new boolean[x];
        for(int i=0;i<x;i++){
            long a=n.nextInt();
            long b=n.nextInt();
            long c=n.nextInt();
            if(a+b>c){
                res[i]=true;
            }
        }
        for(int i=1;i<=x;i++){
            System.out.println("Case #"+i+": "+res[i-1]);
        }
    }
}