package com.sample.demodocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demodocker.dao.ItemDao;
import com.sample.demodocker.domain.Item;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemRepository;
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	
	public Item findByIdItem(Integer idItem){
		return itemRepository.findByIdItem(idItem);
	}
}
