package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Category;
import Bookapp.bookapp.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public void saveCategory (Category category){categoryRepository.save(category);}

    @Override
    public List<Category> findCategory(){return categoryRepository.findAll();}
}
