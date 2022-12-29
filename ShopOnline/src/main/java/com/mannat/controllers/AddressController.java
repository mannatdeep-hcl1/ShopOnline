package com.mannat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mannat.model.AddressEntity;
import com.mannat.model.CustomerEntity;
import com.mannat.repos.AddressRepo;
import com.mannat.repos.CustomerRepo;

@Controller
public class AddressController {
	@Autowired
	private AddressRepo addressRepo;
	
	@PostMapping(path = "/reg")
	public @ResponseBody String AddNewAddress(@RequestParam Integer id, @RequestParam String aptNum,
			@RequestParam String city, @RequestParam String country, @RequestParam String pincode,
			@RequestParam String streetName, @RequestParam String authKey) {

		try {
			AddressEntity addressEntity = new AddressEntity();
						
			return "Registration Successful";

		} catch (Exception e) {
			return "error: " + e;
		}

	}
	
}
