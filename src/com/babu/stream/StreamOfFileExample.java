package com.babu.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Furthermore, Java NIO class Files allows us to generate a Stream<String> of a text file through
 * the lines() method. Every line of the text becomes an element of the stream:
 */
public class StreamOfFileExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Chittibabu_Miriyala\\Documents\\file.txt");
        try (Stream<String> streamOfStrings = Files.lines(path)) {
            streamOfStrings.forEach(System.out::println);
        }
        try (Stream<String> streamWithCharset = Files.lines(path, StandardCharsets.UTF_8)) {
            streamWithCharset.forEach(System.out::println);
        }
    }
}
