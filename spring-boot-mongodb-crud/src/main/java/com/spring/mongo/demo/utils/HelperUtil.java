package com.spring.mongo.demo.utils;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

import com.spring.mongo.demo.model.Book;
import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.model.SuperHero;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

public class HelperUtil {

    private HelperUtil() {
    }


    public static Supplier<List<Employee>> employeeSupplier = () ->
            Arrays.asList(
                    Employee.builder().empId(1).firstName("Binay").lastName("Gurung").salary(3000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(2).firstName("Rahul").lastName("Ghadage").salary(4000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(3).firstName("Sunny").lastName("Deol").salary(5000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(4).firstName("Salman").lastName("Khan").salary(6000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(5).firstName("Aamir").lastName("Khan").salary(7000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(6).firstName("Shahrukh").lastName("Khan").salary(8000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(7).firstName("Ranbir").lastName("Kapoor").salary(9000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(8).firstName("Ranveer").lastName("Singh").salary(10000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(9).firstName("Akshay").lastName("Kumar").salary(11000.0f).createdDate(getRandomDateInLastSixMonths()).build(),
                    Employee.builder().empId(10).firstName("Ajay").lastName("Devgan").salary(12000.0f).createdDate(getRandomDateInLastSixMonths()).build()
            );

    public static Supplier<List<SuperHero>> superHeroesSupplier = () ->
            Arrays.asList(
                    SuperHero.builder().name("Wade").superName("Deadpool").profession("Street fighter").age(28).canFly(false).createdDate(getRandomDateInLastSixMonths()).build(),
                    SuperHero.builder().name("Bruce").superName("Hulk").profession("Doctor").age(50).canFly(false).createdDate(getRandomDateInLastSixMonths()).build(),
                    SuperHero.builder().name("Steve").superName("Captain America").profession("Solder").age(120).canFly(false).createdDate(getRandomDateInLastSixMonths()).build(),
                    SuperHero.builder().name("Tony").superName("Iron Man").profession("Business man").age(45).canFly(true).createdDate(getRandomDateInLastSixMonths()).build(),
                    SuperHero.builder().name("Peter").superName("Spider Man").profession("Student").age(21).canFly(true).createdDate(getRandomDateInLastSixMonths()).build()
            );

    public static Supplier<List<Book>> booksSuppliers = () ->
            Arrays.asList(
                    Book.builder().bookId(500).name("Core Java").pages(200).author("Kathy Sierra").cost(1065.5).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(501).name("JSP & Servlets").pages(350).author("Kathy Sierra").cost(2500.5).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(502).name("Spring in Action").pages(250).author("Craig Walls").cost(1000.99).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(503).name("Pro Angular").pages(200).author("Freeman").cost(1750.25).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(504).name("HTML CSS").pages(100).author("Thomas Powell").cost(1948.9).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(505).name("Hibernate in Action").pages(250).author("Gavin King").cost(889.25).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(506).name("Practical MongoDB").pages(290).author("Shakuntala Gupta").cost(786.6).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(507).name("Pro Spring Boot").pages(500).author("Felipe Gutierrez").cost(2156.9).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(508).name("Beginning jQuery").pages(850).author("Franklin").cost(1050.5).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(509).name("Java Design Patterns").pages(115).author("Devendra Singh").cost(919.99).createdDate(getRandomDateInLastSixMonths()).build(),

                    //create more book under same author but different name and dates
                    Book.builder().bookId(510).name("HELLO KAFKA").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(511).name("HELLO MONGO1").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(512).name("HELLO MONGO2").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(513).name("HELLO MONGO3").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(514).name("HELLO MONGO4").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(515).name("HELLO MONGO5").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(516).name("HELLO MONGO6").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build(),
                    Book.builder().bookId(517).name("HELLO MONGO7").pages(500).author("Surendra B").cost(500.0).createdDate(getRandomDateInLastSixMonths()).build()
//                    new Book(500, "Core Java", 200, "Kathy Sierra", 1065.5, getRandomDateInLastSixMonths()),
//                    new Book(500, "Core Java", 200, "Kathy Sierra", 1065.5, getRandomDateInLastSixMonths()),
//                    new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0, getRandomDateInLastSixMonths()),
//                    new Book(502, "Spring in Action", 480, "Craig Walls", 940.75, getRandomDateInLastSixMonths()),
//                    new Book(503, "Pro Angular", 260, "Freeman", 1949.25, getRandomDateInLastSixMonths()),
//                    new Book(504, "HTML CSS", 100, "Thomas Powell", 2317.09, getRandomDateInLastSixMonths()),
//                    new Book(505, "Hibernate in Action", 180, "Gavin King", 889.25, getRandomDateInLastSixMonths()),
//                    new Book(506, "Practical MongoDB", 180, "Shakuntala Gupta", 785.0, getRandomDateInLastSixMonths()),
//                    new Book(507, "Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99, getRandomDateInLastSixMonths()),
//                    new Book(508, "Beginning jQuery", 180, "Franklin", 1500.00, getRandomDateInLastSixMonths()),
//                    new Book(509, "Java Design Patterns", 114, "Devendra Singh", 919.99, getRandomDateInLastSixMonths())
                    );


    private static Date getRandomDateInLastSixMonths() {
        Instant sixMonthsAgo = Instant.now().minus(Duration.ofDays(180));
//		Instant tenDaysAgo = Instant.now().minus(Duration.ofDays(10));
                Instant random = between(sixMonthsAgo, Instant.now());
        return Date.from(random);
    }

    public static Instant between(Instant startInclusive, Instant endExclusive) {
        long startSeconds = startInclusive.getEpochSecond();
        long endSeconds = endExclusive.getEpochSecond();
        long random = ThreadLocalRandom
                .current()
                .nextLong(startSeconds, endSeconds);

        return Instant.ofEpochSecond(random);
    }


//	public static List<Student> getStaticStudent() {
//
//
//		//System.out.println(developer);
//
//		List<Student> list = new ArrayList<>();
//
//		list.add(new Student(1, "Binay", "Gurung", 490, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(2, "Rahul", "Ghadage", 400, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(3, "Sunny", "Deol", 450, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(4, "Salman", "Khan", 440, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(5, "Aamir", "Khan", 400, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(6, "Sanjay", "Dutt", 420, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(7, "Sharukh", "Khan", 300, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(8, "Ranbir", "Kapoor", 320, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(9, "Ranveer", "Singh", 250, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(10, "Akshay", "Kumar", 280, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(11, "Ajay", "Devgan", 340, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(12, "Kishore", "Kumar", 399, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(13, "Bobby", "Deol", 345, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(14, "Rishi", "Kapoor", 355, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(15, "Jhon", "Abraham", 407, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(16, "Sunil", "Shetty", 421, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(17, "Manoj", "Bajpaye", 422, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(18, "Sunil", "Grover", 308, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(19, "Jhonny", "Lever", 267, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(20, "Abhishek", "Bachhan", 380, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(21, "Nitesh", "Deshmuk", 434, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(22, "Akshay", "Khanna", 402, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(23, "Arjit", "Singh", 347, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(24, "Kumar", "Sanu", 254, 500, getRandomDateInLastSixMonths()),
//		list.add(new Student(25, "Abhijit", "Babu", 344, 500, getRandomDateInLastSixMonths()),
//
//		return list;
//
//	}

}
