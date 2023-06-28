import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        
        int tako=(n%x==0?n/x:n/x+1);
        int ans=tako*t;
     

        System.out.println(ans);
    }
}
