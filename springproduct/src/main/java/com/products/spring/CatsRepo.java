package com.products.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface CatsRepo extends JpaRepository <Category,String>{
	
	 List<Category> findByDescriptionContaining(String description);

	
}