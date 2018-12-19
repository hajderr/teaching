package bibliotek;

import java.util.List;

public class Account {

    List<BookItem> borrowed;
    List<BookItem> reserved;

    AccountState state;
}
