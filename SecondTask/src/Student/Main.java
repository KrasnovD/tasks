package src.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Книги создание
        Book book1 = new Book("Book 1", "Author 1", 1999, 300);
        Book book2 = new Book("Book 2", "Author 2", 2005, 450);
        Book book3 = new Book("Book 3", "Author 3", 2002, 500);
        Book book4 = new Book("Book 4", "Author 4", 2008, 400);
        Book book5 = new Book("Book 5", "Author 5", 2001, 600);
        Book book6 = new Book("Book 6", "Author 6", 2010, 350);
        Book book7 = new Book("Book 7", "Author 7", 2004, 550);
        Book book8 = new Book("Book 8", "Author 8", 1999, 300); // Дубликат book1

        // Студенты + книги
        List<Student> students = Arrays.asList(
                new Student("Arkadiy", Arrays.asList(book1, book2, book3, book4, book5)),
                new Student("Vasiliy", Arrays.asList(book2, book3, book5, book6, book7)),
                new Student("Georgiy", Arrays.asList(book1, book3, book4, book6, book8)),
                new Student("Anastasia", Arrays.asList(book2, book4, book5, book7, book8))
        );

        // Задание
        students.stream()
                .peek(System.out::println) // Выводим студентов
                .flatMap(student -> student.getBooks().stream()) // Получаем все книги
                .distinct() // Оставляем только уник книги
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортируем по страницам
                .filter(book -> book.getYear() > 2000) // Фильтруем книги, чтобы были не старее меня
                .limit(3) // Ограничиваем 3 элементами
                .map(Book::getYear) // Получаем годы выпуска
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Year of the book: " + year),
                        () -> System.out.println("Book not found")
                );
    }
}