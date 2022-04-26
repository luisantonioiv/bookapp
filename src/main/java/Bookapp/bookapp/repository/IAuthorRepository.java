package Bookapp.bookapp.repository;

import Bookapp.bookapp.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, UUID> {
    List<Author> findBylname(String lname);
}
