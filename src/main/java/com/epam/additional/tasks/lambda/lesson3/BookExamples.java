package com.epam.additional.tasks.lambda.lesson3;

import com.epam.additional.tasks.lambda.library.Book;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import static com.epam.additional.tasks.lambda.library.Book.Topic.PROGRAMMING;

public class BookExamples {

    public static void main(String[] args) {
        Stream<Book> filteredStream = Book.library.stream().filter(b -> b.getTopic() == PROGRAMMING);

        Stream<String> map = Book.library.stream().map(Book::getTitle);

        Book.library.stream().sorted(Comparator.comparing(Book::getTitle));// 160417

        //160412

        long count = Book.library.stream()
                .filter(b -> b.getTopic() == Book.Topic.FICTION).count();

        System.out.println(count);

        Optional<Book> anyFictionBook = Book.library.stream()
                .filter(b -> b.getTopic() == Book.Topic.FICTION).findAny();

        Book emptyBook = new Book() {
            @Override
            public String toString() {
                return "none";
            }
        };

        Book someBook = anyFictionBook.orElse(emptyBook);
        System.out.println(someBook.getTitle() + " " + someBook.getTopic());

        Book b = getBook();

        System.out.println("some fiction book " + (b = b == null ? emptyBook : b));

        Book b2 = Optional.ofNullable(getBook()).orElse(emptyBook);

        System.out.println(b2.getTitle() + "  " + b2.getAuthors());

    }

    static Book getBook() {
        //do smth
        return null;
    }

    static Optional<Book> getBook2() {
        Book b = null;
        //do smth
        return Optional.ofNullable(b);
    }


}
