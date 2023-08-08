package day26_1;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface CategoryCrud extends CrudRepository<Category, String>   {
	@Modifying
	@Transactional
	@Query("update Category set description=:catdesc where code=:catcode")
	void updateCat(@Param("catcode")String catcode,@Param("catdesc")String catdesc);
	
	@Modifying
	@Transactional
	@Query("delete Category where code=:catcode")
	void deleteCat(@Param("catcode")String catcode);
	
	
	
}
