package Bookapp.bookapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Book_author {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID Id;
    private String IdBook;
    private String IdAuthor;
}
