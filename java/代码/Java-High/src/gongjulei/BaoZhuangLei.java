package gongjulei;
/**
 * ����������װ�䣬���䣩
 */
public class BaoZhuangLei {
	
	public static void main(String[] args) {

		int num = 200;
		Integer num2 = new Integer(num);  //���
		
		int num3 = num2.intValue();    //���
		
		
		//ͨ��String����
		String s = "100";
		Integer num4 = new Integer(s);
		
		//��̬����parseInt(String s),���ַ���ת��Ϊ����
		int num5 = Integer.parseInt(s);
		
		//java�ṩ���Զ��Ĵ�����
		Integer num6 = 100;  //���
		int num7 = num6;     //���
		
		//������ת��Ϊ�ַ���
		String s2 = num6.toString();
		String s3 = num6 + "";
		
		/**
		 * �����İ�װ��
		 */
		Short myShort = 10;
		Byte myByte = 10;
		Long mylLong = 10L;
		Float myfFloat = 10.1f;
		Double mydDouble = 19.9;
		Boolean myBoolean = true;
		Character myCharacter = 'c';
	}
	
	/**
	 * ����һ������������ֵ�������ǰ�װ����.���õ�ʱ��ֱ�Ӵ����־���
	 */
	public static Double myMethod(Integer num) {
		Double d = num + 12.12;
		return d;
		
	}
	
}
