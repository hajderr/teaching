package bibliotek;

import java.util.List;

public class Library {

    private String name;
    private String address;

    List<Account> accounts;
    Catalog catalog;

    public Library(Catalog catalog) {
        this.catalog = catalog;
    }

    public void addBookItem(BookItem item) {
        catalog.addBook(item);
    }

}
