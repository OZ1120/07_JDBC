<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>독서</title>
</head>
<body>

   <h1>독서 목록</h1>

  <table border="1">
    <thead>
      <th>책 제목</th>
      <th>글쓴이</th>
      <th>등록 날짜</th>
      <th> 제목 수정/삭제</th>
    </thead>

    <tbody>
    <c:forEach items="${bookList}" var="book">
      <tr>
        <td>${book.bookTitle}</td>
        <td>${book.bookWriter}</td>
        <td>${book.readDate}</td>
        <th>
          <button type="button" class="update-btn"> 수정</button>
          <button type="button" class="delete-btn"> 삭제</button>
        </th>
      </tr>
      </c:forEach>
    </tbody>
		
  </table>
  <script src="/resources/js/delete.js"></script>

  <hr>

  <h3>도서명 검색</h3>
  <form action="/booklist/search" method="GET">
    검색어 입력 :
    <input type="text" name = "keyword">
    <button>검색</button>
  </form>

  <hr>
 
  <form action="/booklist/add" method= "get">
    <h3>도서 추가</h3>

    <div>
      제목 : <input type="text" name = "bookTitle">
    </div>
    <div>
      글쓴이 : <input type="text" name = "bookWriter">
    </div>
    <button>추가</button>
  </form>

  <hr>
  

</body>
</html>