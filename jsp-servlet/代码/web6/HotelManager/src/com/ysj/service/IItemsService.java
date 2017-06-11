package com.ysj.service;

import java.util.List;

import com.ysj.bean.ItemTypes;
import com.ysj.bean.Items;

public interface IItemsService {

	/**
	 * 增加商品
	 */
	public boolean addItem(Items item);
	
	/**
	 * 修改商品，根据商品编号
	 */	
	public boolean updateItem(Items item);
	
	/**
	 * 删除商品，根据编号
	 */
	public boolean deleteItem(Integer itemcode);
	
	/**
	 * 获得商品的个数
	 */
	public Integer getItemsCount();
	
	/**
	 * 查询所有的商品信息,未删除的
	 */
	public List<Items> queryItems(int page, int count);
	
	/**
	 * 查询某个商品的信息，根据商品编号
	 */
	public Items queryItemByCode(Integer itemcode);
	
	/**
	 * 查询某种商品的信息，根据商品类别
	 */
	public List<Items> queryItemsByType(Integer typecode);
	
	/**
	 * 增加商品类别
	 */
	public boolean addItemType(ItemTypes itemtype);
	
	/**
	 * 修改商品类别,根据类别编号
	 */	
	public boolean updateItemType(ItemTypes itemtype);
	
	/**
	 * 删除商品类别，根据类别编号
	 */
	public boolean deleteItemType(Integer typecode);
	
	/**
	 * 获得商品类别的个数
	 */
	public Integer getItemTypesCount();
	
	/**
	 * 查询所有的商品类别信息列表
	 */
	public List<ItemTypes> queryItemTypes(int page, int count);
	
	/**
	 * 查询某个商品类别的具体信息，根据类别编号
	 */
	public ItemTypes queryItemTypeByTypeCode(Integer typecode);
}
