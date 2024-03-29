-- 

CREATE TABLE BOOKLIST(
	BOOK_TITLE VARCHAR2(50)  NOT NULL ,
	BOOK_WRITER  VARCHAR2(50) ,
	READ_DATE DATE DEFAULT SYSDATE
);

DROP TABLE BOOKLIST;

CREATE TABLE BOOKLIST(
	BOOK_TITLE VARCHAR2(50)  PRIMARY KEY ,
	BOOK_WRITER  VARCHAR2(50) ,
	READ_DATE DATE DEFAULT SYSDATE
);

SELECT *
FROM BOOKLIST;

INSERT INTO BOOKLIST
VALUES('해리포터와 마법사의돌', '조앤케이롤링', DEFAULT);

INSERT INTO BOOKLIST
VALUES('해리포터와 비밀의방','조앤케이롤링',DEFAULT);

INSERT INTO BOOKLIST
VALUES('해리포터와 아즈카반의죄수','조앤케이롤링',DEFAULT);


INSERT INTO BOOKLIST 
VALUES ('살인자의 기억법','김영하',DEFAULT);


INSERT INTO BOOKLIST 
VALUES ('책제목1', '홍길동', DEFAULT);

INSERT INTO BOOKLIST 
VALUES ('책제목2', '홍길동', DEFAULT);

INSERT INTO BOOKLIST 
VALUES ('책제목3', '홍길동', DEFAULT);

COMMIT;

SELECT BOOK_TITLE, BOOK_WRITER, 
	TO_CHAR(READ_DATE, 'YYYY-MM-DD')  READ_DATE
FROM BOOKLIST;

DELETE FROM BOOKLIST 
WHERE BOOK_TITLE LIKE '%' || ? || '%';

SELECT * FROM BOOKLIST 
WHERE BOOK_TITLE LIKE '%' || '해리포터' || '%';

-- 도서 추가
INSERT INTO BOOKLIST 
VALUES ('?', '?', DEFAULT);

SELECT *
FROM BOOKLIST ;

-- 도서 수정
UPDATE BOOKLIST 
SET BOOK_TITLE = '해리포터',
   BOOK_WRITER = '글쓴이',
   READ_DATE = DEFAULT
WHERE BOOK_TITLE = '책1';

