import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        var s = sc.next();
        int n = sc.nextInt();
        
        for (int i=0;i<n ;i++ )
        {
            // https://lovedvoraklayout.hatenablog.com/entry/base-conversion
            s = Long.toString(Long.parseLong(s,8),9);
            s=s.replace("8","5");
            //	System.out.println(s);
        }
        System.out.println(s);
 
    }
}