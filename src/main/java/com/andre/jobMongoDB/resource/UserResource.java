package com.andre.jobMongoDB.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andre.jobMongoDB.domain.User;

@RestController
@RequestMapping(value="/usuarios")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> list = new ArrayList<>();
		User andre = new User(1L,"Andre","falconi879@gmail.com", "11-986643690","123456");
		list.addAll(Arrays.asList(andre));
		return ResponseEntity.ok().body(list);
		}
}
