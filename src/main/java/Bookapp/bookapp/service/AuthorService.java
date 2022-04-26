package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Author;
import Bookapp.bookapp.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private IAuthorRepository authorRepository;

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public List<Author> findAuthor() {
        return authorRepository.findAll();
    }


}