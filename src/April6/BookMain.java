package April6;

public class BookMain {
    public static void main(String[] args) {
        System.out.println(" Welcome to my library ");
        Book book1= new Book("Rich Dad Poor Dad");
        book1.printBookDetails();
        Book book2= new Book("Think and grow rich" , "Napolian hill");
        book2.printBookDetails();

        Book book3= new Book("4 hour work week", "Timothy", "Fiction");
        book3.printBookDetails();

        Book book4= new Book("Harry Potter", "JK Rolling", "Fiction", 2001);
        book4.printBookDetails();

    }
}

