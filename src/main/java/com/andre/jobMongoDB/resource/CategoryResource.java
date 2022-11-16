package com.andre.jobMongoDB.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andre.jobMongoDB.domain.Category;

@RestController
@RequestMapping(value="/categorias")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		Category cat1 = new Category(1L,"Informatica");
		list.addAll(Arrays.asList(cat1));
		return ResponseEntity.ok().body(list);
		}
	

}
