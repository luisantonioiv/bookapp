package Bookapp.bookapp.entity;
import lombok.Data;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity

public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID Id;
    private String category;
}
