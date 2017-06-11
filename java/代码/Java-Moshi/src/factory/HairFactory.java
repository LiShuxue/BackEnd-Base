package factory;

import java.util.Map;

/*
 * ���͹���
 */
public class HairFactory {

	//�������ʹ�������
	public HairInterface getHair(String key) {
		if("left".equals(key)) {
			return new LeftHair();
		}else if("right".equals(key)){
			return new RightHair();
		}
		return null;
	}
	
	//���������������������
	public HairInterface getHairByClassKey(String key) {
		try {
			Map<String, String> map = new PropertiesReader().getProperties();
			HairInterface hair = (HairInterface)Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
