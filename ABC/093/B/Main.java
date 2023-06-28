import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        var set = new TreeSet<Long>();
        for (var i=a;i<=b ;i++ )
        {
            if(i< a+k ||i>b-k    )
                set.add(i);
        }
        for(var x:set)
            System.out.println(x);
    }
}
