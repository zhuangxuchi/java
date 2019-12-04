import java.util.Scanner;
public class PTA1008 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = x.nextInt();
        int y = m % n;
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i]=x.nextInt();
        }
        for(int i=n-y;i<n;i++){
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<n-y-1;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println(b[n-y-1]);
    }
}