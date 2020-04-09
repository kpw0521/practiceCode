package com.kg.cont;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	
	@RequestMapping(value = "avg.do", method = RequestMethod.POST)
	
	public String home(Model model, HttpServletRequest req) {
		
		String name = req.getParameter("name");
		String kors = req.getParameter("kor");
		String engs = req.getParameter("eng");
		String maths = req.getParameter("math");
		
		if(
				kors.equals(null)||kors.equals("")||
				engs.equals(null)||engs.equals("")||
				maths.equals(null)||maths.equals("")
		) {
			return "error";
		}
	
		
		double kor = Double.parseDouble(kors);
		double eng =  Double.parseDouble(engs);
		double math =  Double.parseDouble(maths);
		
		double avg = Math.round((kor + eng + math)/3);
	
		model.addAttribute("avgname" , name);
		model.addAttribute("avg", avg);
	
		if(avg>=80) {
			return "a";
		}else if(avg>=60) {
			return "b";
		}
		return "c";
		
	}
	
}
