import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var r = sc.nextInt()*100;
        var g = sc.nextInt()*10;
        var b = sc.nextInt();
        
        
        System.out.println((r+g+b)%4==0?"YES":"NO");
       
    }
}