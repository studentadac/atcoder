import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var x = sc.nextInt();
        var a = sc.nextInt();
        var b = sc.nextInt();
        
        x-=a;//Aを一個買う
        x%=b;//bを割り切れるだけ買った後のxの余り
        
        System.out.println(x);
       
    }
}