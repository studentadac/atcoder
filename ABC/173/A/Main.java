import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n%1000==0?n/1000:n/1000+1;
        
     

        System.out.println(num*1000-n);
    }
}
