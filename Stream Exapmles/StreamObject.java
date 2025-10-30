package work;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // empty Stream
//        Stream<Object>emptyStream=Stream.empty();
        /* mptyStream.forEach(e->{
            System.out.println(e);
        });

         */

        String names[]={"Aakil","Aman","Sofia","Kukkan","Lokesh"};
        Stream<String> name1=Stream.of(names);
        name1.forEach(e->{
            System.out.println(e);
        });

    }

}
