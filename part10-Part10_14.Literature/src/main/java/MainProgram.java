import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
public class MainProgram{

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();
            if(book.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println();
            books.add(new Book(book, age));
        }

        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getBook);

        Collections.sort(books, comparator);
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books: ");
        for (Book e: books) {
            System.out.println(e);
        }

    }

}
