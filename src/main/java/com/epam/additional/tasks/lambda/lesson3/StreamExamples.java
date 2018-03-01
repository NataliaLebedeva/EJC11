package com.epam.additional.tasks.lambda.lesson3;

import com.epam.additional.tasks.lambda.library.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {

    public static void main(String[] args) {

        List<String> strings = Book.library.stream().sorted(Comparator.comparing(Book::getTitle))
                .flatMap(b -> b.getAuthors().stream()).collect(Collectors.toList());

        System.out.println(strings);

        Book.library.stream().sorted(Comparator.comparing(Book::getTitle)).limit(3);
        Book.library.stream().sorted(Comparator.comparing(Book::getTitle)).skip(2);

        List<String> titles = Book.library.stream()     // create stream from source
                .map(Book::getTitle)                    // transform (lazy act, activates by terminal act)
                .collect(Collectors.toList());          // terminal action

        System.out.println(titles);

        int pages = Book.library.stream().flatMapToInt(b -> IntStream.of(b.getPageCount())).sum();
        System.out.println(pages);

        int total = 0;
        for (Book b : Book.library) {
            for (int p : b.getPageCount()) {
                total += p;
            }
        }
        System.out.println(total);
    }
}
