package Lambda_Expression;

interface greeting{
    void print();
}
public class Example1 {
    public static void main(String[] args) {
        greeting gr=()->{
            System.out.println("Hi This side Mohammad Aakil");
        };
        gr.print();
    }
}
