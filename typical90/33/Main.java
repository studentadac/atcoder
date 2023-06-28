import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int answer=0;

        if(h==1||w==1)
        {
            answer=Math.max(h,w);
        }

        else
        {
            answer=((h+1)/2)*((w+1)/2);
        }

        System.out.println(answer);
    }
}