package com.babu.stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The API has many terminal operations which aggregate a stream to a type or to a
 * primitive: count(), max(), min(), and sum(). However, these operations work according to the predefined
 * implementation. So what if a developer needs to customize a Stream's reduction mechanism?
 * There are two methods which allow us to do this, the reduce() and the collect() methods.
 */
public class StreamReductionWithReduction {
    public static void main(String[] args) {
        int reduced =
                IntStream.range(1, 4).reduce((a, b) -> a + b).getAsInt();
        //OptionalInt reduced = IntStream.range(1, 4).reduce(Integer::sum);
        System.out.println(reduced);

        System.out.println("=======================");

        int reducedTwoParams =
                IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reducedTwoParams);

        System.out.println("=======================");

        //To make a combiner work, a stream should be paralle(parallelStream)
        int reducedParallel =
                Arrays.asList(1,2,3).parallelStream()
                //Stream.of(1, 2, 3,4)
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });
        System.out.println(reducedParallel);

    }
}
