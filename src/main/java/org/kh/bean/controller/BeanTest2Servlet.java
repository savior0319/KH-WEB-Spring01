package org.kh.bean.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.bean.model.vo.CollectionBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanTest2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeanTest2Servlet() {
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
		CollectionBean bean = context.getBean("listBean", CollectionBean.class);
		context.close();

		List<String> list = bean.getNameList();

		for (String name : list) {
			System.out.println(name);
		}

	}

}
