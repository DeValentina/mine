
--테이블 생성(상품테이블)
create table product (
product_code varchar2(20) not null primary key,
product_name varchar2(50) not null,
price number default 0,
company varchar2(50),
make_date date default sysdate
);

insert into product values ('A1', '아이폰', 900000, '애플', '2012-09-01');
insert into product values ('A2', '갤럭시노트', 1000000, '삼성', '2018-08-01');
insert into product values ('A3', '갤럭시S9', 1200000, '삼성', '2019-10-01');
select * from product;

--판매테이블
create table product_sales (
product_code varchar2(20) not null,
amount number default 0
);

insert into product_sales values ('A1', 100);
insert into product_sales values ('A2', 200);
insert into product_sales values ('A3', 300);
select * from product_sales;
insert into product_sales values ('A4', 300);

drop table product_sales;

--foreign key(외래키) : 다른테이블의 키값을 가져와서 현재테이블에 데이터 입력시 참조
create table product_sales (
product_code varchar2(20) not null references product(product_code),
amount number default 0
);

--상품코드, 상품이름, 제조사, 단가, 수량, 금액
select p.product_code 상품코드, product_name 상품이름, company 제조사, price 단가, amount 수량, price*amount 금액
from product p, product_sales s
where p.product_code = s.product_code; --조인조건

create or replace view product_sales_v
as
select p.product_code 상품코드, product_name 상품이름, company 제조사, price 단가, amount 수량, price*amount 금액
from product p, product_sales s
where p.product_code = s.product_code;

--뷰를 테이블처럼 사용할 수 있음
select * from product_sales_v;

--제조사가 삼성인 제품을 출력
select * from product_sales_v
where 제조사='삼성';

--뷰를 삭제시
drop view product_sales_v;

commit;

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
insert into dep values('30', '개발부', '인천 계양구');
rollback to a; --a지점까지
commit;

--실수로 커밋한 자료를 복구하는 방법
--toad는 안됨, sql developer는 됨