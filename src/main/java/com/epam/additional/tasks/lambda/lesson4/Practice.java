package com.epam.additional.tasks.lambda.lesson4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 330),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2013, 700),
                new Transaction(alan, 2012, 950));

        //TODO 1. Find all transactions form year 2011 and sort them by value (small -> high)
        List<Transaction> filteredByYear = transactions.stream()
                .filter(tr -> tr.getYear() == 2011)
//                .sorted(Comparator.comparing(Transaction::getValue))  --> Zaal
                .sorted((tr1, tr2) -> tr1.getValue() - tr2.getValue())
                .collect(Collectors.toList());
        System.out.println(filteredByYear);

        //TODO 2. What are all the unique cities where the traders work?
        Set<String> cities = transactions.stream()
//                .map(t -> t.getTrader().getCity())                    --> Zaal
//                .distinct().collect(Collectors.toList())              --> Zaal
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
        System.out.println(cities);


        //TODO 3. Find all traders from Cambridge, sort by name.
        Set<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
//                .distinct().filter(t -> t.getCity().equals("Cambridge"))      --> Zaal
//                .sorted(Comparator.comparing(Trader::getName))                --> Zaal
//                .collect(Collectors.toList())                                 --> Zaal
                .filter(t -> Objects.equals(t.getCity(), "Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toSet());
        System.out.println(traders);

        //TODO 4. Return a string of all traders' names sorted alphabetically
        String names = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted().collect(Collectors.joining(" "));
//                .reduce("Traders: ", (t1, t2) -> t1 + " " + t2); //-->Zaal
        System.out.println(names);

        //TODO 5. Are there any traders based in Milan?
        boolean isAnyFromMilan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> Objects.equals(t.getCity(), "Milan"));
        System.out.println(isAnyFromMilan);

        //TODO 6. Update all transactions so that the traders from Milan are set to Cambridge - completely prohibited action!!!
        transactions.stream()
                .map(tr -> {
                    return new Transaction(
                            new Trader(tr.getTrader().getName(), tr.getTrader().getCity()),
                            tr.getYear(), tr.getValue());
                })
                .collect(Collectors.toList());

        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .forEach(t -> System.out.println(t.getValue()));

        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        //TODO 7. What's the highest value in all the transactions?
        Optional<Transaction> max = transactions.stream().max(Comparator.comparing(Transaction::getValue));
        System.out.println(max);

        Optional<Integer> max2 = transactions.stream().map(Transaction::getValue).reduce((a, b) -> a > b ? a : b);
        System.out.println(max2);
        
        Optional<Integer> max3 = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println(max3);

        //TODO 8. Find transaction with  a minimum value
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(min);
        Optional<Transaction> min2 = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(min2);


    }
}
