//自定义Map 集合
function Map(){	//js构造方法，可以创建对象
	//存储键值
	this.put = function(key,value){
		var s = "this." + key + '="' + value + '";';
		//this.key="value";	当前对象新添加一个属性，名字是key，他的值是字符串的value
		//如果方法被这样调用：put("my",200) 实际执行		this.my = "200";
		eval(s);
	};
	//按键取值
	this.get = function(key){
		var v = eval("this." + key + ";");	//get("my")		
		//this.key;
		return v;	//this.my;
	};
	
	//返回所有键
	this.keySet = function(){
		var keySets = new Array();	//创建一个数组
		for(key in this){	//循环当前对象中所有的属性和方法（N个属性，和这4个方法）
			if(!(typeof(this[key]) == "function")){	//如果不是一个方法的话（一定是属性）
				keySets.push(key);		//将这个属性名（key）存到数组里面（这个数组会存N个元素）
			}
		}
		return keySets;
	};
	
	//返回键值数量
	this.size = function(){
		return this.keySet().length;
	};

}


//用来执行ajax请求发送
function myAjax(){
	var xmlHttp = null;		//定义请求对象
	//实例化该请求对象
	if(window.XMLHttpRequest){	//如果浏览器支持XMLHttpRequest
		xmlHttp = new XMLHttpRequest();
	}else{
		if(window.ActiveXObject){
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	
	var handler = null;//保存回调方法，传参时 function(resTest){}，可以把handler当成方法名
	/*
	 * url请求路径
	 * map 请求参数
	 * mode 请求方式	get/post
	 * synchro 同步异步 true为异步
	 * _handler 响应后，需要调的方法
	 * */
	this.invoke = function(url,map,mode,synchro,_handler){
		handler = _handler;		//将传进的方法交给属性handler，提高作用域，在callback方法中需要调用他
		var param = "";//用于连接参数
		var keys = map == null ? {} : map.keySet();	//如果没有参数，map可以传null进来
		for(i in keys){		//循环所有参数，拼接参数，如 a=1&b=2&c=3,如果上面赋了{}则不循环
			key = keys[i];
			param += i < keys.length-1 ? key + "=" + map[key] + "&" : key + "=" + map[key];
		}
		url = param == "" ? url : url + "?" + param;  //如：DemoServlet?a=1&b=2&c=3,如果无参则 DemoServlet
		xmlHttp.open(mode,url,synchro);		//建立一个新请求
		xmlHttp.onreadystatechange = this.callback;		//设置响应结束后调用的方法（回调方法）
		xmlHttp.send(null);		//发送这个请求  null为此处无其他要传的参数(上面url已经传了)
	};
	
	this.callback = function(){
		if(xmlHttp.readyState == 4){		//如果请求已经成功发送了，并且响应也成功了
			if(xmlHttp.status == 200){
				handler(xmlHttp.responseText);	
				//此处"等同"调用了传进来的方法 function(resTest),将响应信息xmlHttp.responseText，给了你的方法参数resTest
			}else{
				alert("Request Error," + xmlHttp.statusText);
			}
		}
	};
}





















