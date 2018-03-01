package com.epam.additional.tasks.lambda.lesson3;

import com.epam.additional.tasks.lambda.library.Book;

import java.util.*;
import java.util.stream.Collectors;

import static com.epam.additional.tasks.lambda.library.Book.Topic;
import static com.epam.additional.tasks.lambda.library.Book.library;

public class MoreExamples {

    public static void main(String[] args) {

        Map<Book.Topic, List<Book>> booksByTopic = new HashMap<>();

        // TODO rearrange to Map a Set of lists belonging to a particular category // 160412

        // Race condition!!! loose data in parallel calculate!!! the stream changes the surrounding!
        // We can't change the source! (Book.library)
        // during transformation outer objects could not be changed!!! (booksByTopic)
        library.parallelStream().peek(book -> {
            Topic topic = book.getTopic();
            List<Book> list = booksByTopic.get(topic);
            if (Objects.isNull(list)) {
                list = new ArrayList<>();
            }
            list.add(book);
            booksByTopic.put(topic, list);
        }).anyMatch(b -> false);

        System.out.println(booksByTopic);

        System.out.println("===");
        // TODO: change with collectors.groupingBy( -> )

        Map<Topic, List<Book>> byTopic = library.stream().collect(Collectors.groupingBy(Book::getTopic));
        System.out.println(byTopic);

    }
}
