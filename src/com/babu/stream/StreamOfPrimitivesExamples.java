package com.babu.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Java 8 offers the possibility to create streams out of three primitive types: int, long and double.
 * As Stream<T> is a generic interface, and there is no way to use primitives as a type parameter with
 * generics, three new special interfaces were created: IntStream, LongStream, DoubleStream.
 *
 * Using the new interfaces alleviates unnecessary auto-boxing, which allows for increased productivity
 */
public class StreamOfPrimitivesExamples {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);
       LongStream longStream = LongStream.rangeClosed(1, 3);
       longStream.forEach(System.out::println);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);
    }

}
