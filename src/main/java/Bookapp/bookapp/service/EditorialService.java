package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Editorial;
import Bookapp.bookapp.repository.IEditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService implements IEditorialService {
    @Autowired
    private IEditorialRepository editorialRepository;

    @Override
    public void saveEditorial(Editorial editorial) {
    editorialRepository.save(editorial);
    }

    @Override
    public List<Editorial> findEditorial() {
        return editorialRepository.findAll();
    }



}
