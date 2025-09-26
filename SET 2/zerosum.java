import java.util.*;
public class zerosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int num=1;num<Math.pow(2,n);num++){
            int shift=0;
            int sum=0;
            while(shift<n){
                if(((1<<shift)&num)!=0){
                    sum+=arr[shift];
                }
                shift++;
            }
            if(sum==0){
                c++;
            }

        }
        System.out.println(c);
    }
}
