import java.util.Scanner;
public class PTA1009 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String x = n.nextLine();
        String[] y = x.split(" ");
        for(int i=y.length-1;i>0;i--){
            System.out.print(y[i]+" ");
        }
        System.out.println(y[0]);
    }
}