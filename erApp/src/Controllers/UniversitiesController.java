package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/university")

public class UniversitiesController {

	@RequestMapping("/add")
	public String showMyPage() {
		System.out.println("Done!");
		   return "adduniversity";
		}
}