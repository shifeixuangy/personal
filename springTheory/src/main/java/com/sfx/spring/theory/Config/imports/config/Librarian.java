package com.sfx.spring.theory.Config.imports.config;

import com.sfx.spring.theory.Config.imports.direct.Book;

import java.util.List;

public class Librarian {

    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
