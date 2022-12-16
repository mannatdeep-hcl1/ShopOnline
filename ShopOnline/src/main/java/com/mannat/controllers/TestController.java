package com.mannat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mannat.db.TestEntity;
import com.mannat.repos.TestRepo;

@Controller
@RequestMapping(path="/testdb")
public class TestController {
	@Autowired
	private TestRepo testRepo;
	
	@PostMapping(path="/add")
	public @ResponseBody String AddNewUser (@RequestParam Integer number
			, @RequestParam String letters) {
		TestEntity te = new TestEntity();
		te.setNumber(number);
		te.setLetters(letters);
		testRepo.save(te);
		return "saved, Test Passed add";
	}
	
	@GetMapping(path="/getall")
	public @ResponseBody Iterable<TestEntity> getAllData(){
		return testRepo.findAll();
		
	}
}
