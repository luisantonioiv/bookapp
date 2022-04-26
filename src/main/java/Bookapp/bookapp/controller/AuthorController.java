package Bookapp.bookapp.controller;

import Bookapp.bookapp.entity.Author;

import Bookapp.bookapp.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/author")

public class AuthorController {
    @Autowired
    private IAuthorService authorService;

    @PostMapping
    public void saveCategory(@RequestBody Author author){authorService.saveAuthor(author);}

    @GetMapping
    public List<Author> findAuthor() { return authorService.findAuthor();}

    @DeleteMapping
    public void deleteAuthor(@RequestParam UUID id){}


}
