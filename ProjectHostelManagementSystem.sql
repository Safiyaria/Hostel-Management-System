create database ProjectHostelManagementSystem

use ProjectHostelManagementSystem


create table Login_User
(
FullName VARCHAR(100) NOT NULL,
UserName VARCHAR(100) NOT NULL,
Email VARCHAR(30)UNIQUE CONSTRAINT dri_chk_email CHECK(Email LIKE '___%@__%.__%'),
PhoneNumber VARCHAR(11) UNIQUE CONSTRAINT dri_chk_number CHECK(DATALENGTH(PhoneNumber)=11),
Password VARCHAR(20),
ConfirmPass VARCHAR(20)
);

select * from Login_User

drop table Login_User


create table employee (
Name varchar(200),
EmployeeId varchar(100),
NID VARCHAR(13) UNIQUE CONSTRAINT dri_chk_nid CHECK(DATALENGTH(NID)=13),
Address varchar(100),
EmailId varchar(20) UNIQUE CONSTRAINT dri_chk_emailid CHECK(EmailId LIKE '___%@__%.__%'),
PhoneNumber varchar(11),
JoiningDate date default getDate(),
Salary int not null,
Post varchar(100),
Status varchar(20) default 'working',
LeavingDate date 
);

drop table employee

select * from employee

create table payment
(
EmpolyeeId varchar(10),
month varchar(50),
amount varchar(50)
);
select * from payment
drop table payment

create table rooms 
(
RoomNumber varchar(200) not null primary key,
activate varchar(200) not null,
RoomType varchar(200) not null,
RoomRent int not null,
RoomStatus varchar(200) not null
);
select* from rooms

drop table rooms


create table resident 
(
Name varchar(200) not null,
NID varchar(13) not null,
PHONE varchar(13) not null,
PermanentAddress varchar(100) not null,
EmailId varchar(20) UNIQUE CONSTRAINT dri_chk_emailidres CHECK(EmailId LIKE '___%@__%.__%'),
ResidentId varchar(11) not null primary key,
Occupation varchar(200) not null,
emergencyContact varchar(13) not null,
RoomNumber varchar(200) not null,
residentStatus varchar(20) not null,
EntryDate date default getDate(),
LeavingDate date 
);

select* from resident

drop table resident

create table fees
(
resID varchar(11) not null primary key,
month varchar(50),
amount varchar(50)
);

select* from fees

drop table fees






