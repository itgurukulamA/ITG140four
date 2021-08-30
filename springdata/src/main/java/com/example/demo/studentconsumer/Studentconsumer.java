package com.example.demo.studentconsumer;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.CoreMatchers.notNullValue;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.student.Studentmodel;

@RestController
public class Studentconsumer {

	@GetMapping("/consumer")
	public ResponseEntity<String> consumer() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:8080/getdata";
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		//assertThat(response.getStatusCode(), equals(HttpStatus.OK));
		return response;
	}
	
	@PostMapping("/poster")
	public String poster(@RequestBody Studentmodel sm) {
		RestTemplate restTemplate = new RestTemplate();
		//NamedJdbc nam =new NamedJdbc(1,"surya", 22,"smadasi", 1231);
		//HttpEntity<NamedJdbc> request = new HttpEntity<>(nam);
		String result = restTemplate.postForObject("http://localhost:8080/seted", sm,String.class);
		//String s=restTemplate.getForObject("http://localhost:8080/Gstudent", String.class);
		return result;
	}

}
