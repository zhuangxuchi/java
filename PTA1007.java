import java.util.Scanner;
public class PTA1007 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int l=2,s=2,res=0;
        for(int i=0;i<=n;i++){
            if(testIsPrime3(i)){
                l=s;
                s=i;
                if(s-l==2){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
    public static boolean testIsPrime3 (int n){
        if (n <= 3){
             return n > 1;
        }         
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 
}