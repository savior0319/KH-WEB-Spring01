package org.kh.bean.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.bean.model.vo.TestDataVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeanTest1Servlet() {
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
		TestDataVO td1 = context.getBean("data", TestDataVO.class);
		TestDataVO td2 = context.getBean("data", TestDataVO.class);
		context.close();

		// scope가 sigleton 일 때 각각 101 102
		// scope가 protoype 일 때 각각 101 101
		td1.setData(td1.getData() + 1);
		System.out.println(td1.getData());

		td2.setData(td2.getData() + 1);
		System.out.println(td2.getData());

	}

}
