package Chapter_9_Exercises.Exercises.Nine_dot_6.Composition;

public class PrintBook {
    protected Book book;
    protected String publisher;
    protected String  ISBN;



    PrintBook (String publisher, String ISBN ){

    this.ISBN = ISBN;
    this.publisher = publisher;
    this.book = new Book("Feminist", 1830, "Ngozi");




    }
    @Override
    public String toString(){

        return String.format("%s%nISBN: %s%nAuthor: %s%n",
               book,
                ISBN, publisher

        );
    }


}
