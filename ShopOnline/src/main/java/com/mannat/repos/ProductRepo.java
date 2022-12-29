package com.mannat.repos;

import org.springframework.data.repository.CrudRepository;

import com.mannat.model.ProductEntity;

public interface ProductRepo extends CrudRepository<ProductEntity, Integer> {

}
