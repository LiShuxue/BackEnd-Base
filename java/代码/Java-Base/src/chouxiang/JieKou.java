package chouxiang;

public class JieKou{
	public static void main(String[] args) {
		C c = new C("lisi");
		c.work();
		c.conquetry();
		c.study();
		
		System.out.println("==========");
		Is s1 = c;    //��̬��   ��ʱs1ֻ�ܵ�Is�еķ����������ܵ������ӿ��е�
		s1.study();
//		s1.work();
//		s1.conquetry()
		
		//ͬ��cҲ���Զ�̬�������ӿ�����
		Is2 s2 = c;
		Is3 s3 = c;   //��ʱҲ��ֻ����ʵ�ֶ�Ӧ�Ľӿڵķ���
		
		System.out.println("-----------");
		//JieKou������е�method��������Ҫ�Ĳ������Ǹ��ӿ����͵ģ������Ǵ���ȥ����һ��ʵ���˶���ӿڵ���Ķ��󣬸��ݶ�̬���ǿ��Ե�
		new JieKou().method(c);  
		
		
		System.out.println("***********");
		//ͬ������Ҳ���Դ���ȥ����ӿ����͵Ķ���
		Is3 ii = new C();
		new JieKou().method(ii);  
	}	
	
	public void method(Is3 s) {      //������Ҫ��Is3���͵Ķ���
		s.work();
	}
}

class C implements Is,Is2,Is3{    //ѧ����
	private String name;

	public C(String name) {
		super();
		this.name = name;
	}

	public C(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void work() {
		System.out.println("����");
		
	}

	@Override
	public void conquetry() {
		System.out.println("����");
		
	}

	@Override
	public void study() {
		System.out.println("ѧϰ");
		
	}

	
}

interface Is {    //ѧ����ɫ��ѧϰ����
	//public abstract void study();
	void study();
}

interface Is2 {   //���ӽ�ɫ����������
	void conquetry();
}

interface Is3 {
	void work(); //Ա����ɫ����������
}