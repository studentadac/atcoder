import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans=0;
        for (long i=1;i<=n ;i++ ) 
        {
        if(i%3==0)
        continue;
        if(i%5==0)
        continue;
        
        ans+=i;
        }
       

        System.out.println(ans);
    }
}