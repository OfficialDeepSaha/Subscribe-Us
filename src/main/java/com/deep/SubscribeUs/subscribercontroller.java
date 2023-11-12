package com.deep.SubscribeUs;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class subscribercontroller {

	@Autowired
	private subscribeservice subservice;
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/")
	public String subscribepage() {
		
		
		return "index";
	}
	
	
	@PostMapping("/subscribe")
	public String  savesubscriber (@ModelAttribute("sub") subscribe sub , HttpServletRequest request) {
		
		String email = request.getParameter("email");
		try {
			
			subservice.savesubscriber(sub);
			emailService.sendmail(email);
			return "success";
			
		} catch (Exception e) {
		
			return "alreadysubscribedpage";
		}
		
		
	}
	
	
	
	@GetMapping("/subscribers")
 	public String getallsubscribers(Model model ) {
		List<subscribe> viewSubscribes = subservice.getallsubscribers();
		model.addAttribute("subs", viewSubscribes);
		
		return "view";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
