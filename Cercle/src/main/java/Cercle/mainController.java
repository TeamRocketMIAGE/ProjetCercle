package Cercle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {
	

	
	 @RequestMapping("/")
	    public String requestCreatePage(Model model) {
	    	

	    	
	    	return "index";
	    	
	    }
	 
	 /*
	 
	 @RequestMapping(value="/create", method=RequestMethod.POST)
	 public String submitForm()
	 {

	 }
	 */
	
	
    


}
