import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        var addA=a+b;
        var subA=a-b;
        var multiA=a*b;
        
        var ans= Math.max(Math.max(addA,subA),multiA           );
        
 
        System.out.println(ans);
        
    }
}