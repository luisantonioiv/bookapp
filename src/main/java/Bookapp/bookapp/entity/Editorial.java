package Bookapp.bookapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Editorial {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID Id;
    private String editorial;
}
