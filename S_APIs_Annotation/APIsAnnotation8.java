package JavaPrograms.S_APIs_Annotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class APIsAnnotation8 {
    public static void main(String[] args) {
        
        List<Integer> l1 = Arrays.asList(3,6,3,7,1,8,5,9);

        Stream<Integer> StreamData = l1.stream();

        Stream<Integer> sortedStream = StreamData.sorted();

        Stream<Integer> mapStream=sortedStream.map(n->n*2);

        mapStream.forEach(n->System.out.println(n));
        
    }
}