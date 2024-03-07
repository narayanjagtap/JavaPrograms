package JavaPrograms.S_APIs_Annotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class APIsAnnotation6 {
    public static void main(String[] args) {
        
        List<Integer> l1 = Arrays.asList(3,4,5,6,7,8);
        System.out.println(l1);

        Stream<Integer> StreamData = l1.stream();
        StreamData.forEach(n->System.out.println(n));   //use lambda expretion.
    }
}
