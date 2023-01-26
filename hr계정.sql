alter session set nls_date_format='YYYY-MM-DD';
--영구 삭제
drop table emp purge ;
CREATE TABLE EMP ( 
  EMPNO     NUMBER(4, 0), 
  ENAME     VARCHAR2(10), 
  JOB       VARCHAR2(9), 
  MGR       NUMBER(4, 0), 
  HIREDATE  DATE, 
  SAL       NUMBER(7, 2),
  COMM      NUMBER(7, 2), 
  DEPTNO    NUMBER(2, 0));

insert into emp values (7369,'김철수','사원',7902,'2000-12-17',200,null,20);
insert into emp values (7499,'이찬수','주임',7698,'2001-02-20',260,300,30);
insert into emp values (7521,'박종수','주임',7698,'2002-02-22',325,500,30);
insert into emp values (7566,'임채호','과장',7839,'2001-04-02',497,null,20);
insert into emp values (7654,'나대호','주임',7698,'2001-09-28',325,1400,30);
insert into emp values (7698,'박지성','과장',7839,'2001-05-01',485,null,30);
insert into emp values (7782,'구자철','과장',7839,'2001-06-09',445,null,10);
insert into emp values (7788,'송기성','부장',7566,'1997-04-17',500,null,20);
insert into emp values (7839,'김철호','대표',null,'2001-11-17',800,null,10);
insert into emp values (7844,'성명준','주임',7698,'2001-09-08',350,0,30);
insert into emp values (7876,'황인태','사원',7788,'2007-05-23',210,null,20);
insert into emp values (7900,'박민성','사원',7698,'2001-12-03',295,null,30);
insert into emp values (7902,'박진성','부장',7566,'2001-12-03',600,null,20);
insert into emp values (7934,'최철호','사원',7782,'2012-01-23',230,null,10);


CREATE UNIQUE INDEX PK_EMP ON EMP (EMPNO) ;
ALTER TABLE EMP ADD  CONSTRAINT PK_EMP PRIMARY KEY (EMPNO);

drop table dept purge ;
CREATE TABLE DEPT (
  DEPTNO   NUMBER(2,0), 
  DNAME    VARCHAR2(14), 
  LOC      VARCHAR2(13));

insert into dept values (10,'경리팀','부산');
insert into dept values (20,'연구팀','대전');
insert into dept values (30,'총무팀','대구');
insert into dept values (40,'전산팀','인천');

CREATE UNIQUE INDEX PK_DEPT ON DEPT (DEPTNO);
ALTER TABLE DEPT ADD  CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO);

ALTER TABLE EMP ADD CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO);



drop table professor purge;

create table professor
(profno number(4) primary key,
 name  varchar2(10) not null, 
 id  varchar2(15) not null,
 position varchar2 (20) not null,
 pay number (3) not null,
 hiredate  date not null,
 bonus number(4) ,
 deptno  number(3),
 email  varchar2(50),
 hpage  varchar2(50)) tablespace users;

insert into professor
values(1001,'조인형','captain','정교수',550,to_date('1980-06-23','YYYY-MM-DD'),100,101,'captain@abc.net','http://www.abc.net');

insert into professor
values(1002,'박승곤','sweety','조교수',380,to_date('1987-01-30','YYYY-MM-DD'),60,101,'sweety@abc.net','http://www.abc.net');

insert into professor
values (1003,'송도권','powerman','전임강사',270,to_date('1998-03-22','YYYY-MM-DD'),null,101,'pman@power.com','http://www.power.com');

insert into professor
values (2001,'양선희','lamb1','전임강사',250,to_date('2001-09-01','YYYY-MM-DD'),null,102,'lamb1@hamail.net',null);

insert into professor
values (2002,'김영조','number1','조교수',350,to_date('1985-11-30','YYYY-MM-DD'),80,102,'number1@naver.com','http://num1.naver.com');

insert into professor
values (2003,'주승재','bluedragon','정교수',490,to_date('1982-04-29','YYYY-MM-DD'),90,102,'bdragon@naver.com',null);

insert into professor
values (3001,'김도형','angel1004','정교수',530,to_date('1981-10-23','YYYY-MM-DD'),110,103,'angel1004@hanmir.com',null);

insert into professor
values (3002,'나한열','naone10','조교수',330,to_date('1997-07-01','YYYY-MM-DD'),50,103,'naone10@empal.com',null);

insert into professor
values (3003,'김현정','only-u','전임강사',290,to_date('2002-02-24','YYYY-MM-DD'),null,103,'only_u@abc.com',null);

insert into professor
values (4001,'심슨','simson','정교수',570,to_date('1981-10-23','YYYY-MM-DD'),130,201,'chebin@daum.net',null);

insert into professor
values (4002,'최슬기','gogogo','조교수',330,to_date('2009-08-30','YYYY-MM-DD'),null,201,'gogogo@def.com',null);

insert into professor
values (4003,'박원범','mypride','조교수',310,to_date('1999-12-01','YYYY-MM-DD'),50,202,'mypride@hanmail.net',null);

insert into professor
values (4004,'차범철','ironman','전임강사',260,to_date('2009-01-28','YYYY-MM-DD'),null,202,'ironman@naver.com',null);

insert into professor
values (4005,'바비','standkang','정교수',500,to_date('1985-09-18','YYYY-MM-DD'),80,203,'standkang@naver.com',null);

insert into professor 
values (4006,'전민','napeople','전임강사',220,to_date('2010-06-28','YYYY-MM-DD'),null,301,'napeople@jass.com',null);

insert into professor
values (4007,'허은','silver-her','조교수',290,to_date('2001-05-23','YYYY-MM-DD'),30,301,'silver-her@daum.net',null);

commit;

drop table department purge;
create table department
( deptno number(3) primary key ,
  dname varchar2(30) not null,
  part number(3),
  build  varchar2(30))tablespace users;

insert into department 
values (101,'컴퓨터공학과',100,'정보관');

