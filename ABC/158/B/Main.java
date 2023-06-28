import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long i=0;
        while(true )
        {
            if( ((i*2/25)==A &&(i/10)==B)||i==B*15       )
                break;
            i++;
        }

        if(i==B*15)
            i=-1;
        
        System.out.println(i);
    }
}
