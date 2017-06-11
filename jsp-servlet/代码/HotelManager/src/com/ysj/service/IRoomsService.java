package com.ysj.service;

import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;

public interface IRoomsService {
	/**
	 * ���һ����������,���Ͳ����Ѿ�����
	 * @param roomType ��������
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addRoomType(RoomTypes roomType);
	
	/**
	 * �޸�һ���������͵�������Ϣ ������Ϣ��������,��ע,�۸�
	 * @param roomType �������� �����
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean updateRoomType(RoomTypes roomType);
	
	/**
	 * ɾ��һ���������� 
	 * @param roomType ����������
	 * @return �Ƿ�ɾ���ɹ�
	 */
	boolean deleteRoomType(String roomType);
	
	/**
	 * ��ѯ������δɾ���ķ������͵���Ϣ
	 * @return �������͵���Ϣ
	 */
	List<RoomTypes> selecTypes();
	
	/**
	 * ���ݷ������� ��÷������͵���Ϣ
	 * @param roomType ��������
	 * @return ������Ϣ
	 */
	List<RoomTypes> getRoomTypeByName(String roomType);
	
	/**
	 * �õ�δ��ɾ���ķ������͵�����
	 * @return ������������
	 */
	Integer getRoomTypeCount();
	
	/**
	 * ����ҳ���� ��һ��ҳ���������ɵ�������ѯ����Ӧ�� ����������Ϣ
	 * @param page ҳ����
	 * @param count ҳ���������ɵ���Ϣ��
	 * @return ����������Ϣ
	 */
	List<RoomTypes> queryRoomType(Integer page,Integer count);
	
	//-------------roomtype----------------------------------------floor
	/**
	 * ���һ��¥����Ϣ ��¥�㲻���Ѿ�����,������Ѿ���ɾ����ͬ��¥���򽫸�¥���Ϊ����ɾ���Ҹ���������
	 * @param floor ¥�����
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addFloor(Floors floor);
	
	/**
	 * ����һ��¥����Ϣ ���Ը����Ѿ���ɾ������Ϣ
	 * @param floor ¥�����
	 * @return �Ƿ���ӳɹ�
	 */
	boolean updateFloor(Floors floor);
	
	/**
	 * ɾ��һ��¥����Ϣ
	 * @param floor ¥�����
	 * @return �Ƿ�ɾ���ɹ�
	 */
	boolean deleteFloor(Integer floor);
	
	/**
	 * ��ѯ���е�¥����Ϣ
	 * @return ���е�¥����Ϣ
	 */
	List<Floors> selectFloors();
	
	/**
	 * ����¥������ø�¥����Ϣ
	 * @param floor ¥����
	 * @return ¥����Ϣ
	 */
	List<Floors> getFloor(Integer floor);
	
	/**
	 * �õ����е�¥��������Ŀ
	 * @return ¥�����Ŀ
	 */
	Integer getFloorCount();
	
	/**
	 * ��ѯ�����е�δɾ��¥����Ϣ
	 * @param page �ڼ�ҳ��
	 * @param count һ��ҳ�����ɵ�����
	 * @return ¥����Ϣ
	 */
	List<Floors> queryFloor(Integer page,Integer count);
	
	//------------floors---------------------------rooms---------------------------------

	/**
	 * ���һ������ 
	 * @param room �������
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addRoom(Rooms room);
	
	/**
	 * ɾ��һ������
	 * @param roomId ������
	 * @return �����Ƿ�ɾ���ɹ�
	 */
	boolean deleteRoom(Integer roomId);
	
	/**
	 * ����һ��������Ϣ
	 * @param room �������
	 * @return �����Ƿ���³ɹ�
	 */
	boolean updateRoom(Rooms room);
	
	/**
	 * ��ѯ����δ��ɾ���ķ�����Ϣ
	 * @return ������Ϣ����
	 */
	List<Rooms> selectRooms();
	
	/**
	 * ���ݿͷ���Ų�ѯ�ͷ�
	 * @param id �ͷ����
	 * @return ���ҳ����Ŀͷ���Ϣ����
	 */
	List<Rooms> selectRoomsById(Integer id);
	
	/**
	 * ���ݿͷ����Ͳ�ѯ�ͷ�
	 * @param type �ͷ�����
	 * @return ���ҳ����Ŀͷ���Ϣ����
	 */
	List<Rooms> selectRoomsByType(String type);
	
	/**
	 * ���ݿͷ�״̬��ѯ�ͷ�
	 * @param status �ͷ�״̬
	 * @return ���ҳ����Ŀͷ���Ϣ����
	 */
	List<Rooms> selectRoomsByStatus(Integer status);
	
	/**
	 * ���ݿͷ�¥������ѯ�ͷ�
	 * @param floor �ͷ�¥����
	 * @return ���ҳ����Ŀͷ���Ϣ����
	 */
	List<Rooms> selectRoomsByFloor(Integer floor);
	
	/**
	 * ���ݿͷ��۸�����ѯ�ͷ�
	 * @param price �ͷ��۸�
	 * @return ���ҳ����Ŀͷ���Ϣ����
	 */
	List<Rooms> selectRoomsByPrice(Integer price);
	
	/**
	 * ���ҳ���ǰ���ķ�����
	 * @return ��ǰ���ķ�����
	 */
	Integer getBigestRoomId();
	
	/**
	 * ����Ԥ�� �������״̬��ΪԤ��
	 * @param roomId ������
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean bookRoom(Integer roomId);

}
