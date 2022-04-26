package Bookapp.bookapp.entity;
import javax.persistence.*;
import java.util.UUID;
import lombok.Data;
@Data
@Entity

public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
    private String fname;
    private String lname;
}
