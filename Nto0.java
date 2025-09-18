import java.util.*;
public class Nto0 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n>0){
            if(n%2==0){
                n/=2;
                s++;
            }
            else{
                n-=1;
                s++;
            }
        }
        System.out.println(s);
    }
}
