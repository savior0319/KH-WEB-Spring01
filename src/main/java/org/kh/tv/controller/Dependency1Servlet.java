package org.kh.tv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.tv.model.vo.TV;
import org.kh.tv.model.vo.TVmgr;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Dependency1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dependency1Servlet() {
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

		request.setCharacterEncoding("utf-8");

		// TV tv = (TV) BeanFactory.getBean(request.getParameter("beanName"));
		// tv.turnOn();
		// tv.turnOff();
		// tv.soundUp();
		// tv.soundDown();

		// xml 파일에 있는 Bean객체를 가져오기 위한 작업
		// 1. xml 파일을 읽어야 함
		AbstractApplicationContext context = new GenericXmlApplicationContext("/sampleContext.xml");
		TV tv = (context.getBean("tvMgr", TVmgr.class)).getTv();
		// TV tv = ((TVmgr) context.getBean("tvMgr")).getTv();

		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();

	}

}
