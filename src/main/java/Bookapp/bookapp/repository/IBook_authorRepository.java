package Bookapp.bookapp.repository;

import Bookapp.bookapp.entity.Book_author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IBook_authorRepository extends JpaRepository<Book_author, UUID> {
    List<Book_author>findByBook_author(String Book_author);

}
