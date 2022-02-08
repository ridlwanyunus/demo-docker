package com.sample.demodocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sample.demodocker.dao.ItemDao;
import com.sample.demodocker.domain.Item;

@Component
public class ItemLoader implements CommandLineRunner {

	@Autowired
	private ItemDao itemRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		loadItem();
	}
	
	public void loadItem() {
		
		if(itemRepository.count() == 0) {
			System.out.println("Initializing database ...");
			for(int i=1; i<=5; i++) {
				Item item = new Item();
				item.setNamaItem("Barang " + i);
				itemRepository.save(item);
			}
			System.out.printf("You have %s records", itemRepository.count());
		}
	}

}
