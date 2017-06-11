package com.ysj.service;

import java.util.List;

import com.ysj.bean.ItemTypes;
import com.ysj.bean.Items;

public interface IItemsService {

	/**
	 * ������Ʒ
	 */
	public boolean addItem(Items item);
	
	/**
	 * �޸���Ʒ��������Ʒ���
	 */	
	public boolean updateItem(Items item);
	
	/**
	 * ɾ����Ʒ�����ݱ��
	 */
	public boolean deleteItem(Integer itemcode);
	
	/**
	 * �����Ʒ�ĸ���
	 */
	public Integer getItemsCount();
	
	/**
	 * ��ѯ���е���Ʒ��Ϣ,δɾ����
	 */
	public List<Items> queryItems(int page, int count);
	
	/**
	 * ��ѯĳ����Ʒ����Ϣ��������Ʒ���
	 */
	public Items queryItemByCode(Integer itemcode);
	
	/**
	 * ��ѯĳ����Ʒ����Ϣ��������Ʒ���
	 */
	public List<Items> queryItemsByType(Integer typecode);
	
	/**
	 * ������Ʒ���
	 */
	public boolean addItemType(ItemTypes itemtype);
	
	/**
	 * �޸���Ʒ���,���������
	 */	
	public boolean updateItemType(ItemTypes itemtype);
	
	/**
	 * ɾ����Ʒ��𣬸��������
	 */
	public boolean deleteItemType(Integer typecode);
	
	/**
	 * �����Ʒ���ĸ���
	 */
	public Integer getItemTypesCount();
	
	/**
	 * ��ѯ���е���Ʒ�����Ϣ�б�
	 */
	public List<ItemTypes> queryItemTypes(int page, int count);
	
	/**
	 * ��ѯĳ����Ʒ���ľ�����Ϣ�����������
	 */
	public ItemTypes queryItemTypeByTypeCode(Integer typecode);
}
