package Bookapp.bookapp.repository;
import Bookapp.bookapp.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IEditorialRepository extends JpaRepository<Editorial, UUID> {
    List<Editorial> findByEditorial(String editorial);
}
