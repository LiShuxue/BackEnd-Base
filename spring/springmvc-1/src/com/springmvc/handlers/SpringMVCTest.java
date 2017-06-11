package com.springmvc.handlers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entitys.User;

@SessionAttributes(value={"user"}, types={String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	@RequestMapping("/test")
	public String test(){
		System.out.println("test");
		return "success";
	}
	
	@RequestMapping(value="testMethod", method=RequestMethod.POST)//这里的testMethod前面“/“可加可不加
	public String testMethod() {
		System.out.println("test method");
		return "success";
	}
	
	@RequestMapping("/testParam")
	public String testParam(@RequestParam(value="username") String un,
			@RequestParam(value="age") int age){
		System.out.println("username:" + un + ", age:" + age);
		return "success";	
	}
	
	@RequestMapping("/testPOJO")
	public String testPojo(User user) {
		System.out.println("testPojo:" + user);
		return "success";
	}
	
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		String modelandview = "success";
		ModelAndView modelAndView2 = new ModelAndView(modelandview);
		modelAndView2.addObject("time", new Date());
		return modelAndView2;
	}
	
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map) {
		map.put("names", Arrays.asList("Tom", "Kity"));
		return "success";
	}
	
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttribute(Map<String, Object> map) {
		User user = new User("lishuxue", "666", "1149926505@qq.com");
		map.put("user", user);
		map.put("school", "xxx");
		return "success";
	}
	
	@RequestMapping("/testView")
	public String testView() {
		System.out.println("testView");
		return "helloView";    //这个视图要跟自己写的那个类名字一样，但是首字母要小写。其他都一样。
	}
	
	@RequestMapping("/testRedirect")
	public String testRedirect() {
		System.out.println("testRedirect");
		return "redirect:/index.jsp";   //这里的redirect也可以换成forward
	}
}
