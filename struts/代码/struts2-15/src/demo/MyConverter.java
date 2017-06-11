package demo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import freemarker.template.SimpleDate;

public class MyConverter extends StrutsTypeConverter{

	/**
	 *  ���ַ��� ת������Ҫ�ģ��ύ��ʱ��ת����
	 */
	@Override
	public Object convertFromString(Map arg0, String[] values, Class toType) {
		System.out.println(1);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//System.out.println(sf.parse(values[0]));
			return new Date( sf.parse(values[0]).getTime() );
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *  ��action���� ת�� �ַ���
	 */
	@Override
	public String convertToString(Map arg0, Object value) {
		System.out.println(2);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��MM��dd��");
		return sf.format(new java.util.Date(  ((Date)value).getTime() ));
	}

}
