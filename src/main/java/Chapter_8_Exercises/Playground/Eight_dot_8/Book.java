package Chapter_8_Exercises.Playground.Eight_dot_8;

public enum Book {

    JHTP("Java How to Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2017"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2017");

    private final String title;
    private  final String copyrightYear;

    Book(String title, String copyrightYear){
        this.copyrightYear = copyrightYear;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
