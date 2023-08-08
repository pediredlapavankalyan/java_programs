package com.pubs.springpub;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PubRepo extends JpaRepository<Publisher, Integer>{
	
	Publisher findByCity(String city);

}
