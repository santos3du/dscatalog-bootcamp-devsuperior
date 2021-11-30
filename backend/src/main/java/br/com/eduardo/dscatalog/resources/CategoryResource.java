package br.com.eduardo.dscatalog.resources;

import br.com.eduardo.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<Category>();
        list.add(new Category(1L,"Books"));
        list.add(new Category(2L,"Electronics"));
        list.add(new Category(3L,"Garden"));

        return  ResponseEntity.ok().body(list);
    }
}