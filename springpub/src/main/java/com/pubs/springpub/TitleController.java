package com.pubs.springpub;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TitleController {
	@Autowired
	TitleRepo tr;
	@Autowired
	AuthorRepo ar;
	@Autowired
	PubRepo pr;
	
	@GetMapping("/Titles")
	public List<Title> getTitles(@RequestParam("min")double min,@RequestParam("max")double max)
	{
		return tr.getTitleBYPriceRange(min, max);
	}
	
	@GetMapping("/TitleByAuid")
	public Set<Title> getTitles(@RequestParam("au_id")String au_id)
	{
		return ar.findById(au_id).get().getTitles();
	}
	
	@GetMapping("/topTitles")
	public List<Title> topTitles()
	{
		return tr.getTopFive();
	}
	
	@GetMapping("/titleByType")
	public List<Title> getTitlesOfType(@RequestParam("type")String type)
	{
		return tr.getTitleByType(type);
	}
	
	@GetMapping("/titleByCity")
	public List<Title> getTitleByCity(@RequestParam("city")String city)
	{
		return pr.findByCity(city).getTitle();
	}
	
	@PutMapping("/updateTitle")
	public Title setTitlePrice(@RequestParam("id")String id,@RequestParam("price")double price)
	{
		var title=tr.findById(id);
		if(title.isPresent())
		{
			var t=title.get();
			t.setPrice(price);
			tr.save(t);
			return t;
		}
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found ");
	}

}
