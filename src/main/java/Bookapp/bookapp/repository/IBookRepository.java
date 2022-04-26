package Bookapp.bookapp.repository;

import Bookapp.bookapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IBookRepository extends JpaRepository<Book, UUID> {
    List<Book> findByTitle(String title);
}
