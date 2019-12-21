package com.seleniumexpress.lc.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.lc.api.EmailDTO;
import com.seleniumexpress.lc.api.UserInfoDTO;
import com.seleniumexpress.lc.dao.LoveCalculatorDAO;
import com.seleniumexpress.lc.service.EmailNotification;
import com.seleniumexpress.lc.service.LoveCalculatorService;

@Controller
public class LCAppController {

	@Autowired
	LoveCalculatorService loveCalculatorService;
	@Autowired
	EmailNotification emailNotification;
	
	@GetMapping("/")
	public String showHomePage(@ModelAttribute("userData") UserInfoDTO userDto) {

		
		System.out.println("executed...."); 
		return "home-page";
	}
	
	@PostMapping("/process-form")
	public String processForm(@ModelAttribute("userData") UserInfoDTO userDto) {
		String calculationResult = loveCalculatorService.calculateLove(userDto.getUserName(), userDto.getCurshName());
	    System.out.println(calculationResult);
		return "process-home-page";
	}
	
	@GetMapping("/email")
	public String viewEmailForm(@ModelAttribute("myEmailDTO") EmailDTO emialDto) throws Exception {
		System.out.println("got here !!");
		return "email-form";
	}
	@ResponseBody
	@PostMapping("/processEmail")
	public String processEmailFrom(@ModelAttribute("myEmailDTO") EmailDTO emialDto) throws Exception {
		try {
		emailNotification.sendEmail(emialDto);
		System.out.println("sent !!");
		}
		catch(Exception e) {
			System.out.println("emil sending failed " + e);
		}
		return "email sent";
	}
	
	@GetMapping("/userHistory")
	public String showUserHistory(@RequestParam("id") Optional<String> id,Model model) {
	
		if(id != null && !id.equals(Optional.empty()))
		model.addAttribute("id", id);
		model.addAttribute("userHistory",loveCalculatorService.getAllUser());
		return "user-histroy";
	}
	
	@GetMapping("deleteRecord")
	public String deleteUser(@RequestParam("id") String id, Model model) {
		System.out.println("captured id is " + id);
		loveCalculatorService.deleteUserRecordByLcId(Integer.parseInt(id));
		model.addAttribute("id", id);
		return "redirect:/userHistory";
	}
	


}
