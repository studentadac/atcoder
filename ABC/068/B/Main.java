import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=1;
        
        while(n!=1){
            n/=2;
            ans*=2;
            
            
        }
        System.out.println(ans);
        
    }
}
}
