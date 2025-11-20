package Chapter_9_Exercises.Exercises.Nine_dot_6.Inheritance;


public class BookHierarchyTest {


/*(Book Hierarchy) Books can come in various formats, like paper books, audio books, ebooks,
etc. Create a generic class Book that has as common attributes the title, the year of publica-
tion, and the author. The constructor of this class should instantiate all three attributes. Override the
toString method of class Book that returns a string that contains the values of its attributes. Create
a subclass PrintBook that extends Book with attributes Publisher and ISBN. Create another subclass
AudioBook which has the book’s size (in MB), its play length and the playback artist’s name as attri-
butes. Both PrintBook and AudioBook classes override the toString m*/


    public static void main(String[] args) {

        Book book = new Book("Feminist", 1830, "Ngozi");

    PrintBook printBook = new PrintBook("Jamal",
                "44444", "Purple Hibiscus", 2012,
            "Remi");

      AudioBook audioBook = new AudioBook("Born On A Tuesday",
              2001, "Remi", 30, "200", "Monalisa" );

        System.out.println(audioBook.toString());
    }
}
