package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {

	private static final String SUCCESS = "success";
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return SUCCESS;
	}
	
	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") int id) {
		System.out.println("testPathVariable :" + id);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/tetRest/{id}", method=RequestMethod.GET)
	public String testRest(@PathVariable("id") int id) {
		System.out.println("rest get : " + id);
		return SUCCESS;
	}
	@RequestMapping(value = "/tetRest", method=RequestMethod.POST)
	public String testRest() {
		System.out.println("rest Post : ");
		return SUCCESS;
	}
	@RequestMapping(value = "/tetRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable("id") int id) {
		System.out.println("rest delete : " + id);
		return SUCCESS;
	}
	@RequestMapping(value = "/tetRest/{id}", method=RequestMethod.PUT)
	public String testRestPut(@PathVariable("id") int id) {
		System.out.println("rest put : " + id);
		return SUCCESS;
	}
	
}
