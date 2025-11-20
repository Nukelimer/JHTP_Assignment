package Chapter_9_Exercises.Exercises.Nine_dot_6.Inheritance;

public class Book {
protected  String title;
protected int yearOfPublication;
protected  String author;


public Book(String title, int yearOfPublication, String author){
    this.author = author;
    this.title = title;
    this.yearOfPublication = yearOfPublication;

}

@Override
public String toString(){

   return String.format("%s:%s%n%s:%s%n%s:%d",
           "Title", title,
           "Author", author,
           "Year of Pub", yearOfPublication
   );
}

}
