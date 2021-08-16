package com.example.demo.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crudController {
     
	@Autowired
	crudService cs;
	
	@PostMapping("/insert")
	public String insert(@RequestBody crud cd) {
		return cs.insert(cd);
	}
	@PostMapping("/update")
	public String update(@RequestBody crud cd) {
		return cs.update(cd);
	}
    @PostMapping("/delete")
    public String delete(@RequestBody crud cd) {
	return cs.delete(cd);
}
}
