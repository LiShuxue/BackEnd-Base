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
	 *  从字符串 转到你想要的（提交表单时的转换）
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
	 *  从action属性 转到 字符串
	 */
	@Override
	public String convertToString(Map arg0, Object value) {
		System.out.println(2);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
		return sf.format(new java.util.Date(  ((Date)value).getTime() ));
	}

}
