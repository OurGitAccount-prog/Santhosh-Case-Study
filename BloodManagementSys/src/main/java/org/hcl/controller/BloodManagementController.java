package org.hcl.controller;

import java.util.HashSet;
import java.util.Set;

import org.hcl.entities.BloodGroup;
import org.hcl.entities.Users;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BloodManagementController {
	private static final String password = null;
	@Autowired
	private UserService service;
	@GetMapping("/")
public String showHome() {
	return "home";
	
} 
	@PostMapping("/req")
	public String showForm(@RequestParam("reqType") String reqType,Model model) {
		
		if(reqType.equals("donor"))
			model.addAttribute("donor",reqType);
		if(reqType.equals("requestor"))
			model.addAttribute("requestor",reqType);
		return "registration";
	}
	@PostMapping("/process")
	public String processForm(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("pwd") String password,@RequestParam("city") String city,@RequestParam("bloodgroup") String bloodGroup,Model model) {
		Users user=new Users();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setCity(city);
		user.setBloodGroup(bloodGroup);
		BloodGroup bg=new BloodGroup();
		bg.setGroupName(user.getBloodGroup());
		user.add(bg);
		bg.add(user);
		Set<Users> users=new HashSet<>();
		Set<BloodGroup> bloodGroups=new HashSet<>();
		users.add(user);
		bloodGroups.add(bg);
		user.setBloodGroups(bloodGroups);
		bg.setUsers(users);
		
		model.addAttribute("generatedId",user.getFirstName()+user.getUserId()+user.getBloodGroup());
		service.insertUser(user);
		return "registration";
		
		
	}
}
