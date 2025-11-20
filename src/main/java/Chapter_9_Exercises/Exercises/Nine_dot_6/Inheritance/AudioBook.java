package Chapter_9_Exercises.Exercises.Nine_dot_6.Inheritance;

import Chapter_9_Exercises.Exercises.Nine_dot_6.Composition.PrintBook;

public class AudioBook extends  Book{
    protected int size;
    protected String length;
    protected String playbackArtistName;




    public AudioBook(String title, int yearOfPublication, String author, int size, String length,
                     String playbackArtistName ){
        super(title, yearOfPublication, author);
        this.playbackArtistName = playbackArtistName;
        this.length = length;
        this.size = size;


    }
    @Override
    public String toString(){

        return String.format("%s%nLength: %s%nSize: %sMB%nPlayBackTime: %s%n",
               super.toString() ,
                length,
                size,
                playbackArtistName

        );
    }

}
