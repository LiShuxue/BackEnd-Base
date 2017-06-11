/**
 * 自定义map集合
 */
function Map() {	//js构造方法，可以创建对象
	//存储键值
	this.put = function(key, value) {
		var s = "this." + key + '="' + value + '";';
		//this.key="value";为当前对象新添加一个属性，名字是key,值是字符串的value
		//如果方法被这样调用：put("my",200),实际执行  this.my="200";
		eval(s);
	};
	
	//按键取值
	this.get = function(key) {
		var v =eval("this." + key + ";");   //get("my)
		//this.key
		return v;
	};
	
	//返回所有的键
	this.keySet = function() {
		var keySets = new Array(); //创建一个数组
		for(key in this) {         //循环当前对象中的所有的属性和方法（4个方法，N个属性）
			if(!(typeof(this[key]) == "function")) {  //如果不是一个方法的话（一定是属性）
				keySets.push(key); //将这个属性名（key）存到数组里面（这个数组会存N个元素）
			}
		}
		return keySets;
	};
	
	//返回键值数量
	this.size = function() {
		return this.keySet().length;
	};
}