import java.util.*;
public class boyKth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] choco=new int[n+1];
        int[] ice=new int[n+1];
        choco[1]=1;
        ice[1]=1;
        for(int i=2;i<=n;i++){
            choco[i]=choco[i-1]+ice[i-1];
            if(i%m==0){
                ice[i]=choco[i-1]+ice[i-1];
            }
            else{
                ice[i]=choco[i-1];}
        }
        System.out.println(choco[n]+ice[n]);
    }
}
