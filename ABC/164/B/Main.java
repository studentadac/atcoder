import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
  
        while(      a>0   )
        {
            c-=b;
            if(c<=0)
            break;
            
            a-=d;
            
            
        }
        
        
        
        
        System.out.println(a>0?"Yes":"No");
      //  System.out.println(a+" "+c);
    }
}