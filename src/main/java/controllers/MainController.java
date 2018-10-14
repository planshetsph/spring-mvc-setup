package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	public String view(@RequestParam(value = "name", defaultValue = "Unknown", required = false) String name,
			Model model) {
		model.addAttribute("msg", "Hello " + name + "!");
		return "index";
	}

	@GetMapping("/api")
	@ResponseBody
	public String api() {
		return "//API/";
	}

}
