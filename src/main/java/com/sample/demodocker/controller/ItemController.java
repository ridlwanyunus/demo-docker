package com.sample.demodocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demodocker.domain.Item;
import com.sample.demodocker.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(value = "all")
	public List<Item> findAll(){
		return itemService.findAll();
	}
}
