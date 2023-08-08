package day26_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test implements CommandLineRunner {
	@Autowired
	Product_Transction pt;
	@Autowired
	Titlerepo tr;
	@Autowired
	CategoryCrud cat;
	@Autowired
	Category c;
	@Autowired
	Category c1;
	 
	//2nd question
	public void updateCat(String catcode,String catdesc)
	{
		cat.updateCat(catcode, catdesc);
		System.out.println("updated successfully");
	}
	public void deletecat(String catcode)
	{
		cat.deleteCat(catcode);
		System.out.println("deleted successfully");
	}
	//3rd question
	public void displayCostlyBooks()
	{
		for(var book:tr.getCostlyBooks())
			System.out.println(book.getTitle()+" : "+book.getPrice());
	}
	//4th question 
	public void displaytitles(String s)
	{
		for(var t:tr.findAll())
		{
			if(t.getTitle().toLowerCase().contains(s.toLowerCase()))
				System.out.println(t.getTitle());
		}
	}
	//5th question
	//Method using CrudRepository methods 
	public long displayTitlesCOunt()
	{
		return tr.count();
	}
	//6th question
	public void displayTitle(String title_id)
	{
		System.out.println(tr.getTitle(title_id).getTitle());
	}
	//7th question
	public void addCategoreis(List<Category> list)
	{
//		Category c = new Category();
//		c.setCode("CAT008");
//		c.setDescription("Medical");
		cat.saveAll(list);
		System.out.println("category added successfully");
	}
	//8th question
	public void deleteCat(String id)
	{
		cat.deleteById(id);
		System.out.println("Deleted successfully");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//pt.updatePrice(350, 351);
		//displayCostlyBooks();
		//System.out.println(displayTitlesCOunt());//18
		//displaytitles("busy");
		//displayTitle("MC3021");
		c.setCode("cat010");
		c.setDescription("bharat");
		c1.setCode("cat011");
		c1.setDescription("cups");
		List<Category> list = new ArrayList<>();
		list.add(c);
		list.add(c1);
		addCategoreis(list);
		//deleteCat("CAT008");
		//updateCat("cat004", "sports");
		//deletecat("Cat008");
		
	}
}
