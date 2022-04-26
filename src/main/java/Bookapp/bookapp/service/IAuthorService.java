package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Author;
import java.util.List;

public interface IAuthorService {
    void saveAuthor(Author author);
    List<Author> findAuthor();

}
