show databases;

create database addressbook;

show databases;

select database();

// Create table

mysql> create table addressbook(id int unsigned not null auto_increment,  first_name varchar(10), last_name varchar(10), address  varchar(100), city     varchar(20), state    varchar(20),  zip      int ,phone_number     int,email    varchar(30), primary key (id));
Query OK, 0 rows affected (4.55 sec)

desc addressbook;

mysql> desc addressbook;
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| id           | int unsigned | NO   | PRI | NULL    | auto_increment |
| first_name   | varchar(10)  | YES  |     | NULL    |                |
| last_name    | varchar(10)  | YES  |     | NULL    |                |
| address      | varchar(100) | YES  |     | NULL    |                |
| city         | varchar(20)  | YES  |     | NULL    |                |
| state        | varchar(20)  | YES  |     | NULL    |                |
| zip          | int          | YES  |     | NULL    |                |
| phone_number | int          | YES  |     | NULL    |                |
| email        | varchar(30)  | YES  |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
