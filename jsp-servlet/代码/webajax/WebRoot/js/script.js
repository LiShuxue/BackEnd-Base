//�Զ���Map ����
function Map(){	//js���췽�������Դ�������
	//�洢��ֵ
	this.put = function(key,value){
		var s = "this." + key + '="' + value + '";';
		//this.key="value";	��ǰ���������һ�����ԣ�������key������ֵ���ַ�����value
		//����������������ã�put("my",200) ʵ��ִ��		this.my = "200";
		eval(s);
	};
	//����ȡֵ
	this.get = function(key){
		var v = eval("this." + key + ";");	//get("my")		
		//this.key;
		return v;	//this.my;
	};
	
	//�������м�
	this.keySet = function(){
		var keySets = new Array();	//����һ������
		for(key in this){	//ѭ����ǰ���������е����Ժͷ�����N�����ԣ�����4��������
			if(!(typeof(this[key]) == "function")){	//�������һ�������Ļ���һ�������ԣ�
				keySets.push(key);		//�������������key���浽�������棨���������N��Ԫ�أ�
			}
		}
		return keySets;
	};
	
	//���ؼ�ֵ����
	this.size = function(){
		return this.keySet().length;
	};

}


//����ִ��ajax������
function myAjax(){
	var xmlHttp = null;		//�����������
	//ʵ�������������
	if(window.XMLHttpRequest){	//��������֧��XMLHttpRequest
		xmlHttp = new XMLHttpRequest();
	}else{
		if(window.ActiveXObject){
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	
	var handler = null;//����ص�����������ʱ function(resTest){}�����԰�handler���ɷ�����
	/*
	 * url����·��
	 * map �������
	 * mode ����ʽ	get/post
	 * synchro ͬ���첽 trueΪ�첽
	 * _handler ��Ӧ����Ҫ���ķ���
	 * */
	this.invoke = function(url,map,mode,synchro,_handler){
		handler = _handler;		//�������ķ�����������handler�������������callback��������Ҫ������
		var param = "";//�������Ӳ���
		var keys = map == null ? {} : map.keySet();	//���û�в�����map���Դ�null����
		for(i in keys){		//ѭ�����в�����ƴ�Ӳ������� a=1&b=2&c=3,������渳��{}��ѭ��
			key = keys[i];
			param += i < keys.length-1 ? key + "=" + map[key] + "&" : key + "=" + map[key];
		}
		url = param == "" ? url : url + "?" + param;  //�磺DemoServlet?a=1&b=2&c=3,����޲��� DemoServlet
		xmlHttp.open(mode,url,synchro);		//����һ��������
		xmlHttp.onreadystatechange = this.callback;		//������Ӧ��������õķ������ص�������
		xmlHttp.send(null);		//�����������  nullΪ�˴�������Ҫ���Ĳ���(����url�Ѿ�����)
	};
	
	this.callback = function(){
		if(xmlHttp.readyState == 4){		//��������Ѿ��ɹ������ˣ�������ӦҲ�ɹ���
			if(xmlHttp.status == 200){
				handler(xmlHttp.responseText);	
				//�˴�"��ͬ"�����˴������ķ��� function(resTest),����Ӧ��ϢxmlHttp.responseText��������ķ�������resTest
			}else{
				alert("Request Error," + xmlHttp.statusText);
			}
		}
	};
}





















