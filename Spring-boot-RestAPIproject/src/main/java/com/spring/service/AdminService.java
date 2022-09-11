package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Admin;
import com.spring.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	public AdminRepository adminRepository;

	public List<Admin> getAdmins() {
		return adminRepository.findAll();
	}

	public Admin addAdmin(Admin Admin) {
		return adminRepository.save(Admin);
	}

	public Admin getAdmin(Integer id) {
		return adminRepository.findById(id).orElseThrow(null);
	}

	public Admin updateAdminDetails(Admin Admin) {
		return adminRepository.save(Admin);
	}

	public void deleteAdmin(Integer id) {
		adminRepository.deleteById(id);;
	}
}
