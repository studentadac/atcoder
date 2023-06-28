import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans=0;
        long sum=0;
        
        while(sum<n)
        {
            ans++;
            sum+=ans;
            
        }
        
        

        System.out.println(ans);
  //      System.out.println(sum);
    }
}
