package work;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mathods {
    public static void main(String[] args) {
        // filter(predicate)
        // boolean values

        List<String> str= List.of("Aakil","Aman","Sofia","Kukkan","Anish","Danish");
       List<String> newStr= str.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
        System.out.println(newStr);

        List<Integer> list=List.of(1,2,10,45,78,4,3,5,6);
       List<Integer> newList= list.stream().filter(e->e>5).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> list2=list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(list2);
        // if we want to printf the shortcut of each elements of the list in single stream
        str.stream().forEach(System.out::println);
       List<Integer> l= list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

        Integer integer1=list.stream().min((x,y)->x.compareTo(y)).get();
        Integer integer2=list.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum "+integer1);
        System.out.println("Maximum "+integer2);


    }
}
