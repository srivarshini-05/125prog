import java.util.*;
public class subArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int summ=sc.nextInt();
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];
            }
            if(s==summ){
                System.out.println("yes");
                return;
            }
            
        }
        System.out.println("NO");
    }
}
