package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	

	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String un, @RequestParam(value="age", required=false) Integer age) {
		System.out.println("testRequestParam, username=" + un + " age=" + age);
		
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language") String al) {
		System.out.println("testRequestHeader " + al);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String name) {
		System.out.println("testCookieValue:" + name );
		return SUCCESS;
	}
	
	@RequestMapping("testPojo")
	public String testPojo(User user) {
		System.out.println(user);
		return SUCCESS;
	}
	
}
