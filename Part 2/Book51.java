
class Book51 {
    static int totalNoOfBooks;
    String title;
    String author;
    long isbn;
    boolean isBorrowed;
    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book51(long isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book51(long isbn) {
        this(isbn, "unknown", "unknown");
    }

    static int getTotalBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (this.isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    void returnBook() {
        this.isBorrowed = false;
        System.out.println("Hope you enjoy the book");
    }

    public static void main(String[] args) {
        Book51 myBook=new Book51(435);
        Book51 myBook2=new Book51(435,"cs","koushik");
        System.out.println(getTotalBooks());
        myBook.borrowBook();
        myBook2.borrowBook();
        myBook.returnBook();
        myBook2.borrowBook();
        myBook2.returnBook();
        
    }
}
