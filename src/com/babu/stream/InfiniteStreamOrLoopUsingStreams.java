package com.babu.stream;

import java.util.stream.Stream;

public class InfiniteStreamOrLoopUsingStreams {
    public static void main(String[] args) {
        /**
         * The generate() method accepts a Supplier<T> for element generation.
         * As the resulting stream is infinite, the developer should specify the desired size, or
         * the generate() method will work until it reaches the memory limit:
         */
        //Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10)
                        .forEach(System.out::println);


        /**
         * The first element of the resulting stream is the first parameter of the iterate() method.
         * When creating every following element, the specified function is applied to the previous element.
         * In the example above the second element will be 42.
         */
        //Another way of creating an infinite stream is by using the iterate() method:
        //Stream<Integer> streamIterated =
                Stream.iterate(40, n -> n + 2).limit(20)
                        .forEach(System.out::println);
    }
}
