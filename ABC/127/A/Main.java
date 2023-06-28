import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        
        int ans=0;
        
        if(a>=13)
        ans=b;
        else if(a>=6)
        ans=b/2;
       
        System.out.println(ans);
        
    }
}
