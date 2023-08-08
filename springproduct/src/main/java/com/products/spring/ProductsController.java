package com.products.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ProductsController {
	@Autowired
	private ProductRepo productRepo;
	
	@Operation(summary = "To get all poducts details",description = "it returns products objects")
	@GetMapping("/getproducts")
	public List<Product> getProd()
	{
		return productRepo.findAll();
	}
	
	
	@Operation(summary = "To get product details by id",description = "it return product details")
	@GetMapping("/getprod/{id}")
	public Optional<Product> getprod(@PathVariable("id") int id)
	{
		var prod=productRepo.findById(id);
		if(prod.isPresent())
		return prod;
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found");
	}
	
	@PutMapping("/updateProd")
	public String updateProd(@RequestParam(name="id")int id,@RequestParam(name="price")double price)
	{
		var prod = productRepo.findProd(id);
		prod.setPrice(price);
		productRepo.save(prod);
		return prod.toString();
	}
	
	@PostMapping("/insertProd")
	public Product addProd(@org.springframework.web.bind.annotation.RequestBody Product product)
	{
		var prod=productRepo.findById(product.getId());
			if(prod.isPresent())
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"data already exists");
			else
			{
				productRepo.save(product);
				return product;
			}	
	}
	@DeleteMapping("/delProd/{id}")
	public String delProd(@PathVariable("id")int id)
	{
		var prod = productRepo.findById(id);
		if(prod.isPresent())
		{
			productRepo.deleteById(id);
			return "Successfully deleted";
		}
		
		else
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid request");
	}
}