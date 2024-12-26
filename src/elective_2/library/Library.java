package elective_2.library;

import java.util.*;

public class Library {
    private List<Book> books;
    private Set<Reader> readers;
    private Map<Reader, List<Book>> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        readers = new HashSet<>();
        borrowedBooks = new HashMap<>();
    }

    // Add books
    public void addBook(Book book){
        books.add(book);
    }

    // Add reader
    public void addReader(Reader reader){
        readers.add(reader);
    }

    // Borrow Book
    public void borrowBook(Reader reader, String title){
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                List<Book> borrowedList = borrowedBooks.get(reader);
                if(borrowedList == null){
                    borrowedList = new ArrayList<>();
                    borrowedBooks.put(reader, borrowedList);
                }
                borrowedList.add(book);
                books.remove(book);
                System.out.println(reader.getName() + " add book " + book.getTitle());
                return;
            }
        }
        System.out.println("The book not found");
    }

    // Return book
    public void returnBook(Reader reader, String title){
        if(borrowedBooks.containsKey(reader)){
            List<Book> borrowedReaderBooks = borrowedBooks.get(reader);
            for (Book book : borrowedReaderBooks) {
                if(book.getTitle().equalsIgnoreCase(title)){
                    borrowedReaderBooks.remove(book);
                    addBook(book);
                    System.out.println(reader.getName()
                            + " returned the book " + book.getTitle());
                    return;
                }
            }

        }
        System.out.println("The reader " + reader.getName() + "does not have such a book");
    }

    public void sortBookByTitle(){
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void sortBookByAuthor(){
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
        };
        books.sort(comparator);
    }

    public void sortBookByYear(){
        books.sort(Comparator.comparing(Book::getYear));
    }

    public void printListBook(){
        System.out.println("Books list:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
