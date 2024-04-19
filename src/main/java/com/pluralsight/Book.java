package com.pluralsight;

import java.util.concurrent.ScheduledExecutorService;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    Book() {
        id = 0;
        isbn = "unknown";
        title = "Default";
        isCheckedOut = false;
        checkedOutTo = null;
    }
}
