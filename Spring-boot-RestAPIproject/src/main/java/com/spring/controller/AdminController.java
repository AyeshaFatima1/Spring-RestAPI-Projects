package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Admin;
import com.spring.service.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	public AdminService adminService;

    @GetMapping("/home")
    public String homePage() {
    	return "Welcome to GROCERY Mart";
    }
    
	@GetMapping("/")
	public List<Admin> getAdmins(){
		return this.adminService.getAdmins();
	}

	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin Admin) {
		return this.adminService.addAdmin(Admin);
	}

	@GetMapping("/Admin/{id}")
	public Admin getAdmin(@PathVariable Integer id) {
		return adminService.getAdmin(id);
	}

	@PutMapping("/updateAdminDetails")
	public Admin updateAdminDetails(@RequestBody Admin Admin) {
		return this.adminService.updateAdminDetails(Admin);
	}

	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable Integer id) {
		adminService.deleteAdmin(id);
	}

}
