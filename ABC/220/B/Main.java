import java.util.*;

public class Main {
    public static int convertNumber(int a, int k, int x) {
        int A = 0;

        while (a != 0) {
            A += (a % k) * x;
            x *= k;
            a /= 10;
        }

        return A;
    }


    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        var a = sc.next();
        var b = sc.next();
        long A=Long.parseLong(a,k);
        long B=Long.parseLong(b,k);
        System.out.println(A*B);

    }
}