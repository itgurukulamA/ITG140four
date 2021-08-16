
package com.example.demo.Itg;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class StudContorller {
		@Autowired Stud_Service ss;
		@PostMapping("/insert")
		public String insert(@RequestBody Stud s)
		{
			int i=ss.insert(s);
			if(i>0)
			{
				return"inserted";
			}else
			{
				return"not inserted";
			}
		}
		@PostMapping("/update")
public Map <String , String> update(@RequestBody Stud s)
{
	return ss.update(s);
}
		public Map <String , String> select(@RequestBody Stud s)
		{
			return ss.update(s);
		}	
}