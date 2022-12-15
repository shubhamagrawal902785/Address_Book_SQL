show databases;

create database addressbook;

show databases;

select database();

// Create table

mysql> create table addressbook(id int unsigned not null auto_increment,  first_name varchar(10), last_name varchar(10), address  varchar(100), city     varchar(20), state    varchar(20),  zip      int ,phone_number     int,email    varchar(30), primary key (id));
Query OK, 0 rows affected (4.55 sec)

desc addressbook;

