<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>메인 페이지</title>
</head>
<style type="text/css" media="screen">
a {
	text-decoration: none;
}
</style>
<body>
	<h1>스프링 기본 페이지</h1>
	<!-- <form action="/dependency1" method="get" accept-charset="utf-8">
		<input type="text" name="beanName" placeholder="samsung or lg">
		<button type="submit">전송</button>
	</form> -->
	<a href="/dependency1">1. 결합도 예제</a>
	<br>
	<a href="/dependency2">2. 의존성 예제</a>
	<br>
	<a href="/beanTest1">3. scope 속성</a>
	<br>
	<a href="/beanTest2">4. Collection List 처리</a>
	<br>
	<a href="/beanTest3">5. Collection Set 처리</a>
	<br>
	<a href="/beanTest4">6. Collection Map 처리</a>
	<br>	
	<a href="/annotation">7. Annotaion 확인 </a>
	<br>
</body>
</html>