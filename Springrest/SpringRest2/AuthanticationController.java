package springrest_2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	private static final String REGISTERED_USERNAME = "shweta";
	private static final String REGISTERED_PASSWORD = "1234";
	
	@RequestMapping("/authenticate/{username}/{password}")
	public String checkPass(@PathVariable("username") String username, @PathVariable("password") String password) {
		System.out.println(username + " " + password);
		if(username.equals(REGISTERED_USERNAME) && password.equals(REGISTERED_PASSWORD)) {
			return "valid user";
		}
		return "invalid user";
	}
	
	
}