import java.util.Scanner;
public class PTA1002 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String x=n.nextLine();
        char [] y=x.toCharArray();
        int a=0;
        String res="";
        for(int i=0;i<y.length;i++){
            int b=y[i]-'0';
            a+=b;
        }
        String s = String.valueOf(a);
        char [] z=s.toCharArray();
        int [] shuzi= new int[]{1,2,3,4,5,6,7,8,9,0};
        String [] pingying= new String[]{"yi","er","san","si","wu","liu","qi","ba","jiu","ling"};
        for(int i=0;i<z.length;i++){
            for(int j=0;j<shuzi.length;j++){
                int c=z[i]-'0';
                if(c==shuzi[j]){
                    res=res+pingying[j];
                    if(i!=z.length-1){
                        res+=" ";
                    }
                }
            }
        }
        System.out.println(res);
    }
}