insert into department
values (102,'멀티미디어공학과',100,'멀티미디어관');

insert into department
values (103,'소프트웨어공학과',100,'소프트웨어관');

insert into department
values (201,'전자공학과',200,'전자제어관');

insert into department
values (202,'기계공학과',200,'기계실험관');

insert into department
values (203,'화학공학과',200,'화학실습관');

insert into department
values (301,'문헌정보학과',300,'인문관');

insert into department
values (100,'컴퓨터정보학부',10,null);

insert into department
values (200,'메카트로닉스학부',10,null);

insert into department
values (300,'인문사회학부',20,null);

insert into department
values (10,'공과대학',null,null);

insert into department
values (20,'인문대학',null,null);

commit;
 

drop table student purge;

create table student
( studno number(4) primary key,
  name   varchar2(10) not null,
  id varchar2(20) not null unique,
  grade number check(grade between 1 and 6),
  jumin char(13) not null,
  birthday  date,
  tel varchar2(15),
  height  number(4),
  weight  number(3),
  deptno1 number(3),
  deptno2 number(3),
  profno  number(4)) tablespace users;

insert into student values (
9411,'서진수','75true',4,'7510231901813',to_date('1975-10-23','YYYY-MM-DD'),'055)381-2158',180,72,101,201,1001);

insert into student values (
9412,'서재수','pooh94',4,'7502241128467',to_date('1975-02-24','YYYY-MM-DD'),'051)426-1700',172,64,102,null,2001);

insert into student values (
9413,'이미경','angel000',4,'7506152123648',to_date('1975-06-15','YYYY-MM-DD'),'053)266-8947',168,52,103,203,3002);

insert into student values (
9414,'김재수','gunmandu',4,'7512251063421',to_date('1975-12-25','YYYY-MM-DD'),'02)6255-9875',177,83,201,null,4001);

insert into student values (
9415,'박동호','pincle1',4,'7503031639826',to_date('1975-03-03','YYYY-MM-DD'),'031)740-6388',182,70,202,null,4003);

insert into student values (
9511,'김신영','bingo',3,'7601232186327',to_date('1976-01-23','YYYY-MM-DD'),'055)333-6328',164,48,101,null,1002);

insert into student values (
9512,'신은경','jjang1',3,'7604122298371',to_date('1976-04-12','YYYY-MM-DD'),'051)418-9627',161,42,102,201,2002);

insert into student values (
9513,'오나라','nara5',3,'7609112118379',to_date('1976-09-11','YYYY-MM-DD'),'051)724-9618',177,55,202,null,4003);

insert into student values (
9514,'구유미','guyume',3,'7601202378641',to_date('1976-01-20','YYYY-MM-DD'),'055)296-3784',160,58,301,101,4007);

insert into student values (
9515,'임세현','shyun1',3,'7610122196482',to_date('1976-10-12','YYYY-MM-DD'),'02)312-9838',171,54,201,null,4001);

insert into student values (
9611,'일지매','onejimae',2,'7711291186223',to_date('1977-11-29','YYYY-MM-DD'),'02)6788-4861',182,72,101,null,1002);

insert into student values (
9612,'김진욱','samjang7',2,'7704021358674',to_date('1977-04-02','YYYY-MM-DD'),'055)488-2998',171,70,102,null,2001);

insert into student values (
9613,'안광훈','nonnon1',2,'7709131276431',to_date('1977-09-13','YYYY-MM-DD'),'053)736-4981',175,82,201,null,4002);

insert into student values (
9614,'김문호','munho',2,'7702261196365',to_date('1977-02-26','YYYY-MM-DD'),'02)6175-3945',166,51,201,null,4003);

insert into student values (
9615,'노정호','star123',2,'7712141254963',to_date('1977-12-14','YYYY-MM-DD'),'051)785-6984',184,62,301,null,4007);

insert into student values (
9711,'이윤나','prettygirl',1,'7808192157498',to_date('1978-08-19','YYYY-MM-DD'),'055)278-3649',162,48,101,null,null);

insert into student values (
9712,'안은수','silverwt',1,'7801051776346',to_date('1978-01-05','YYYY-MM-DD'),'02)381-5440',175,63,201,null,null);

insert into student values (
9713,'인영민','youngmin',1,'7808091786954',to_date('1978-08-09','YYYY-MM-DD'),'031)345-5677',173,69,201,null,null);

insert into student values (
9714,'김주현','kimjh',1,'7803241981987',to_date('1978-03-24','YYYY-MM-DD'),'055)423-9870',179,81,102,null,null);

insert into student values (
9715,'허우','wooya2702',1,'7802232116784',to_date('1978-02-23','YYYY-MM-DD'),'02)6122-2345',163,51,103,null,null);

commit;


select * from tab;

-- 사원테이블 emp
select * from emp;

-- 부서테이블 dept
select * from dept;


select distinct job from emp;

select  job from emp;

select *
from emp
order by sal asc;

--입사일자를 오름차순으로 정렬
select * from emp order by hiredate;

-- 만약 입사일자가 같을 경우(박진성,박민성) 급여를 내림차순으로 정렬
select * from emp order by hiredate, sal desc;

select ename as "이름", job 직책, sal 급여
from emp
order by job, sal desc;

select * from emp
where sal >100 and sal <400
order by sal desc;

-- 급여가 100이상이고 급여가 400이하인 직원검색 (급여 내림차순)
select * from emp
where sal >= 100 and sal <= 400
order by sal desc;

-- between A and B
select * from emp
where sal between 100 and 400
order by sal desc;

select * from emp
where sal <= 100 or sal >= 400
order by sal desc;

-- 급여가 200이상이고 300이하가 아닌 직원검색(급여 내림차순)
--not(집합)
select * from emp
where not(sal >= 200 and sal <= 300)
order by sal desc;

-- 급여가 250이상이고 350이하가 아닌 직원검색(급여 오름차순)
select * from emp
where not(sal >= 250 and sal <= 350)
order by sal;

