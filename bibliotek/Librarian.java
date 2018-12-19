package bibliotek;

public class Librarian {

    Catalog catalog;

    public Librarian(Catalog catalog) {
        this.catalog = catalog;
    }

    public void search(String term) {

        catalog.search(term);
    }

    public void addBook(BookItem book) {
        catalog.addBook(book);
    }
}
