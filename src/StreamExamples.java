import java.util.stream.IntStream;

public class StreamExamples {
    public static void main(String[] args) {
        // Skip Method
//        IntStream
//                .range(1,10)
//                .skip(5)
//                .forEach(x -> System.out.println(x));

        //Sum Method
        System.out.println(IntStream
                .range(1, 5)
                .sum());
        System.out.println();
    }
}
