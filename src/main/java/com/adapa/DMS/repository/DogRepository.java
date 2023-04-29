package com.adapa.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adapa.DMS.models.Dog;
/**
 * 
 * @author S555173 Pydi Venkata Satya Ramesh Adapa
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
	
}
