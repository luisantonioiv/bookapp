package Bookapp.bookapp.controller;

import Bookapp.bookapp.entity.Editorial;
import Bookapp.bookapp.service.EditorialService;
import Bookapp.bookapp.service.IEditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping (path = "/editorial")
public class EditorialController {
    @Autowired
    private IEditorialService editorialService;

    @PostMapping
    public void saveEditorial (@RequestBody Editorial editorial){editorialService.saveEditorial(editorial);}

    @GetMapping
    public List<Editorial> findEditorial(){return editorialService.findEditorial();}

    @DeleteMapping
    public void saveEditorial(@RequestParam UUID id){}


}
