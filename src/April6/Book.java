package April6;

public class Book {
    String authorName;
    String nameOfBook;
    String genre;
    int publicationYear;
   Book(){

    }

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Book(String authorName, String nameOfBook) {
        this.authorName = authorName;
        this.nameOfBook = nameOfBook;
    }

    public Book(String authorName, String nameOfBook, String genre) {
        this.authorName = authorName;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
    }

    public Book(String authorName, String nameOfBook, String genre, int publicationYear) {
        this.authorName = authorName;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public void printBookDetails(){
             System.out.println("Book's Author name is :              " +authorName );
             System.out.println("Publication of the year is :         " +publicationYear);
             System.out.println("Genre is :                           " + genre);
             System.out.println("Name of the Book is :                " + nameOfBook);

    }

}
