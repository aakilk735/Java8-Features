package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1
{
    public static void main(String[] args) {

        // create a list and filter all even numbers
        List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9,10); // this is also immutable . that is mean we can not change;
       // System.out.println(list1);
      //  System.out.println(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(7);
        list2.add(8);
        list2.add(9);
      //  System.out.println(list2);

        List<Integer> list3= Arrays.asList(1,2,3,4,5);
        //System.out.println(list3);

        List<Integer> isEven=new ArrayList<>();
        //without stream
//        for(Integer i: list1){
//            if(i%2==0){
//                isEven.add(i);
//            }
//        }
//        System.out.println(list1);
//        System.out.println(isEven);

        Stream<Integer> stream=list1.stream();
      List<Integer> newList= stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);




    }
}
