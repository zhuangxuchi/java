import java.util.Scanner;
public class PTA1006 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        String res="";
        int a=n/100%10;
        for(int i=0;i<a;i++){
            res+="B";
        }
        a=n%100/10;
        for(int i=0;i<a;i++){
            res+="S";
        }
        a=n%10;
        for(int i=1;i<=a;i++){
            res+=(i+"");
        }
        System.out.println(res);
    }
}