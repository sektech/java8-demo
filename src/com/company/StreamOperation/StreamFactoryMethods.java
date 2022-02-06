package com.company.StreamOperation;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {

    public static void main(String[] args) {
        //of, iterator, generate

        Stream<String> stringStreams = Stream.of("Hel","Tom","Steve","Alex");
        stringStreams.forEach(System.out::println);

        Stream.iterate(1, x -> x * 10)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> supp = new Random()::nextInt;
        Stream.generate(supp)
                .limit(10)
                .forEach(System.out::println);
    }
}
