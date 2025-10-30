package Lambda_Expression;

import com.sun.security.jgss.GSSUtil;

interface ChangingNumber{
    int test();
}
public class Example4 {
    public static void main(String[] args) {
        ChangingNumber ch=()->{
            return (int)( Math.random()*999+1);
        };
        System.out.println(ch.test());
    }
}
