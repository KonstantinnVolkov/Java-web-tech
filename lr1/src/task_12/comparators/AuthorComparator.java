package task_12.comparators;

import task_12.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
