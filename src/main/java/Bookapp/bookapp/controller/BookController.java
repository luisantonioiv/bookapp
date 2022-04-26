package Bookapp.bookapp.controller;

import Bookapp.bookapp.entity.Book;
import Bookapp.bookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/book") //escucha
public class BookController {

    @Autowired //decirle al spring un servicio
    private IBookService bookService;

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping()
    public List<Book> findBook(){
        return bookService.findBook();
    }

    @DeleteMapping()
    public void saveBook(@RequestParam UUID id){
    }

}