**환경
1.windows 10
2.sts tool(Version:3.9.17.RELEASE)3
3.oracle 11g
4.jdk11
5.인코딩 utf-8
6.git
7.jstl.jar
8.ojdbc6.jar
9.standard.jar
10.cos.jar(version:cos-22.05.zip)
11.lombok-1.18.24.jar


DBCP--- 
<Resource name="jdbc/myoracle" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:XE"
              username="scott" password="tiger" maxTotal="20" maxIdle="10"
              maxWaitMillis="-1"/>


--Oracle DB
CREATE table board(
    num NUMBER(5) PRIMARY KEY,
    pass VARCHAR2(30),
    name VARCHAR2(30),
    email VARCHAR2(30),
    title VARCHAR2(50),
    content VARCHAR2(1000),
    readcount NUMBER(4) DEFAULT 0,
    writedate DATE DEFAULT sysdate
);

desc board;

CREATE SEQUENCE board_seq START with 1 INCREMENT by 1;

insert into BOARD(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '성윤정' , 'pinksung@nate.com', '1234', '첫방문', '반갑습니다.');
insert into BOARD(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '성윤정' , 'pinksung@nate.com', '1234', '김밥', '맛있어요.');
insert into BOARD(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '전수빈' , 'racon@nate.com', '3333', '고등어', '일식입니다.');
insert into BOARD(num, name, email, pass, title, content)
values(BOARD_SEQ.NEXTVAL, '전원지' , 'one@nate.com', '1111', '갯골마을', '돼지삼겹살이 맛있습니다..');

commit;

SELECT * FROM BOARD;