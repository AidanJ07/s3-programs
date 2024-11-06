import java.util.Scanner;


class Author {
    String name;
    String email;
    char gender;

    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

   
    public String toString() {
        return "Author Name: " + name + ", Mail ID: " + email + ", Gender: " + gender;
    }
}


class Book {
    String name;
    Author author;  
    double price;
    int qty_in_stock;

  
    public Book(String name, Author author, double price, int qty_in_stock) {
        this.name = name;
        this.author = author;  
        this.price = price;
        this.qty_in_stock = qty_in_stock;
    }

    
    @Override
    public String toString() {
        return "Book Name: " + name + "\n" +
               "Price: Rs. " + price + "\n" +
               "Quantity in Stock: " + qty_in_stock + "\n" +
               author.toString();  
    }
}


public class exp441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter author's name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter author's email: ");
        String authorEmail = scanner.nextLine();

        System.out.print("Enter author's gender (M/F): ");
        char authorGender = scanner.next().charAt(0);

        
        Author author = new Author(authorName, authorEmail, authorGender);

        
        scanner.nextLine(); 

        System.out.print("Enter book's name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter book's price: ");
        double bookPrice = scanner.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int qtyInStock = scanner.nextInt();

        Book book = new Book(bookName, author, bookPrice, qtyInStock);
        System.out.println("\nBook Details:");
        System.out.println(book);

        scanner.close();
    }
}
