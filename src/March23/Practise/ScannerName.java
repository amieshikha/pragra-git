package March23.Practise;
import java.util.Scanner; // import the Scanner class

    class ScannerName {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter UserName:");                  // Enter username and press Enter
            String username = scanner.nextLine();
            System.out.print("Password is: ");
            String password= scanner.next();
            System.out.println("***********");
            System.out.println("Welcome to my Homepage");
        }
    }
