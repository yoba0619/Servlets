package com.microsoft.shop.service;

import java.awt.List;
import java.util.ArrayList;

import com.microsoft.shop.domain.Item;

public class ItemService {
	
	public ArrayList<Item> fetchAllItems(){
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item(1,"lamp", 56.99f));
		items.add(new Item(2,"chair", 56.99f));
		items.add(new Item(3,"table", 56.99f));
		return items;
	}

}
