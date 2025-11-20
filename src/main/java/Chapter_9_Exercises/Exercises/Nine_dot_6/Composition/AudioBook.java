package Chapter_9_Exercises.Exercises.Nine_dot_6.Composition;

public class AudioBook {
    protected int size;
    protected String length;
    protected String playbackArtistName;
    protected PrintBook printBook;



    public AudioBook(int size, String length, String playbackArtistName ){
        this.playbackArtistName = playbackArtistName;
        this.length = length;
        this.size = size;
        this.printBook =  new PrintBook("Jamal", "44444");

    }
    @Override
    public String toString(){

        return String.format("%s%nLength: %s%nSize: %sMB%nPlayBackTime: %s%n",
                printBook,
                length,
                size,
                playbackArtistName

        );
    }

}
