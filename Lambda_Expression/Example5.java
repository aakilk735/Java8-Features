package Lambda_Expression;

import java.util.ArrayList;

interface Stringchanging{
    String change(String str);
}
public class Example5 {
    public static void main(String[] args) {
        Stringchanging uppercase=str->str.toUpperCase();
        Stringchanging reverse=str->new StringBuffer(str).reverse().toString();
        System.out.println(uppercase.change("Mohammad Aakil"));
        System.out.println(reverse.change("mohammad Aakil"));

    }
}
