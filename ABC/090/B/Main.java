import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt=0;
        for (int i=a;i<=b ;i++ )
        {
            int x=0;
            int num=i;
            while(num!=0)
            {
                x+=num%10;
                num/=10;
                x*=10;
            }
            x/=10;
            if(x==i)
                cnt++;
        }
        System.out.println(cnt);
    }
}