import java.util.*;
public class LRSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int right=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            right+=arr[i];
        }
        int left=0;
        for(int mid=0;mid<n;mid++){
            if(mid>0)left+=arr[mid-1];
            right-=arr[mid];
            if(left==right)
            System.out.println(arr[mid]+" ");
        }
    }
}
