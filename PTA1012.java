import java.util.Scanner;
import java.text.DecimalFormat;
public class PTA1012 {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat ("#.0");
        Scanner n = new Scanner(System.in);
        int len = n.nextInt();
        int[] A = new int[5];
        int[] count = new int[5];
        A[4] = -9999;
        int a2=1;
        for(int i=0;i<len;i++){
            int x=n.nextInt();
            if(x%5==0 && x%2==0){
                A[0]+=x;
                count[0]++;
            }else if(x%5==1){
                A[1]+=x*a2;
                a2*=-1;
                count[1]++;
            }else if(x%5==2){
                A[2]++;
                count[2]++;
            }else if(x%5==3){
                A[3]+=x;
                count[3]++;
            }else if(x%5==4){
                if(x>A[4]){
                    A[4]=x;
                    count[4]++;
                }
            }
        }
        for(int i=0;i<4;i++){
            if(i!=3){
                if(count[i]>0){
                    System.out.print(A[i]+" ");
                }else{
                    System.out.print("N ");
                }
            }else{
                double a3 = A[3];
                a3=a3/count[3];
                if(count[3]>0){
                    System.out.print(df.format(a3)+" ");
                }else{
                    System.out.print("N ");
                }
            }
            
        }
        if(count[4]>0){
            System.out.println(A[4]);
        }else{
            System.out.println("N");
        }
    }
}