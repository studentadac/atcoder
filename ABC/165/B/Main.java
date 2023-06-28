import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans=0;
        long sum=100;
        
        while(sum<x)
        {
            sum+=sum/100;
            ans++;
      //      System.out.println(sum);
        }
        
        

        System.out.println(ans);
  //      System.out.println(sum);
    }
}