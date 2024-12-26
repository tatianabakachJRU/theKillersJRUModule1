package elective_2.library;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "Orwell G", 1976, "Fiction"));
        library.addBook(new Book("Moby Dick", "Melville G", 2000, "Adventure"));
        library.addBook(new Book("The Art of System Thinking",
                "Joseph O’Connor", 1999, "Dystopian"));
        library.addBook(new Book("Kolobok", "People", 1800, "Story"));

        library.printListBook();

        Reader tatiana = new Reader("Tatiana");
        Reader alex = new Reader("Alex");
        Reader max = new Reader("Max");
        Reader andrey = new Reader("Andrew");

        library.borrowBook(tatiana, "1984");
        library.borrowBook(alex, "Moby Dick");
        library.borrowBook(max, "Kolobok");

        library.printListBook();

        library.returnBook(tatiana, "1984");
        library.returnBook(alex, "1111");
        library.returnBook(alex, "Moby Dick");

        library.printListBook();

        library.sortBookByAuthor();
        library.printListBook();

        library.sortBookByTitle();
        library.printListBook();



    }
}
