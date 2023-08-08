package com.pubs.springpub;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "titles")
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_id")
	private String id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private Double price;
	
	private String type;
	
	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name="pub_id")
	private Publisher publisher;
	
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(
			  name = "titleauthor", 
			  joinColumns = @JoinColumn(name = "title_id"), 
			  inverseJoinColumns = @JoinColumn(name = "au_id"))
    Set<Author> authors;
	
	
	
	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


	public Set<Author> getAuthors() {
		return authors;
	}
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %f", this.id, this.title, this.price);
	}

}