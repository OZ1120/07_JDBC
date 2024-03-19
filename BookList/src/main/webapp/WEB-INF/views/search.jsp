<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>검색 결과</title>
</head>
<body>
  <h1>검색 결과</h1>

  <table border="1">

    <thead>
      <th>책 제목</th>
      <th>글쓴이</th>
      <th>등록 날짜</th>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">

      <tr>
        <td>${book.bookTitle}</td>
        <td>${book.bookWriter}</td>
        <td>${book.readDate}</td>
      </tr>

      </c:forEach>
    </tbody>
		
  
  
  </table>
  
</body>
</html>