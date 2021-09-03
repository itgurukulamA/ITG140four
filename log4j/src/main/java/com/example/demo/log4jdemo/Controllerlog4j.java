package com.example.demo.log4jdemo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controllerlog4j 
{
		Logger log=Logger.getLogger(Controllerlog4j.class);
		@Autowired Servicelog4j s4j;
		@PostMapping("/value")
		public String insert(@RequestBody Pozolog4j p4j)
		{
			log.warn("hello");
			return s4j.insert(p4j);
		}
		@DeleteMapping("/delete")
		public String insert1(@RequestBody Pozolog4j p4j)
		{
			return s4j.delete(p4j);
		}
		@PostMapping("/update")
		public String insert2(@RequestBody Pozolog4j p4j)
		{
			return s4j.update(p4j);
		}
		@GetMapping("/sele/{pageno}/{size}")
		public List<Pozolog4j> insert3(@PathVariable int pageno, @PathVariable int size)
		{
			return s4j.get(pageno,size);
		}
		@GetMapping("/resttemplate")
		public String select()
		{
			RestTemplate rt=new RestTemplate();
			return rt.getForObject("https://www.codegrepper.com/code-examples/javascript/sample+rest+api+url+for+testing",String.class);
		}
}
