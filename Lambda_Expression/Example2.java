package Lambda_Expression;

interface mathoperations{
    int sum(int a,int b);
}
public class Example2 {
    public static void main(String[] args) {
        mathoperations multi=(a,b)->a*b;
        mathoperations sub=(a,b)->a-b;
        System.out.println("Multiplication of a and b="+multi.sum(6,5));
        System.out.println("Subtraction of a and b="+sub.sum(6,5));
    }
}
