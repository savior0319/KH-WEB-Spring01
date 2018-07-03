package org.kh.bean.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.bean.model.vo.CollectionMapBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanTest4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeanTest4Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AbstractApplicationContext context = new GenericXmlApplicationContext("/applicationContext.xml");
		CollectionMapBean bean = context.getBean("mapBean", CollectionMapBean.class);
		context.close();
		
		Map<String, String> map = bean.getNameMap();
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " / " + map.get(key));
		}
		
		
		

	}

}
