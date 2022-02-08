package com.sample.demodocker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.demodocker.domain.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

	@Query("SELECT i FROM Item i")
	List<Item> findAll();
	
	@Query("SELECT i FROM Item i WHERE i.idItem = :idItem")
	Item findByIdItem(@Param("idItem") Integer idItem);
	
}
