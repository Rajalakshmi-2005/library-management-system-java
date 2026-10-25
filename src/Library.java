import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
           if (findById(book.getId()) != null) {
       System.out.println("A book with this ID already exists.");
       return;
   }
        books.add(book);
        System.out.println("Book added.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public void issueBook(int id) {
        Book b = findById(id);
        if (b == null) {
            System.out.println("Book not found.");
        } else if (b.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            b.setIssued(true);
            System.out.println("Book issued.");
        }
    }

    public void returnBook(int id) {
        Book b = findById(id);
        if (b == null) {
            System.out.println("Book not found.");
        } else if (!b.isIssued()) {
            System.out.println("This book was not issued.");
        } else {
            b.setIssued(false);
            System.out.println("Book returned.");
        }
    }
}