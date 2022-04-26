package Bookapp.bookapp.service;

import Bookapp.bookapp.entity.Category;
import java.util.List;

public interface ICategoryService {
    void saveCategory (Category category);
    List<Category> findCategory();
}
