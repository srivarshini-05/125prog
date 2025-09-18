import java.util.*; 
 
public class ValidStringMixReverse { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String s1 = sc.next(); 
        String s2 = sc.next(); 
        String s3 = sc.next(); 
 
        // Reverse s1 and s2 
        String rs1 = new StringBuilder(s1).reverse().toString(); 
        String rs2 = new StringBuilder(s2).reverse().toString(); 
 
        if (isValidMix(rs1, rs2, s3)) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
    } 
 
    public static boolean isValidMix(String s1, String s2, String s3) { 
        int i = 0, j = 0, k = 0; 
 
        if (s1.length() + s2.length() != s3.length()) { 
            return false; 
        } 
 
        while (k < s3.length()) { 
            if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) { 
                i++; 
            } else if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) { 
                j++; 
            } else { 
                return false; 
            } 
            k++; 
        } 
 
        return (i == s1.length() && j == s2.length()); 
} 
}