select deptno, sal, ename from emp
where deptno=10 or deptno=20 or deptno=40;

select deptno, sal, ename from emp
where deptno in(10,20,40);

--sal이 300보다 큰 직원들
select ename, sal from emp
where sal >= any(300)
order by sal desc;

--sal이 정확히 200 또는 300 또는 400인 직원들만 출력
select ename, sal from emp
where sal in(200,300,400)
order by sal;

-- sal 이 300~500사이인 사람
select sal, ename from emp
where sal between 300 and 500;

-- like는 예를들어 이름에 성씨가 '성'인 사람
select ename from emp
where ename like '성%';

-- 이름에 '성'이 있는 사람
select ename from emp
where ename like '%성%';

-- 정확히 두번째 문자에 '철'이 들어간 사람
select ename from emp
where ename like '_철%'; --(_가 한개의 문자열을 의미)

-- 정확히 세번째 문자에 '호'가 들어간 사람
select ename from emp
where ename like '__호%';

-- 이름중에 특수문자 % 또는 _ 등 이 있을 땐 escape함수를 써야 정확히 검색 가능
insert into emp values (8888, '김_수','사원',9999,'2000-12-17',230,null,10);

select * from emp;

select ename from emp
where ename like '%_%';

select ename from emp
where ename like '%#_%' escape '#'; --정확히 '김_수'라는 사람이 검색

--  커미션이 null인 레코드 출력
select * from emp
where comm is null; --(주의: is 대신 =을 쓰면 안된다.)

-- 커미션이 null이 아닌 레코드
select * from emp
where comm is not null;

-- 연봉계산
select empno, ename, sal, comm, sal*12+comm from emp;

-- 연봉계산시 특정컬럼에 null이 있으면 계산이 안되기 때문에 nvl(A,B)함수를 써서 처리해야 한다.
select empno, ename, sal, comm, sal*12+nvl(comm,0) from emp;

--nvl(A,B) A의 값이 null이면 B, null이 아니면 A

-- nvl함수 활용, empno 사원번호, ename 이름, sal 급여, comm 보너스, sal*12+nvl(comm,0) 연봉 (연봉에 대해 오름차순)
select empno 사원번호, ename 이름, sal 급여, comm 보너스, sal*12+nvl(comm,0) 연봉 from emp
order by 연봉; --order by절에는 별칭으로도 처리 가능

select ename || '의 급여는 ' || sal || '입니다' from emp;

-- '누구누구의 연봉은 얼마입니다.' 를 출력
select ename || '의 연봉은' || (sal*12+nvl(comm,0)) || '입니다.' from emp;

select empno, sal from emp
where not(sal > 100 and sal < 300)
order by sal;

select count(*) from emp; --레코드 갯수
select sum(sal) from emp; --급여 합계
select avg(sal) from emp; --평균
select round(avg(sal), 2) from emp; --소수 2째자리에서 반올림
select min(sal) from emp; --최소값
select max(sal) from emp; --최대값

-- 부서별 직원수, 급여합계, 급여평균, 최저급여
select deptno, count(*), sum(sal), round(avg(sal), 2), min(sal), max(sal)
from emp
group by deptno
order by deptno;

--chr(아스키값)
select chr(65) from dual;
--dual : 가상테이블 (오라클에서는 select에서 반드시 from절을 붙여햐 하기 때문에 dual이라는 형식적 가상테이블을 쓰게된다.)
--참고:
select sysdate from dual; --오라클용
select now();--mySQL용

select ascii('A') from dual;

--concat(A,B) A와 B를 연결
--결합연산자와 같은 기능 A||B
select concat(ename, ' 의 직책은 '), job from emp;
select ename || ' 의 직책은 ' || job from emp;
select concat('로미오와 ', '줄리엣') from dual;

--initcap('문자열')
select initcap('abcDefg') from dual;

select lower('JAVA'), upper('java') from dual;

--LPAD
--빈자리를 '*'로 채움 (왼쪽으로)
select 'abcd', lpad('abcd',9,'*') from dual;

--빈자리를 공백으로 채움
select lpad('abcd',9) from dual;

--RPAD
select 'abcd', rpad('abcd',9,'*') from dual;
select rpad('abcd',9) from dual;

select substr('자바개발자 과정', 4, 3) from dual;
select ename from emp where substr(ename, 2, 1) = '철';
select ename from emp where ename like '_철%'; --위와 같은 결과

--instr
select instr('wow-wow-wow-wow', '-') from dual;

select instr('wow-wow-wow-wow', '-', 5, 1) from dual;

