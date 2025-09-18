import java.util.*;
class maxel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        int maj=-1;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if((entry.getValue())>n/2){
                maj=entry.getKey();
                break;
            }
            
        }
        if(maj==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(maj);
        }
    }
}