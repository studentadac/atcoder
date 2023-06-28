import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var a = sc.nextInt();
        
        System.out.println( n%500<=a?"Yes":"No" );
    }
}