-- length
select length(rtrim('abcd    ', ' ') from dual;
select least(10,30,50,80) from dual;
select greatest('abc', 'abcd', 'abcdef') from dual; --문자길이가 제일 긴것도 리턴함
--greatest
select rownum, rowid, empno, ename
from emp
where rownum <=10;

select sysdate from dual;

--add months
--현재시간에서 3개월 후 값
select add_months(sysdate, 3) from dual;
--날짜지정(3개월 이전)
select add_months('2021/01/26', -3) from dual;
--입사 후 3개월 되는 시점
select empno, ename, hiredate, add_months(hiredate,3) from emp;
--오늘을 기준으로 100일 후의 날짜
select sysdate+100 from dual;

select empno, ename, hiredate, hiredate+90 from emp; --윤달까지 자동계산됨

select last_day('2021/05/21') from dual;

--입사일 이후 근무일수를 출력(반올림)
select empno, ename, hiredate, round(sysdate-hiredate) from emp;

--입사일 이후 근무일수(근무일수가 3000일보다 적은 직원)
select empno, ename, hiredate, round(sysdate-hiredate) 근무일수 
from emp
where sysdate-hiredate <8000
order by 근무일수;
--***SQL 실행순어 : from => where => select => order by

--months_between
select months_between('2022/03/15', '2022/06/26') from dual;

select studno, name, birthday, (sysdate-birthday)/30, months_between(sysdate, birthday)
from student;
--months_between() 이 더 정확

--next day
select next_day(sysdate, '토') from dual;
--지금 날짜를 기준으로 돌아오는 '토요일'은 몇일인가?

select to_char(sysdate, 'yyyy-mm-dd am hh:mi:ss day') from dual;
select to_char(sysdate, 'yy-mm-dd am hh24:mi:ss d') from dual;

--to_number()
select to_number('100')+1 결과값 from dual;

--to_date()
select to_date('23%02%22') 결과값 from dual;
--fm옵션은 01월 01일에서 0을 빼고 1월 1로 표시해줌
--select to_char(to_date('230101', 'yymmdd'), 'yyyy''년'' fmMM''월'' DD''일'') from dual;

select user from dual; 

--trunc
--trunc(8.9) => 소수점 이하를 버리고 정수 8만 반환
select trunc(3.129, 2) from dual;

--각 직원들에 대해서 직원의 이름과 근속연수를 출력(근속연수는 연단위를 버림해서 처리)
select ename, trunc((sysdate-hiredate)/365) 근속연수 from emp;

--round
select ename, round((sysdate-hiredate)/365) 근속연수1, round((sysdate-hiredate)/365, 2) 근속연수2
from emp;

--ceil 올림
select ename, ceil((sysdate-hiredate)/365) 근속연수 from emp;

select empno, ename, sal, comm, sal*12+comm from emp;

--nvl(A,B) a값이 null이면 b로 치환 아니면 A
select empno, ename, sal, comm, sal*12+nvl(comm,0) from emp;

select * from professor;

--101번 학과 교수들의 이름과 급여, bonus, 연봉을 출력
select name, pay, bonus, pay*12+nvl(bonus,0) as 연봉
from professor
where deptno=101;

--decode
--deptno에 대해 학과코드가 101은 컴퓨터공학과, 102 멀티미디어공하과
--103 소프트웨어 공학과, 201 전자공학, 이외 모두 기타학과로 출력
select name, deptno, decode(deptno, 
101,'컴퓨터공학과', 
102,'멀티미디어공학과',
103, '소프트웨어공학과',
201,'전자공학','기타학과') 
from professor;

--학과코드101 교수만 컴공과로 출력(101아닌교수들 학과명 아무것도 출력x)
select name, deptno, decode(deptno, 101, '컴퓨터공학과') 학과명
from professor;

--select 컬럼 리스트 from 조인대상 테이블들(컴머로 구분, 별칭사용)
--where 공통 칼럼을 이용한 조인조건
--and 일반조건

--student department
select * from student;
select * from department;

--student depart 테이블 사용해서 이름, 학과코드, 학과이름을 출력
select s.name 이름, s.deptno1 학과, d.dname 학과이름
from student s, department d
where s.deptno1= d.deptno; --조인조건 공통컬럼 = 공통컬럼

 --emp테이블의 사번과 dept테이블에 있는 부서명 조회
 select e.empno 사번, d.dname 부서명
 from emp e, dept d
 where e.deptno = d.deptno;
 
 select * from emp;
 select * from dept;
 
 --학생테이블, department 교수테이블 3개를 join해서 학생이름, 학과이름, 지도교수 이름을 출력
 select
 from student s, department d, professor p
 where s.deptno1=d.deptno and s.profno=p.profno;
 
 select s.name "학생이름", d.dname "학과", p.name "지도교수"
 from student s, department d, professor p
 where s.deptno1=d.deptno and s.profno=p.profno;
 
 --view : 가상테이블
 create or replace view student_v
 as
  from student s, department d, professor p
 where s.deptno1=d.deptno and s.profno=p.profno;
 
 --뷰를 테이블처럼 사용 가능
 select * from student_v;
 
 select * from tab;
 
 --view를 쓰는 이유는 복잡한 select문을 자주, 간단히 사용하고자 함
 --java code에 쓸 떄 select * from_v; 쓰면 코딩량 줄고, 통신량도 준다
 --코드가 노출되었을때 좀 더 보안에 좋음
 -- 단 속도가 느림 오라클이 테이블인지 뷰인지 먼저 검사 후 원본에서 쿼리문 가져와 실행하기 때문
 
 --cross 조인 : 조인조건 주지 않은 두 테이블간 조합가능한 모든 경우의 수를 계산
 select e.ename, d.dname
 from emp e, dept d; --엄밀히는 조인이 아님
 
 --self 조인 : 참조해야할 컬럼이 자신 테이블에 있는 다른 컬럼인 경우에 사용
 --테이블에 대한 별칭 꼭 있어야함
 --emp 테이블에서 매니저아이디(mgr)는 자신의 상급자(사수)의 empno와 동일하다
 -- 사용해서 각 사람의 사원번호, 이름, 매니저번호, 매니저이름을 조회
 
 select * from emp;
 
 select a.empno 사번, a.ename 이름, b.empno 매니저사번
 from emp a, emp b
 where a.mgr = b.empno;
 
 --외부조인 : 한쪽 테이블에는 해당 데이터 존재하고 다른 쪽 테이블 데이터 존재 X
 --조회 조건에서(+) 기호를 사용
 --오라클 경우 조인시킬 값이 없는 조인측에 (+) 위치
 -- (+) 붙은 칼럼과는 in연산자를 함께 사용할 수 없음
  -- (+) 붙은 칼럼과는 서브쿼리를 함께 사용할 수 없음
select * from emp order by deptno;
select * from dept order by deptno; 

select e.deptno 부서번호1, e.ename 사원이름, d.deptno 부서번호2, d.dname 부서이름
from emp e, dept d
where e.deptno(+) = d.deptno;

select 
from emp;

--문제1
select deptno, decode(deptno, 
10,'경리팀', 
20,'연구팀',
30, '총무팀',
40,'전자팀') 
from emp;

--문제 2
select ename, job, lpad(sal,5,'*')
from emp
where sal >= 300;

--문제3
select ename, trunc((sysdate-hiredate)/30) 근무개월수
from emp
where trunc((sysdate-hiredate)/30) >= 240
order by 근무개월수;
-- or
select ename, trunc(months_between(sysdate, hiredate)) 근무개월수
from emp
where months_between(sysdate, hiredate) >= 240
order by 근무개월수;


--문제 4
select ename, job, trunc((sysdate-hiredate)/7) 총근무주수
from emp
order by 총근무주수, ename;



--도전과제
select deptno1, name, jumin, grade, 
decode(substr(jumin,7,1),
1,'남',
2,'여')
from student
where deptno1=101;

--ANSI용 : 오라클과 달리 from절의 ,콤마 대신 left rifgt outer join을 쓰며 또한 where 절 대신 on으로 대체 
select e.detpno 부서번호1, e.name 사원이름, d.deptno 부서번호2, d.dname 부서이름
from emp e right outer join dept d
on e.deptno = d.deptno;

--ANSI 새로운 국제표준
--학생테이블 학과테이블을 조인해서 학과번호, 학과이름, 학생이름 출력
-- (오라클 query문)
select deptno1 학과번호, dname 학과이름, name 학생이름
from student s, department b --조인할 테이블들
where s.deptno1 = b.deptno
order by 학과번호;

--(ansi query문)
--from절 쉼표대신 inner join 또는 join
--where 대신 on
select deptno1 학과번호, dname 학과이름, name 학생이름
from student s inner join department b --조인할 테이블들
on s.deptno1 = b.deptno
order by 학과번호;

--ANSI
select e.empno, d.dname
from emp e inner join dept d --그냥 join도 가능
on e.deptno = d.deptno;

--조인칼럼 이름이 같을때는 on대신 using 사용(참조하는 칼럼명이 동일한 경우에만 사용가능)
select e.empno, d.dname
from emp e join dept d
using (deptno);

--학생테이블, 교수테이블을 조인해서 학생이름, 학과번호, 지도교수이름을 출력
select s.name 학생이름, s.deptno1 학과번호, p.name 교수이름
from student s, professor p
where s.profno = p.profno;

select * from student;
select * from professor;
--학생 테이블, 교수테이블을 조인해서 학생이름, 학과번호, 지도교수이름을 출력
--(단, 지도교수가 배정되지 않은 학생의 명단도 모두 출력)
--오라클용
select s.name 학생이름, s.deptno1 학과번호, p.name 교수이름
from student s, professor p
where s.profno = p.profno(+);

--ansi용 : 양쪽 outer join 가능
select s.name 학생이름, s.deptno1 학과번호, p.name 교수이름
from student s left outer join professor p
where s.profno = p.profno;


--학생테이블, 교수테이블을 조인해서 학생이름, 학과번호, 지도교수이름을 출력(단, 지도학생이 없는 교수까지 출력)
--오라클용
select s.name 학생이름, s.deptno1 학과번호, p.name 교수이름
from student s, professor p
where s.profno(+) = p.profno;--오라클은 불가능(+)를 양쪽에 쓸 수 없음

--union/ union all(조회환 다수의 select문을 하나로 합칠때 사용)
select deptno from emp;
select deptno from dept;

select deptno from emp
union --중복이 제거되고 정렬된 결과값 얻음
select deptno from dept;

select deptno from emp
union all --중복이 제거되지 않고 단순 합쳐진 결과값이 얻어짐. 단순 합치는 것으로 속도가 빠르다
select deptno from dept;

--intersect : 교집합을 나타낼 때 사용되는데, 두 쿼리간 같은 값들을 추출해서 보여준다
--부서번호가 20번이고 직책이 '사원'인 사번, 이름, 직책, 부서번호를 출력
select empno, ename, job, deptno
from emp
where deptno = 20;
intersect
select empno, ename, job, deptno
from emp
where job= '사원';

--minus : 차집합을 나타낼때 사용되는데, 선행 select 결과에서 다음 select 결과와 겹치는 부분을 제외한 나머지 부분 추출
select empno, ename, job, deptno
from emp
where deptno = 20;
minus
select empno, ename, job, deptno
from emp
where job= '사원';

--테이블 생성(상품테이블)
create table product(
product_code varchar2(20) not null primary key;
product_name varchar2(50) not null,
price number default 0,
company varchar2(50),
make_date date default sysdate
);

insert into product values ('A1', '아이폰', 900000, '애플', '2012-09-01');
insert into product values ('A2', '갤럭시노트',1000000, '삼성', '2018-08-01');
insert into product values ('A1', '갤럭시S9', 1200000, '삼성', '2019-10-01');
select * from product;

--판매테이블
create table product_sales (
product_code varchar2(20) not null,
amount number default 0
);

insert into product_sales values ('A1',100);
insert into product_sales values ('A2',200);
insert into product_sales values ('A3',300);
select * from product_sales;
insert into product_sales values ('A4',300);

drop table product_sales;
--foreign key(외래키) : 다른테이블의 키값을 가져와서 현재테이블에 데이터 입력시 참조
create table product_sales {
product_code varchar2(20) not null references product(product_code),
amount number default 0
);

--상품코드, 상품이름, 제조사, 단가, 수량, 금액
select p.product_code 상품코드, product_name 상품이름, company 제조사, price 단가, amount 수량, price*amount 금액
from product p, product_sales s
where p.product_code = s.product_code --조인조건

create or replace view product_sales_v
as
select p.product_code 상품코드, product_name 상품이름, company 제조사, price 단가, amount 수량, price*amount 금액
from product p, product_sales s
where p.product_code = s.product_code;

--뷰를 테이블처럼 사용할 수 있음
select * from product_sales_v;

--제조사가 삼성인 제품을 출력
select * from product_sales_v
where 제조사 = '삼성';

--뷰를 삭제시
drop view product_sales_v;

commit;

create table dep(
id varchar2(10) primary key,
name varchar2(15) not null,
location varchar2(50)
);

alter table dep drop column od;

alter table dep add id varchar2(10) primary key;

DROP TABLE dep;

create table dep(
id varchar2(10) primary key,
name varchar2(15) not null,
location varchar2(50)
);

insert into dep values('10', '영업부', '서울 강남구');
savepoint a;
insert into dep values('20', '회계부', '부산 동래구');
savepoint b;
select * from dep;

--데이터 insert
insert into member (userid, passwd, name, email) values ('kim','1234','김철수','kim@naver.com');
insert into member (userid, passwd, name, email) values ('hong','1234','홍길동','hong@naver.com');

show parameter undo;
--undo_retention : delete, update 후에 commit을 했을때부터 지정된 시간(초)까지는 오라클에서 임시로 저장한 데이터로 복구할 수 있음
--default 속성값은 900으로 900/60=15분
--commit 후 15분 내에는 데이털르 복구할 수 있음
--시간을 늘릴 수도 있는데 예를 들어 25분으로 늘리려면
alter system set undo_retention = 1500;

--데이터 삭제, 커밋
select * from tab;
select * from member;
delete from member where userid = 'kim';
commit;

--삭제된 레코드 확인
select * from member as of
timestamp(systimestamp-interval '15'minute)
where userid='kim';

--삭제된 레코드 복구
insert into member select * from member as of
timestamp(systimestamp-interval '15'minute)
where userid='kim';

select * from memeber;
commit;

--그룹 쿼리
--1) group by 절
-- 1. 특정 칼럼값이나 표현식을 단위로 집계성 데이터를 보기 위해 집계함수와 함께 사용
-- 2. select절에 오는 컬럼 또는 값은 모두 group by절에 명시해야 함.(단, 집계함수는 제외)
-- 3. group by절은 하나 이상의 컬럼 또는 값을 가짐
-- 4. order by절은 group by절 다음에 위치 (주의: order by절에 오는 컬럼 또는 값은 group by절에 명시한 값 이외의 값은 사용할 수 없음)
-- 5. where절은 group by절 앞에 위치
    select count(*), sum(sal), round(avg(sal), 2) 
    from emp
    where deptno=30;
    --위 집계를 group by절을 사용하면 편하다
    select deptno, count(*), sum(sal), round(avg(sal), 2) 
    from emp
    group by deptno;
    
    
    --ename문자열이기 때문에 group by에 넣으면?
    select deptno, ename, count(*), sum(sal), round(avg(sal), 2) 
    from emp
    group by deptno;
    
    --수정
    select deptno, ename, count(*), sum(sal), round(avg(sal), 2) 
    from emp
    group by deptno, ename; --ename은 문자타입이어서 반드시 group by절에 표시해야 에러가 안난다
    
    --학과별로 교수들의 평균 급여를 출력
    select deptno, avg(pay)
    from professor
    group by deptno;
    
    --학과별, 직급별로 교수들의 평균 급여 출력
    select deptno, avg(pay)
    from professor
    group by deptno, position;
    order by deptno;
    
    --having절
    -- 1. where 조건 이외에 집계함수의 결과로 조건을 주고자 할때사용, group by절과 함께 사용
    -- 2. 일반적으로 집계함수나 상수가 사용된 조건을 명시하거나 group by절에 명시된 컬럼도 조건으로 사용 가능
    -- 3.where절과 having절은 동시에 사용 가능
    
    --교수의 평균급여가 250이상(집계함수사용결과)이고 학과번호가 200번 이상의 학과의 학과번호, 학과이름,평균급여 출력
    select p.deptno, d.dname, avg(pay)
    from professor p, department d
    where p.deptno = d.deptno
    group by d.dname, p.deptno
    having avg(pay) >= 250 and p.deptno >=200;
    
    --sql실행순서
    --from(전체레코드) => where(행 선택) => group by(선택된 행을 요약)
    -- => having (요약 결과행 선택) => select(컬럼선택) => order by(정렬)
    
    --keep함수
    --오라클에서 keep()함수를 사용하면 group by내에서 최고, 최고순위행 집계, 그룹별로 max 또는 min 수치값은 쉽게 표시할 수 있지만
    -- max에 해당되는 행의 값 중에서 특정 텍스트 값을 같이 표시하기 위해서는 서브쿼리를 주로 사용한다
    -- 그러나 keep 사용하면 한번의 쿼리문으로 최저 or 최고에 해당하는 행의 값들을 쉽게 가져올 수 있음
    --keep 함수는 group by절 over절과 함께 사용해야 한다
    --ex ) 1등, 2등 두명
    --dense_rank : 동일한 순위 이후의 등수를 이후의 순위로 계산 ex) 1등, 2등, 2등, 3등
    --rank : 동일한 순위 이후 등수를 동일한 인원수 만큼 건너뛰고 순위계산 ex) 1등,2등 2등, 4등
    
    
    --예) 직책이 '사원'인 사람중 최저급여를 받는 사람과 최고급여를 받는 사람을 출력
    select job, min(sal+nvl(comm,0)) as 최저급여, 
    min(ename) keep(dense_rank first order by sal) as 최저급여자,
    max(sal + nvl(comm,0)) as 최고급여,
    max(ename) keep(dense_rank last oder by sal) as 최고급여자 
    from emp
    where job in('사원')
    group by job;

