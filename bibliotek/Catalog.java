package bibliotek;

import java.util.List;

public class Catalog implements Search, Manage {

    List<Book> bookItems;

    @Override
    public String search(String term) {
        System.out.println("Söker igenom catalog efter " + term);
        return "Hittade en bok!";

    }

    public void addBook(BookItem book) {
        bookItems.add(book);

    }
}
