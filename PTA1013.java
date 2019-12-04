import java.util.Scanner;
public class PTA1013 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int m=x.nextInt();
        int n=x.nextInt();
        int[] arr=new int[n];
        int a=0;
        for(int i=2;a<arr.length;i++){
            if(testIsPrime3(i)){
                arr[a]=i;
                a++;
            }
        }
        int b=1;
        for(int i=m-1;i<arr.length;i++){
            if(b<10 && i!=arr.length-1){
                System.out.print(arr[i]+" ");
                b++;
            }else if(b==10 || i==arr.length-1){
                b=1;
                System.out.println(arr[i]);
            }
        }
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