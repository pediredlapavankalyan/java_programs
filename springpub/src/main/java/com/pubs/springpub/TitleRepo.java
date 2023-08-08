package com.pubs.springpub;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TitleRepo extends JpaRepository<Title, String> {

		@Query("from Title where price between :min and :max")
		List<Title> getTitleBYPriceRange(@Param("min")double min,@Param("max")double max);
		
		@Query(value="SELECT TOP 5 * from titles ORDER BY ytd_sales DESC",nativeQuery = true)
		List<Title> getTopFive();
		
		@Query("from Title where type=:type")
		List<Title> getTitleByType(@Param("type")String type);

		
}
