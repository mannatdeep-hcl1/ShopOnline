package com.mannat.repos;

import org.springframework.data.repository.CrudRepository;

import com.mannat.model.AddressEntity;

public interface AddressRepo extends CrudRepository<AddressEntity, Integer> {

}
