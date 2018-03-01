package com.epam.additional.tasks.lambda.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import static com.epam.additional.tasks.lambda.library.Book.Topic.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    public static List<Book> library;

    static {
        createLibrary();
    }

    String title;
    int[] pageCount;
    double height;
    Topic topic;
    List<String> authors;
    Year year;

    static void createLibrary() {
        Book b1 = new Book("Java8 basics", new int[]{540}, 21.5, PROGRAMMING, Arrays.asList("Smith", "Johnes", "Peters"), Year.of(2014));
        Book b2 = new Book("Design Patterns", new int[]{256}, 20.3, PROGRAMMING, Arrays.asList("Erik Frimen", "Elizabet Frimen"), Year.of(2011));
        Book b3 = new Book("War and Peace", new int[]{370, 400, 340, 380}, 18.7, FICTION, Arrays.asList("Lev Tolstoy"), Year.of(1930));
        Book b4 = new Book("Sherlock Holmes", new int[]{270}, 25.7, SHORT, Arrays.asList("Arthur Conan Doyle"), Year.of(2004));

        library = Arrays.asList(b1, b2, b3, b4);
    }

    public enum Topic {
        SHORT, FICTION, PROGRAMMING;
    }
}

