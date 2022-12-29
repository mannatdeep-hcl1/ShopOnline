package com.mannat.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mannat.model.ProductEntity;
import com.mannat.repos.ProductRepo;

@Controller
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductRepo proRepo;

	// New customer registration. currently using password as string not encrypted.
	@PostMapping(path = "/add")
	public @ResponseBody String AddNewCus(@RequestParam Integer id, String name,
			 String detail, Integer qty,
			 Double price, String img) {

		try {
			ProductEntity proEntity = new ProductEntity();
			proEntity.setId(id);
			proEntity.setName(name);
			proEntity.setDesc(detail);
			proEntity.setQty(qty);
			proEntity.setImg(img);
			proEntity.setPrice(price);
			proRepo.save(proEntity);
			
			return "Product Addition Successful";

		} catch (Exception e) {
			return "error: " + e;
		}

	}
	// Retrieves all products from db
		@PostMapping(path = "/getall")
		public @ResponseBody Iterable<ProductEntity> getDataAll() {
			return proRepo.findAll();

		}

	// Retrieves product from db by id
	@PostMapping(path = "/get")
	public @ResponseBody Optional<ProductEntity> getData(@RequestParam Integer id) {
		return proRepo.findById(id);

	}

	// deletes single customer from DB
	@PostMapping(path = "/del")
	public @ResponseBody void delData(@RequestParam Integer id) {
		if (checkData(id))
			proRepo.deleteById(id);

	}

	// check for existing data in DB
	private boolean checkData(Integer id) {
		if (proRepo.existsById(id)) {
			return true;
		} else {
			return false;
		}

	}
	
}
