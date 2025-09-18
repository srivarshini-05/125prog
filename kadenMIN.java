import java.util.*;
public class kadenMIN {
    public static int minimumsub(int[] arr,int n){
        int mintill=arr[0];
        int minend=arr[0];
        for(int i=1;i<n;i++){
            mintill=Math.min(arr[i],arr[i]+mintill);
            minend=Math.min(mintill,minend);
        }
        return minend;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimumsub(arr,n));
    }
}
