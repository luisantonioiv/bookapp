package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Book;
import Bookapp.bookapp.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
    @Override
    public List<Book> findBook(){
        return bookRepository.findAll();
    }
}
