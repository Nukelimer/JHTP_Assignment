package Chapter_9_Exercises.Exercises.Nine_dot_6.Inheritance;

import Chapter_9_Exercises.Exercises.Nine_dot_6.Composition.Book;

public class PrintBook extends Book {

    protected String publisher;
    protected String  ISBN;



    PrintBook(String publisher, String ISBN , String title, int yearOfPublication, String author ){

    super(title, yearOfPublication, author);
    this.ISBN = ISBN;
    this.publisher = publisher;




    }
    @Override
    public String toString(){

        return String.format("%s%nISBN: %s%nAuthor: %s%n",
               super.toString(),
                ISBN, publisher

        );
    }


}