select * from emp;
select * from dept;

--문제1] 오라클
select d.deptno, d.dname, e.ename, e.sal
from emp e, dept d
where d.deptno = e.deptno;

--문제1] ANSI
select d.deptno, d.dname, e.ename, e.sal
from emp e full outer join dept d
on d.deptno = e.deptno;

--문제2] oracle
select e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where d.deptno = e.deptno
intersect
select  e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where job in('사원');

--문제2] ANSI
select e.ename, e.job, d.deptno, d.dname
from emp e full outer join dept d
where d.deptno = e.deptno;
intersect
select e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where job in('사원');

--문제3] oracle
select e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where d.deptno = e.deptno
intersect
select  e.ename, e.job, d.deptno, d.dname
from emp e, dept d
where ename in('황인태');

--문제4] 오라클
select e.ename, d.deptno, d.dname, e.sal, e.sal*12+nvl(comm,0)
from emp e, dept d
where d.deptno = e.deptno;

--문제4] ANSI
select e.ename, d.deptno, d.dname, e.sal, e.sal*12+nvl(comm,0)
from emp e, dept d
where d.deptno = e.deptno;

--문제5]
select *
select empno, mgr
from emp
where 

--문제6]


  --01-20
  --1) 메인쿼리와 연관성이 없는 쿼리
  -- emp테이블에서 급여를 가장 많이 받는 사원정보를 조회
  select max(sal) from emp;
  
  select deptno, ename, sal from emp
  where sal=800;
  
  --위 두단계로 구해야할 질의를 서브쿼리로 해결, 서브쿼리는 ()로 묶어야 하며 ()먼저 연산됨
  select deptno, ename, sal from emp 
  where sal = (select max(sal) from emp);
  
  -- 사원들의 평균 급여보다 많은 급여를 받는 사원의 모든 정보를 조회
  select avg(sal) from emp;
  
  select * from emp
  where sal>383.46;
  
  -- 서브쿼리
  select * from emp
  where sal>(select avg(sal) from emp);
  
  -- 사원들의 평균 급여보다 많은 급여를 받는 사원의 이름, 부서명, 급여를 조회
  select e.ename, d.dname, e.sal
  from emp e, dept d
  where e.deptno = d.deptno and e.sal > (select avg(sal) from emp);
  
  -- 부서코드 30에 속한 사원 중 최고급여보다 높은 급여를 받는 사원을 조회
  --1단계) 30번 부서에서 최고 급여 금액확인
  select max(sal) from emp where deptno=30;
  
  --2단계) 485만원 보다 많은 직원 조회
  select * from emp where sal>485;
  
  --3단계) 서브쿼리
   select * from emp
   where sal>(select sal from emp where deptno=30);
  
  select sal from emp where deptno=30; -- 데이터가 복수행으로 나옴.
  
  --단일행으로 리턴받는 max함수를 안쓰면 오류가 날 수 있음.
  select * from emp
   where sal> all(select sal from emp where deptno=30); --단 all연산자를 앞에쓰면 오류없이 처리 가능함.
   
  -- 메인쿼리와 연관성이 있는 쿼리 : 조인을 사용, 별칭
  -- 사원이름, 부서코드, 부서명 조회
  select e.ename, e.deptno, d.dname
  from emp e, dept d
  where e.deptno = d.deptno;
  
  select e.ename, e.deptno, (select  d.dname  from dept d  where e.deptno = d.deptno)  as dname --컬럼역할하는 서브쿼리
  from emp e;
  
  --실제로는 아래처럼 각각의 부서번호가 반복적으로 진행됨(내부적으로 반복문이 돌고 있음)
  select e.ename, e.deptno, (select  dname  from dept d  where deptno=30)  as dname --컬럼역할하는 서브쿼리
  from emp e;
  
  -- 부서 평균급여보다 급여가 적은 사원들을 조회
  --1단계) 
  select ename, sal, deptno from emp;
  --2단계)
  select avg(sal) from emp where deptno=30;
  --3단계)
  select ename, sal, deptno, (select avg(sal) from emp where deptno=20) 
  from emp e;
  --4단계) deptno=10 대신 e.deptno로 처리
   select ename, sal, deptno, (select avg(sal) from emp where deptno=e.deptno) 
  from emp e
  order by deptno;
  --5단계) 부서평균급여보다 적은 사원들만 조회
  select ename, sal, deptno, (select avg(sal) from emp where deptno=e.deptno) 부서평균급여
  from emp e
  where sal < (select avg(sal) from emp where deptno=e.deptno)
  order by deptno;
  
  -- 서브쿼리가 위치하는 곳에 따라 분류
  --1) 일반서브쿼리 : select절에 위치 (컬럼역할)
  select ename, (select dname from dept d where d.deptno=e.deptno) as dname
  from emp e
  where job='부장';
  --2) 인라인뷰 :  from절에 위치 (테이블같은 역할)
  -- 사원들의 평균 급여보다는 높고 최대 급여보다는 낮은 급여를 받는 사원들을 조회
  select e.empno, e.ename, e.sal
  from emp e, (select avg(sal) avgs, max(sal) maxs from emp) e2 --인라인 뷰(View)
  where e.sal > e2.avgs and e.sal < e2.maxs
  order by e.sal desc;
  
  -- 직책(job)이 '사원'인 사람들이 어떤 부서에 근무하는지를 조회(사원이름, 직책, 부서이름 조회)
  --1) 조인방식
  select ename, job, dname
  from emp e, dept d
  where e.deptno=d.deptno and job='사원';
  
  --2) from절 서브쿼리방식
  select ename, job, dname
  from (select ename, job, deptno from emp where job='사원') e, dept d
  where e.deptno=d.deptno;
  
  -- 중첩쿼리 :  where절에 위치
  -- 사원들의 평균 급여보다는 높고 최대 급여보다는 낮은 급여를 받는 사원들을 조회
  select e.empno, e.ename, e.sal
  from emp e
  where e.sal > (select avg(sal) avgs from emp) and e.sal < (select max(sal) maxs from emp)
  order by e.sal desc;
  
  --테이블 생성 : create table 테이블명 ();
  create table t_emp(
  id number(5) not null,
  name varchar2(25),
  salary number(7,2),
  phone varchar2(15),
  dept_name varchar2(25)
  );
  
  select * from tab;
  
  --테이블명 수정 : rename A to B
  rename t_emp to s_emp;
  
  --테이블에 데이터 입력 : insert into 테이블명 (컬럼,..) values(값,..)
  insert into s_emp values (100, '이상헌', 2000, '010-222-3333', '개발부');
  insert into s_emp values (101, '최순철', 3000, '010-333-4444', '총무부');
  insert into s_emp values (102, '장혜숙', 4000, '010-444-5555', '영업부');
  insert into s_emp (id, name) values (300, '김철수');
  
  select * from s_emp;
  
  -- 테이블에 컬럼 추가 : alter table 테이블명 add(컬럼 데이터타입)
  alter table s_emp add(hire_date date);
  
  --컬럼 수정 : alter table 테이블명 modify (컬럼 데이터타입)
  alter table s_emp modify (phone varchar2(20));
  --작은값에서 큰값으로의 변경은 괜찮지만 반대는 문제가 생김
  
  
  --컬럼 이름 수정 : alter table 테이블명 rename column 컬럼1 to 컬럼2
  alter table s_emp rename column id to t_id;
  
  --컬럼 삭제 : alter table 테이블명 drop column 컬럼명
  alter table s_emp drop column dept_name;
  
  select * from s_emp;
  --alter는 트랜잭션의 대상이 아니기 때문에 복구할 수도 없다.
  
  -- DML문 : insert, update, delete
  --1) 데이터수정 : update 테이블명 set 컬럼=수정할값 where 조건
  update s_emp set hire_date=sysdate where t_id=100;
  
  --입사일자가 입력되지 않은 null 레코드 수정
  update s_emp set hire_date=sysdate 
  where hire_date is null;
  
  insert into s_emp(t_id, hire_date) values(400, sysdate);
   select * from s_emp;
   
   -- 데이터 삭제 : delete from 테이블명 where 조건
   delete from s_emp where t_id=400;
   
   -- s_emp 테이블에서
   -- e-mail을 관리하기 위해 mailid컬럼을 10byte로 추가
   alter table s_emp add (mailid varchar2(10));
   
   -- mailid 컬럼을 20byte로 수정
   alter table s_emp modify (mailid varchar2(20));
   
   -- mailid 컬럼명을 e_mail로 수정
   alter table s_emp rename column mailid to e_mail;
   
   -- s_emp 테이블명을 t_emp로 변경
   rename s_emp to t_emp;
   
   select * from t_emp;
   
   --제약조건(constraint)
   --제약조건을 반영한 테이블 생성
   create table c_emp(
   id number(5) constraint c_emp_id_pk primary key,
   name varchar2(25) constraint c_emp_name_nn not null,
   salary number(7,2),
   phone varchar2(15) constraint c_emp_phone_ck check(phone like '3429-%'),
   dept_id number(7) constraint c_emp_dept_id_fk references dept(deptno)
   );
   
   --제약조건의 이름 검색
   select constraint_name from user_constraints;
   
   select * from user_constraints where table_name='C_EMP'; --대문자로 테이블명을 처리
   
   --제약조건은 수정은 안됨, 삭제만 가능
   alter table c_emp drop constraint c_emp_name_nn;
   
   --제약조건 추가
   alter table c_emp add constraint c_emp_name_un unique(name);
   -- (주의 :  not null 제약조건은 add가 아닌 modify를 써야함)
   alter table c_emp modify (name varchar2(25) constraint c_emp_name_nn not null);
   
   
   --제약조건 활성화(enable)/ 비활성화(disable)
   alter table c_emp disable constraint c_emp_name_nn;
   alter table c_emp enable constraint c_emp_name_nn;
   --비활성화했던것을 다시 활성화시킬 때 기존에 입력된 중복자료를 삭제해야 함.
   
   -- 제약조건의 삭제
   alter table c_emp drop constraint c_emp_name_nn;
   
   --제약조건을 테이블에 나중에 추가하는 방법
   drop table c_emp;
   
   create table c_emp (
   id number(5),
   name varchar2(25),
   salary number(7,2),
   phone varchar2(15),
   deptno number(7)
   );
   
   insert into c_emp (id,name) values (1, '김철수');
   insert into c_emp (id,name) values (1, '김기철');
   insert into c_emp (id,name) values (1, '김철수');
   
   select * from c_emp;
   delete from c_emp;
   
   -- primary key 추가
   --  alter table 테이블명 add constraint 제약조건이름 제약조건종류(컬럼);
   alter table c_emp add constraint c_emp_id_pk primary key(id);
   
   select * from user_constraints where table_name='C_EMP';
   insert into c_emp (id,name) values (1, '김철수');
   insert into c_emp (id,name) values (2, '김기철');
   
   -- foreign key 추가
   alter table c_emp add constraint c_emp_deptno_fk foreign key(deptno) references dept(deptno);
   
   insert into c_emp (id,name,deptno) values (9999, '강감찬', 40); -- dept테이블에는 40번 까지만 있는데 50번이 들어오면 에러
   
   delete from dept where deptno=40;
   
   alter table c_emp drop constraint c_emp_deptno_fk;
   
   alter table c_emp add constraint c_emp_deptno_fk foreign key(deptno) references dept(deptno) on delete cascade;
   
   select * from dept;
   select * from c_emp;
   
   insert into dept values (40, '전산팀', '인천');
   
   commit;
   
   --check(조건) 추가
   alter table c_emp add constraint c_emp_salary_ck check(salary between 100 and 1000);
   
   insert into c_emp (id,name,salary) values (3, 'kim', 500);
   insert into c_emp (id,name,salary) values (4, 'park', 1500);

select * from professor; 
--문제1] 
select name, hiredate, dname
from professor p, department d
where hiredate > (select hiredate from professor where name = '송도권')
and p.deptno = d.deptno;

​
--문제2]
select name, pay, hiredate
from professor
where hiredate = (select hiredate from professor where name = '심슨') and pay < (select pay from professor where name = '조인형');

​
--문제3]
select grade, name, height
from student s
where height = (select max(height) from student where grade = s.grade)
order by grade;

--unique 제약조건
--비교 : primary : unique + not null
alter table c_emp add constraint  c_emp_name_un unique(name);
select * from c_emp;
insert into c_emp(id, name) values (4);
