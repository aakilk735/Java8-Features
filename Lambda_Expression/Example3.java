package Lambda_Expression;
interface NumTest{
    Boolean isEven(int n);
}
public class Example3 {
    public static void main(String[] args) {
        NumTest st=n->n%2==0;
        System.out.println("6 is even "+st.isEven(6));
        System.out.println("7 is even "+st.isEven(7));
        System.out.println("10 is even "+st.isEven(10));


    }
}
