package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	private static final String SUCCESS = "success";
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return SUCCESS;
	}
	
}
