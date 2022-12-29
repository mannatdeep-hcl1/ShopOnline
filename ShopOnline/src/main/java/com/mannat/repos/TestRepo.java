package com.mannat.repos;

import org.springframework.data.repository.CrudRepository;

import com.mannat.model.TestEntity;

public interface TestRepo extends CrudRepository<TestEntity, Integer> {

}
