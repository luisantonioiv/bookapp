package Bookapp.bookapp.controller;

import Bookapp.bookapp.entity.Category;
import Bookapp.bookapp.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/category")

public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @PostMapping
    public void CategoryService(@RequestBody Category category){categoryService.saveCategory(category);}

    @GetMapping
    public List<Category> findCategory(){return categoryService.findCategory();}

    @DeleteMapping
    public void saveCategory(@RequestParam UUID id){}
}
