package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Editorial;
import java.util.List;

public interface IEditorialService {
    void saveEditorial(Editorial editorial);
    List<Editorial> findEditorial();

}
