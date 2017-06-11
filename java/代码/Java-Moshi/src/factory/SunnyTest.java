package factory;

public class SunnyTest {

	public static void main(String[] args) {
//		HairInterface left = new LeftHair();
//		left.draw();
		
		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");		
//		left.draw();
		
//		HairInterface left = factory.getHairByClass("factory.LeftHair");
//		left.draw();
		
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
		
		PersonFactory factory2 = new MCFactory();
		Girl girl = factory2.getGirl();
		girl.drawWomen();
		
		PersonFactory factory3 = new HNFactory();
		Boy boy = factory3.getBoy();
		boy.drawMan();
	}
}
