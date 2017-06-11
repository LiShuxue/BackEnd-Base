package com.ysj.service;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;
public interface IRoomWorkService {

	/**
	 * ���Ԥ����Ϣ
	 * @param bookInfo Ԥ����Ϣ
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addBookInfo(BookInfo bookInfo);
	/**
	 * �޸�Ԥ����Ϣ ����Ԥ��״̬Ϊ��ס��Ԥ����Ϣ���ܽ����޸ĺ�ȡ��������
	 * @param bookInfo Ԥ����Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean updateBookInfo(BookInfo bookInfo);
	/**
	 * ȡ��Ԥ����Ϣ
	 * @param bookId Ԥ����Ϣ���
	 * @return �Ƿ�ȡ���ɹ�
	 */
	boolean deleteBookInfo(Integer bookId);
	/**
	 * ��ѯ���е�Ԥ����Ϣ
	 * @return ���еķ���Ԥ����Ϣ
	 */
	List<BookInfo> selectBookInfo();
	

	/**
	 * ����Ԥ�����Ų�ѯ
	 * @param bookId Ԥ������
	 * @return ����Ԥ�����Ų�ѯ������Ԥ����
	 */
	List<BookInfo> selectBookInfoByBookId(Integer bookId);
	
	/**
	 * ���ݷ������Ͳ�ѯ
	 * @param roomType ��������
	 * @return ���ݷ������Ͳ�ѯ������Ԥ����
	 */
	List<BookInfo> selectBookInfoByRoomType(String roomType);
	
	/**
	 * ���ݷ���Ų�ѯ
	 * @param roomid �����
	 * @return ���ݷ���Ų�ѯ������Ԥ����
	 */
	List<BookInfo> selectBookInfoByRoomId(Integer roomId);
	
	/**
	 * 
	 * @param customerName Ԥ����
	 * @return ����Ԥ���˲�ѯ������Ԥ����
	 */
	List<BookInfo> selectBookInfoByCustomerName(String customerName);
	
	/**
	 * 
	 * @param bookStatus Ԥ����״̬
	 * @return ����Ԥ����״̬��ѯ������Ԥ����
	 */
	List<BookInfo> selectBookInfoByStatus(Integer bookStatus);
	
	/**
	 * ��õ�ǰ����Ԥ������
	 * @return
	 */
	Integer getBigestBookId();
	
	/**
	 * ����Ԥ���Ű�Ԥ������״̬��Ϊ�Ѿ���ס
	 * @param bookId Ԥ������
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean bookCi(Integer bookId);
	//------------bookinfo-------------------------ci----------------------------------
	/**
	 * ��ס!! �ȴ�����һ����������ס��Ϣ�� ��������ݿ� ��ͬʱ������״̬��Ϊ��ס
	 * @param ci ��ס��Ϣ��
	 * @return �Ƿ���ס�ɹ�
	 */
	boolean ci(Ci ci);
	
	/**
	 * ������ס���Ų�ѯ��ס��Ϣ
	 * @param id ��ס����
	 * @return ��ס��Ϣ
	 */
	List<Ci> selectCiById(Integer id);
	
	/**
	 * ������ס�������Ͳ�ѯ��ס��Ϣ
	 * @param roomType ��������
	 * @return ��ס��Ϣ
	 */
	List<Ci> selectCiByRoomType(String roomType);
	
	/**
	 * ���ݷ����Ų�ѯ��ס��Ϣ
	 * @param roomId ������
	 * @return ��ס��Ϣ
	 */
	List<Ci> selectCiByRoomId(Integer roomId);
	
	/**
	 * ������ס�˲�ѯ��ס��Ϣ
	 * @param Customer ��ס��
	 * @return ��ס��Ϣ
	 */
	List<Ci> selectCiByCustomer(String Customer);
	
	/**
	 * ��õ�ǰ������ס����
	 * @return ��ǰ������ס����
	 */
	Integer getBigestCiId();

	//-------
	/**
	 * �˷� ���ݿ��б����˷���Ϣ ������״̬��Ϊ���� ��ס��״̬��Ϊ�Ѿ��˷�
	 * @param co �˷���Ϣ
	 * @return �Ƿ��˷��ɹ�
	 */
	boolean checkOut(Co co);
	
}
