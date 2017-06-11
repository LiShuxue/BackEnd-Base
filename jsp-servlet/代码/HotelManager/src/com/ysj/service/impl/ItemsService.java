package com.ysj.service.impl;

import java.util.List;

import com.ysj.bean.ItemTypes;
import com.ysj.bean.Items;
import com.ysj.dao.IItemsDAO;
import com.ysj.dao.impl.ItemsDAO;
import com.ysj.service.IItemsService;

public class ItemsService implements IItemsService {

	IItemsDAO itemdao = new ItemsDAO();
	
	@Override
	public boolean addItem(Items item) {
		return itemdao.addItem(item);
	}

	@Override
	public boolean updateItem(Items item) {
		return itemdao.updateItem(item);
	}

	@Override
	public boolean deleteItem(Integer itemcode) {
		return itemdao.deleteItem(itemcode);
	}

	@Override
	public Integer getItemsCount() {
		return itemdao.getItemsCount();
	}
	
	@Override
	public List<Items> queryItems(int page, int count) {
		return itemdao.queryItems(page, count);
	}
	@Override
	public Items queryItemByCode(Integer itemcode) {
		return itemdao.queryItemByCode(itemcode);
	}

	@Override
	public List<Items> queryItemsByType(Integer typecode) {
		return itemdao.queryItemsByType(typecode);
	}

	@Override
	public boolean addItemType(ItemTypes itemtype) {
		return itemdao.addItemType(itemtype);
	}

	@Override
	public boolean updateItemType(ItemTypes itemtype) {
		return itemdao.updateItemType(itemtype);
	}

	@Override
	public boolean deleteItemType(Integer typecode) {
		return itemdao.deleteItemType(typecode);
	}
	
	@Override
	public Integer getItemTypesCount() {
		return itemdao.getItemTypesCount();
	}

	@Override
	public List<ItemTypes> queryItemTypes(int page, int count) {
		return itemdao.queryItemTypes(page, count);
	}

	@Override
	public ItemTypes queryItemTypeByTypeCode(Integer typecode) {
		return itemdao.queryItemTypeByTypeCode(typecode);
	}

}
