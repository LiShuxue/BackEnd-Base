package demo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import freemarker.template.SimpleDate;

public class MyConverter extends DefaultTypeConverter {

	/**
	 * context  Action上下文
	 * value	要转换的源数据  是一个String数组（通过getparametervalues获得并保存的）
	 * toType  要转到的类型，该类型自己无法操作，根据系统环境的变化，产生的。
	 * 		比如从页面index到Action ，它就是Date， 这个时候的value 页面输入的日期字符串
	 * 			从action转发到 show  它就是string， value 它是action中的mytime
	 * 
	 * 	我们知道，从index到action ，struts提供了默认转换，这个自己不用写了。
	 * 我们要写的是  从action到show  就是 date 转到 string
	 */
	@Override
	public Object convertValue(Map<String, Object> context, Object value,
			Class toType) {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
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
