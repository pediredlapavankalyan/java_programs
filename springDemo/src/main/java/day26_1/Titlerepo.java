package day26_1;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Titlerepo extends CrudRepository<Title, String> {
	//writing a jpql query
	@Query("from Title where price>10.0")
	List<Title> getCostlyBooks();
	
	@Query("from Title where title_id =:title_id")
	Title getTitle(@Param("title_id")String title_id);
}
