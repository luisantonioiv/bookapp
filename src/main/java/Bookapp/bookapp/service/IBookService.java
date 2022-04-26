package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Book;

import java.util.List;

public interface IBookService {
    void saveBook(Book book);
    List<Book> findBook();
}
