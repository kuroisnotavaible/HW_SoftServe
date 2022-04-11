package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons =
                List.of(new Person(23, new Date(2003, Calendar.APRIL, 7)),
                        new Person(26, new Date(2001, Calendar.AUGUST, 8)),
                        new Person(14, new Date(2004, Calendar.DECEMBER, 25)),
                        new Person(29, new Date(2007, Calendar.FEBRUARY, 16)),
                        new Person(67, new Date(2000, Calendar.AUGUST, 18)));
        persons.forEach(person -> System.out.println(person.toString()));
    }
}
