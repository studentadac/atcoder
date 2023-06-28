import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        var k=sc.nextInt();
        
        for (int i=0;i<k ;i++ )
        {
            
           n= (n%200==0)?n/200:n*1000+200;
            
        }
        System.out.println(n);
        
    }
}