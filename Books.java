package come.epam.hometask;
import java.util.Arrays;

public class Books<newBooks> {

    private Book[] books = new Book[]{
            new Book(101, "Java", "Ivanhoe", "Kiev",
                    2010, 700, 250),
            new Book(102, "PHP", "Ivanhoe", "London",
                    2017, 250, 200),
            new Book(103, "JavaScript", "Ivanov", "New York",
                    2012, 280, 400),
            new Book(104, "C#", "Kolesnik", "Berlin",
                    2013, 450, 500),
            new Book(105, "SQL", "Davidova", "Milan",
                    2019, 300, 700),
            new Book(106, "C++", "Kovalov", "Lviv",
                    2020, 500, 350)};

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void printBooks() {
        for (Book elem : books) {
            elem.viewBook();
        }
    }

    public Book[] searchBooks(int number_year) {
        Book[] booksUn = new Book[books.length];
        int i = 0;
        for (Book elem : books) {
            if ((elem.getYear_of_publication() >= number_year)) {
                booksUn[i] = elem;
                i++;
            }
        }
        if (i == 0) {
            System.out.println("Указанного года не найдено");
        }
        return Arrays.copyOf(booksUn, i);
    }

    public Book[] searchAuthor(String author) {
        Book[] booksAuthor = new Book[books.length];
        int j = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(author)) {
                booksAuthor[j] = elem;
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Выбранного автора не найдено");
        }
        return Arrays.copyOf(booksAuthor, j);
    }

    public void revaluation(int number_percent) {
        for (Book elem : books) {
            elem.setPrice(elem.getPrice() + (elem.getPrice() * number_percent / 100));
        }
    }
}



