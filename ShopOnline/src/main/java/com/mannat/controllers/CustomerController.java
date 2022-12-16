package com.mannat.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mannat.db.CustomerEntity;
import com.mannat.repos.CustomerRepo;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {
	@Autowired
	private CustomerRepo cusRepo;

	// New customer registration. currently using password as string not encrypted.
	@PostMapping(path = "/reg")
	public @ResponseBody String AddNewCus(@RequestParam Integer id, @RequestParam String username,
			@RequestParam String email, @RequestParam String phone, @RequestParam String firstName,
			@RequestParam String lastName, @RequestParam String authKey) {

		try {
			CustomerEntity cusEntity = new CustomerEntity();
			cusEntity.setId(id);
			cusEntity.setUsername(username);
			cusEntity.setEmail(email);
			cusEntity.setPhoneNum(phone);
			cusEntity.setFirstName(firstName);
			cusEntity.setLastName(lastName);
			cusEntity.setAuthKey(authKey);
			cusEntity.setAccStatus(0);
			cusRepo.save(cusEntity);
			return "Registration Successful";

		} catch (Exception e) {
			return "error: "+e;
		}

	}

	// Retrieves customer from db by id
	@PostMapping(path = "/get")
	public @ResponseBody Optional<CustomerEntity> getData(@RequestParam Integer id) {
		return cusRepo.findById(id);

	}
	//deletes single customer from DB
	@PostMapping(path = "/del")
	public @ResponseBody void delData(@RequestParam Integer id) {
		if(checkData(id)) 
		cusRepo.deleteById(id);
		
	}
	//check for existing data in DB
	private boolean checkData(Integer id) {
		if (cusRepo.existsById(id)) {
			return true;
		} else {
			return false;
		}

	}

}
