package Chapter_8_Exercises.Playground.Eight_dot_8;

import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println("ALL BOOKS.");


        for (Book book: Book.values()){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a range of enum constants:%n");

        for (Book book : EnumSet.range(Book.IW3HTP, Book.VBHTP)){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
