package com.ysj.dao;

import java.util.List;

import com.ysj.bean.Floors;
import com.ysj.bean.RoomTypes;
import com.ysj.bean.Rooms;

public interface IRoomsDAO {
	/**
	 * ��ӿͷ�����
	 * @param roomType �ͷ����� ���� �Լ��ͷ��۸�
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addRoomType(RoomTypes roomType);
	/**
	 * �޸ķ�������
	 * @param roomType �ͷ����� ���� �Լ��ͷ��۸�
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean updateRoomType(RoomTypes roomType);
	/**
	 * ɾ��һ����������
	 * @param roomType ������
	 * @return �Ƿ�ɾ���ɹ�
	 */
	boolean deleteRoomType(String roomType);
	/**
	 * ��ѯ���еķ���������Ϣ
	 * @return ���еķ���������Ϣ
	 */

	List<RoomTypes> selectTypes();
	
	/**
	 * ���ݷ����������Ʋ�ѯ�����������
	 * @return ��������
	 */
	List<RoomTypes> getTypeByName(String roomType);
	
	/**
	 * ���ݷ����Ų�ѯ�Ѿ���ɾ���ķ���
	 * @param roomType ������
	 * @return ��ѯ�����Ѿ���ɾ���ķ�����Ϣ
	 */
	List<RoomTypes> getDeledTypeByName(String roomType);
	
	/**
	 * ����ҳ���� ��һ��ҳ���������ɵ�������ѯ����Ӧ�� ����������Ϣ
	 * @param page ҳ����
	 * @param count ҳ���������ɵ���Ϣ��
	 * @return ����������Ϣ
	 */
	List<RoomTypes> queryRoomType(Integer page,Integer count);
	
	//-------------RoomTypes--------------------------------------Floors------------------------
	/**
	 * ���һ��¥����Ϣ
	 * @param floor ¥�����
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addFloor(Floors floor);
	
	/**
	 * ����һ��¥����Ϣ
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
	 * ����¥������ѯ¥����Ϣ
	 * @param floor ¥����
	 * @return ¥����Ϣ
	 */
	List<Floors> getFloorByFloor(Integer floor);
	
	/**
	 * ����¥������ѯ�Ѿ���ɾ����¥����Ϣ
	 * @param floor ¥����
	 * @return ¥����Ϣ
	 */
	List<Floors> getDeledFloorByFloor(Integer floor);
	
	
	/**
	 * ��ѯ�����е�δɾ��¥����Ϣ
	 * @param page �ڼ�ҳ��
	 * @param count һ��ҳ�����ɵ�����
	 * @return ¥����Ϣ
	 */
	List<Floors> queryFloor(Integer page,Integer count);
	//-------------------Floors------------------------------Rooms-------------------------
	
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
	 * ���ݷ����Ų�ѯ������Ϣ
	 * @param roomId ������
	 * @return ��Ӧ�ķ�����Ϣ
	 */
	List<Rooms> getRoomById(Integer roomId);

	/**
	 * ���ݷ������ס �޸ķ���״̬Ϊ2
	 * @param roomId �����
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean roomIn(Integer roomId);
	
	/**
	 * ���ݷ�����˷� �޸ķ���״̬Ϊ0
	 * @param roomId �����
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean roomOut(Integer roomId);
	/**
	 * ���ݷ���Ų�ѯ���䵱ǰ��״̬
	 * @param roomId �����
	 * @return	�����״̬��� 0 �շ� 1Ԥ�� 2����ס��~~
	 */
	Integer getRoomStatus(Integer roomId);
	
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
	
	//-----
	/**
	 * �˷� �������״̬��Ϊ����
	 * @param roomId ������
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean outRoom(Integer roomId);
}
