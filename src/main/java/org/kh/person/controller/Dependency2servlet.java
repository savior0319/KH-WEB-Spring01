package org.kh.person.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.person.model.vo.PersonMgr;
import org.kh.person.model.vo.PersonVO;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Dependency2servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Dependency2servlet() {
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

		AbstractApplicationContext context = new GenericXmlApplicationContext("/personContext.xml");
		PersonVO pv = context.getBean("pMgr", PersonMgr.class).getPs();

		response.setContentType("text/html; charset=utf-8");
		response.getWriter()
				.println("이름 : " + pv.getName() + "<br>" + "나이 : " + pv.getAge() + "<br>" + "주소 :" + pv.getAdrr());

	}

}
