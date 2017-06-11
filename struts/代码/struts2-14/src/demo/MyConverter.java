package demo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import freemarker.template.SimpleDate;

public class MyConverter extends DefaultTypeConverter {

	/**
	 * context  Action������
	 * value	Ҫת����Դ����  ��һ��String���飨ͨ��getparametervalues��ò�����ģ�
	 * toType  Ҫת�������ͣ��������Լ��޷�����������ϵͳ�����ı仯�������ġ�
	 * 		�����ҳ��index��Action ��������Date�� ���ʱ���value ҳ������������ַ���
	 * 			��actionת���� show  ������string�� value ����action�е�mytime
	 * 
	 * 	����֪������index��action ��struts�ṩ��Ĭ��ת��������Լ�����д�ˡ�
	 * ����Ҫд����  ��action��show  ���� date ת�� string
	 */
	@Override
	public Object convertValue(Map<String, Object> context, Object value,
			Class toType) {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��MM��dd��");
		//System.out.println(toType);
		if(toType == String.class){
			Date time = (Date)value;
			java.util.Date newTime = new java.util.Date(time.getTime());
			return sf.format(newTime);
			
		}else if(toType == Date.class){
			sf = new SimpleDateFormat("yyyy-MM-dd");
			String[] params = (String[])value;
			java.util.Date time = null;
			try {
				time = sf.parse(params[0]);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
			return new Date(time.getTime());
		}
		
		return super.convertValue(context, value, toType);
	}

	
}
