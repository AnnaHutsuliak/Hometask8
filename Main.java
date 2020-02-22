package come.epam.hometask;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Все книги:");
        Books books = new Books();
        books.printBooks();
        System.out.println("-------------------------------------------------------");

        System.out.print("Введите год для отбора книги: ");
        try {
            Scanner scan1 = new Scanner(System.in);
            int number_year = scan1.nextInt();
            System.out.println("-------------------------------------------------------");
            Validator.checkYearOfChosenBook(number_year);
            Books booksNumber_year = new Books();
            booksNumber_year.setBooks(books.searchBooks(number_year));
            System.out.println("Книги, после выбраного года: ");
            booksNumber_year.printBooks();
        } catch (Exception a) {
            System.err.println("Книг, выбранного года нету. Введите год издания книги с 2010 по 2020");
        }

        System.out.print("Введите автора :");
        Scanner scan2 = new Scanner(System.in);
        String author = scan2.nextLine();
        System.out.println("-------------------------------------------------------");
        Books booksAuthor = new Books();
        booksAuthor.setBooks(books.searchAuthor(author));
        booksAuthor.printBooks();

        System.out.print("Введите значения процента для изменения стоимости книг: ");
        try {
            Scanner scan3 = new Scanner(System.in);
            int number_percent = scan3.nextInt();
            System.out.println("-------------------------------------------------------");
            Validator.checkNumberPercent(number_percent);
            books.revaluation(number_percent);
            System.out.println("Книги, стоимость которых увеличена на: " + number_percent + " % :");
            books.printBooks();
        } catch (Exception e) {
            System.err.println("Ограничение процента (от 1 до 100), введите валидный процент");
        }
    }
}

