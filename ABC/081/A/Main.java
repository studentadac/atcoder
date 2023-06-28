import java.util.*;
public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        var s = sc.next();
        char[] a= s.toCharArray();
      
        System.out.println(
            
            
           s.chars().
            filter(num -> num == '1').
            count()
            );
        
        
    }
}