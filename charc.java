import java.util.*;
public class charc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Character> common=new TreeSet<>();
        String s=sc.next();
        for(char c:s.toCharArray()){
            common.add(c);
        }
        
        for(int i=1;i<n;i++){
            String s1=sc.next();
            Set<Character> temp=new TreeSet<>();
            for(char c1:s1.toCharArray()){
                temp.add(c1);
            }
            common.retainAll(temp);
        }
        List<Character> result=new ArrayList<>(common);
        for(char d:result){
            System.out.print(d);
        }

    }
}