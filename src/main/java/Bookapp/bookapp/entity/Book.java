package Bookapp.bookapp.entity;
import javax.persistence.*;
import java.util.UUID;
import lombok.Data;

@Data
@Entity

public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String description;
    private String idiom;
    //private String author;
    private String daterelease;
}
