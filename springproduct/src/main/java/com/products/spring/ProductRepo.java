package com.products.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository <Product,Integer>{
	   
	 Product  findByName(String name);
	 
	 @Query("from Product  where category.code = :code")
	 List<Product>  findByCategory( @Param ("code") String category);
	 
	 @Query("from Product where id=:id")
	 Product findProd(@Param("id")int id);
	 
}