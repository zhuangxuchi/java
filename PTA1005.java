import java.util.*;
public class PTA1005 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int k=n.nextInt();
        n.nextLine();
        String a=n.nextLine();
        String[] b =new String[k];
        int[] c =new int[k];
        Set<Integer> d = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        b=a.split(" ");
        for(int i=0;i<k;i++){
            c[i]=Integer.parseInt(b[i]);
            int x=c[i];
            while(x!=1){
                if (x%2==0) {
                    x/=2;
                    d.add(x);
                }else{
                    x=(3*x+1)/2;
                    d.add(x);
                }
            }
        }
        for(int j=0;j<k;j++){
            int y=0;
            if(!d.contains(c[j])){
                res.add(c[j]);
            }
        }
        Collections.sort(res);
        for(int i=res.size()-1;i>=0;i--){
            System.out.print(res.get(i));
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}