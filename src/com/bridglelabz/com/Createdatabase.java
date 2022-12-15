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

// new data inserting in table

mysql> insert into addressbook (first_name,last_name,address,city,state,zip,phone_number,email)values 
('shubham','agrawal','mathura','farah','up',281122,902785,'shubham@gmail.com'),('gyanesh','agrawal','farah','mathura','up',2811222,856477,'gya@gmail.com'),
('yan','pan','cali','ami','us',546895,589745,'yan@gmail.com');
Query OK, 3 rows affected (0.29 sec)
Records: 3  Duplicates: 0  Warnings: 0


//select data from a database

mysql> select * from addressbook;
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
| id | first_name | last_name | address | city    | state | zip     | phone_number | email             |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
|  2 | shubham    | agrawal   | mathura | farah   | up    |  281122 |       902785 | shubham@gmail.com |
|  4 | gyanesh    | agrawal   | farah   | mathura | up    | 2811222 |       856477 | gya@gmail.com     |
|  5 | yan        | pan       | cali    | ami     | us    |  546895 |       589745 | yan@gmail.com     |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
3 rows in set (0.03 sec)

//edit person name

mysql> update addressbook set first_name='amit' where id =5;
Query OK, 1 row affected (0.12 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from addressbook;
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
| id | first_name | last_name | address | city    | state | zip     | phone_number | email             |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
|  2 | shubham    | agrawal   | mathura | farah   | up    |  281122 |       902785 | shubham@gmail.com |
|  4 | gyanesh    | agrawal   | farah   | mathura | up    | 2811222 |       856477 | gya@gmail.com     |
|  5 | amit       | pan       | cali    | ami     | us    |  546895 |       589745 | yan@gmail.com     |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
3 rows in set (0.01 sec)

//delet person name


mysql> delete from addressbook where id=5;
Query OK, 1 row affected (0.19 sec)

mysql> select * from addressbook;
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
| id | first_name | last_name | address | city    | state | zip     | phone_number | email             |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
|  2 | shubham    | agrawal   | mathura | farah   | up    |  281122 |       902785 | shubham@gmail.com |
|  4 | gyanesh    | agrawal   | farah   | mathura | up    | 2811222 |       856477 | gya@gmail.com     |
+----+------------+-----------+---------+---------+-------+---------+--------------+-------------------+
2 rows in set (0.00 sec)

//retrive table in a database city and state

mysql> select * from addressbook where state='up';
+----+------------+-----------+---------+-------+-------+--------+--------------+-------------------+
| id | first_name | last_name | address | city  | state | zip    | phone_number | email             |
+----+------------+-----------+---------+-------+-------+--------+--------------+-------------------+
|  2 | shubham    | agrawal   | mathura | farah | up    | 281122 |       902785 | shubham@gmail.com |
+----+------------+-----------+---------+-------+-------+--------+--------------+-------------------+
1 row in set (0.00 sec)

mysql> select * from addressbook where city='mathura';
+----+------------+-----------+---------+---------+--------------+---------+--------------+---------------+
| id | first_name | last_name | address | city    | state        | zip     | phone_number | email         |
+----+------------+-----------+---------+---------+--------------+---------+--------------+---------------+
|  4 | gyanesh    | agrawal   | farah   | mathura | uttarpradesh | 2811222 |       856477 | gya@gmail.com |
+----+------------+-----------+---------+---------+--------------+---------+--------------+---------------+
1 row in set (0.00 sec)

mysql>


//size understand

mysql> select * from addressbook;
+----+------------+-----------+---------+---------+--------------+---------+--------------+-------------------+
| id | first_name | last_name | address | city    | state        | zip     | phone_number | email             |
+----+------------+-----------+---------+---------+--------------+---------+--------------+-------------------+
|  2 | shubham    | agrawal   | mathura | farah   | up           |  281122 |       902785 | shubham@gmail.com |
|  4 | gyanesh    | agrawal   | farah   | mathura | uttarpradesh | 2811222 |       856477 | gya@gmail.com     |
|  6 | mohit      | goyal     | mauha   | harda   | raj          |  281789 |       944585 | mohit@gmail.com   |
|  8 | namen      | tayal     | majja   | bhun    | urisha       |  284559 |       978985 | name@gmail.com    |
+----+------------+-----------+---------+---------+--------------+---------+--------------+-------------------+
4 rows in set (0.00 sec)

mysql> select Count(*) from addressbook where city='farah' and state='up';
+----------+
| Count(*) |
+----------+
|        1 |
+----------+
1 row in set (0.00 sec)