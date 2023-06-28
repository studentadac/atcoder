import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long p = sc.nextLong();
        
        
        var x=new ArrayList<Long>();
        
        long y=2;
        long sum=1;
        while(  sum<=p  )
        {
            
            x.add(sum);
            sum*=y++;
            
        }
        
        int xS=x.size();
       //System.out.println(x.get(xS-1));
       
       
       int ans=0;
       while(  p!=0 &&xS>0       )
       {
           xS--;
           long xGet=x.get(xS);
           
          if(xGet*100<p    )
          {
              
              p-=xGet*100;
          }
          else
          {
              
              ans+=p/xGet;
              p%=xGet;
              
          }
       }
       
       System.out.println(ans);
       
      
        
    
    }
}