import java.util.*;
public class validstr {
    public static boolean check(String s1,String s2,String s3,int n){
        int i=0,j=0,k=0;
        if(s1.length()+s2.length() !=s3.length()){
            return false;
        }
        while(k<n){
            if(i<s1.length() && s3.charAt(k)==s1.charAt(i)){
                i+=1;
            }
            else if(j<s2.length() && s3.charAt(k)==s1.charAt(j)){
                j+=1;
            }
            else{
                return false;
            }
            k+=1;
        }
        return(i==s1.length() && j==s2.length());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        int n=s3.length();
        if(check(s1,s2,s3,n)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        
    }
}
