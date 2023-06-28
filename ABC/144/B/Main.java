import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var x = sc.nextInt();
        for (int i=1;i<=9 ;i++ )
        {
            if(x%i==0&&(x/i)<10)
            {
                System.out.println("Yes");
                return;
            }
            
            
        }
        System.out.println("No");
        
    }
}