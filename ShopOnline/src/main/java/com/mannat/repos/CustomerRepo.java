package com.mannat.repos;

import org.springframework.data.repository.CrudRepository;

import com.mannat.model.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Integer> {

}
