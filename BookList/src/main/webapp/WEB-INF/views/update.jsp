<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>수정 페이지</title>
</head>
<body> 
  <h3>수정 페이지</h3>

  <form action="/booklist/update" method = "post">
    <div>
      책 제목 :
      <input type="text" name= "bookTitle" value="${book.bookTitle}">
    </div>
    <div>
      글쓴이 :
      <input type="text" name= "bookWriter" value="${book.bookWriter}">
    </div>

    <button>수정하기</button>
  
  </form>
  
</body>
</html>