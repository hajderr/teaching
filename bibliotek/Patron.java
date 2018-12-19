package bibliotek;

public class Patron {
    Catalog catalog;

    public Patron(Catalog catalog) {
        this.catalog = catalog;
    }

    String search(String term) {
        return catalog.search(term);
    }


}
