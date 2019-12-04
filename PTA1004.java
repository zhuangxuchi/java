import java.util.Scanner;
public class PTA1004 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int x=n.nextInt();
        n.nextLine();
        int i=0;
        String[] arr =new String[x];
        int[] cj =new int[x];
        while(i<x){
            String s=n.nextLine();
            String[] a=s.split(" ");
            arr[i]=a[0]+" "+a[1];
            cj[i]=Integer.parseInt(a[2]);
            i++;
        }
        int max=-1;
        int min=101;
        int maxIndex=0;
        int minIndex=0;
        for(int j=0;j<x;j++){
            int b=cj[j];
            if(b<min){
                min=cj[j];
                minIndex=j;
            }
            if(b>max){
                max=cj[j];
                maxIndex=j;
            }
        }
        System.out.println(arr[maxIndex]);
        System.out.println(arr[minIndex]);
    }
}