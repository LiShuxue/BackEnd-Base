/**
 * �Զ���map����
 */
function Map() {	//js���췽�������Դ�������
	//�洢��ֵ
	this.put = function(key, value) {
		var s = "this." + key + '="' + value + '";';
		//this.key="value";Ϊ��ǰ���������һ�����ԣ�������key,ֵ���ַ�����value
		//����������������ã�put("my",200),ʵ��ִ��  this.my="200";
		eval(s);
	};
	
	//����ȡֵ
	this.get = function(key) {
		var v =eval("this." + key + ";");   //get("my)
		//this.key
		return v;
	};
	
	//�������еļ�
	this.keySet = function() {
		var keySets = new Array(); //����һ������
		for(key in this) {         //ѭ����ǰ�����е����е����Ժͷ�����4��������N�����ԣ�
			if(!(typeof(this[key]) == "function")) {  //�������һ�������Ļ���һ�������ԣ�
				keySets.push(key); //�������������key���浽�������棨���������N��Ԫ�أ�
			}
		}
		return keySets;
	};
	
	//���ؼ�ֵ����
	this.size = function() {
		return this.keySet().length;
	};
}