package org.kh.bean.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.bean.model.vo.CollectionSetBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanTest3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeanTest3Servlet() {
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
		CollectionSetBean bean = context.getBean("listSetBean", CollectionSetBean.class);
		context.close();
		
		Set<String> set = bean.getNameSet();

		for (String name : set) {
			System.out.println(name);
		}

	}

}
