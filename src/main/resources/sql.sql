create database Student_System character set = UTF8MB4;
use Student_System;
create table student(
                        student_id varchar(40) primary key not null ,
                        name varchar(40) not null ,
                        batch varchar(40) not null ,
                        age int(4) not null ,
                        dob varchar(40) not null ,
                        blood_group varchar(4) not null ,
                        address varchar(60) not null ,
                        contact_number varchar(20) not null ,
                        email varchar(20)
);
create table login(
                      login_id varchar(40) primary key ,
                      password varchar(40) not null ,
                      foreign key login_id(login_id) references student(student_id)
);
create table record(
                       student_id varchar(40) not null ,
                       leave_time date not null,
                       reason varchar(80) not null ,
                       foreign key student_id(student_id) references student(student_id)
);
create table information(
                            student_id varchar(40) primary key not null ,
                            leave_taken int default 0,
                            leave_balance int not null
)
