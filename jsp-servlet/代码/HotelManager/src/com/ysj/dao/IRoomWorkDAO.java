package com.ysj.dao;

import java.util.List;

import com.ysj.bean.BookInfo;
import com.ysj.bean.Ci;
import com.ysj.bean.Co;

public interface IRoomWorkDAO {

	/**
	 * ���Ԥ����Ϣ
	 * @param bookInfo Ԥ����Ϣ
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addBookInfo(BookInfo bookInfo);
	/**
	 * �޸�Ԥ����Ϣ
	 * @param bookInfo Ԥ����Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean updateBookInfo(BookInfo bookInfo);
	/**
	 * ɾ��һ��Ԥ����Ϣ
	 * @param bookInfo Ԥ����Ϣ
	 * @return �Ƿ�ɾ���ɹ�
	 */
	boolean deleteBookInfo(Integer bookId);
	/**
	 * ��ѯ���е�Ԥ����Ϣ
	 * @return ���еķ���Ԥ����Ϣ
	 */
	List<BookInfo> selectBookInfo();
	
	/**
	 * ����Ԥ�����Ų�ѯ�õ���Ԥ��״̬
	 * @param bookId Ԥ������
	 * @return Ԥ��״̬
	 */
	Integer getStatusById(Integer bookId);
	
	/**
	 * ��õ�ǰ����Ԥ������
	 * @return
	 */
	Integer getBigestBookId();
	
	/**
	 *  Ԥ��ת��ס ��Ԥ�����ŵ�״̬��Ϊ2 ���Ѿ���ס
	 * @param bookId Ԥ������
	 * @return �Ƿ�ת��ɹ�
	 */
	boolean bCheckIn(Integer bookId);
	
	/**
	 * ���һ����ס��Ϣ
	 * @param ci ��ס��Ϣ
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addCi(Ci ci);
	
	/**
	 * �����˷���ס��Ϣ��״̬��0��Ϊ1 ��ʾ��ס���
	 * @param ciId ��ס����
	 * @return �Ƿ��޸ĳɹ�
	 */
	boolean cico(Integer ciId);
	
	/**
	 * ����Ԥ�����Ż�ø�Ԥ����Ϣ
	 * @param bookId Ԥ������
	 * @return Ԥ����Ϣ
	 */
	List<BookInfo> getBookInfoById(Integer bookId);
	
	/**
	 * ��ѯ����������ס�ĵǼ���Ϣ
	 * @return ����������ס�ĵǼ���Ϣ
	 */
	List<Ci> selectCi();
	
	/**
	 * ���ݷ���Ų�ѯ������ס�ĵǼ���Ϣ
	 * @param roomId �����
	 * @return �Ǽ���Ϣ
	 */
	List<Ci> getCiByRoomId(Integer roomId);
	
	/**
	 * ��õ�ǰ������ס����
	 * @return ��ǰ������ס����
	 */
	Integer getBigestCiId();
	
	/**
	 * ���һ���˷���Ϣ
	 * @param co �˷���Ϣ
	 * @return �Ƿ���ӳɹ�
	 */
	boolean addCo(Co co);
}
