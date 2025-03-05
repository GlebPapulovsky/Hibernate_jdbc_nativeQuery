--create schema myschema;
--create table myschema.Persons(
--"name" varchar(50),
--surname varchar(50),
--age int,
--phone_number varchar(50),
--city_of_living varchar(50),
--PRIMARY KEY (name, surname, age)
--);
--
create table myschema.persons(
age int,
name varchar(50),
surname varchar(50),
city_of_living varchar(50),
phone_number varchar(50),
primary key (name, surname, age)
)
insert into myschema.persons (age, name, surname, city_of_living, phone_number) values
(25, 'Иван', 'Иванов', 'Moscow', '1234567890'),
(30, 'Петр', 'Петров', 'Санкт-Петербург', '9876543210'),
(22, 'Анна', 'Сидорова', 'Казань', '5555555555'),
(28, 'Ольга', 'Федорова', 'Екатеринбург', '1111111111'),
(35, 'Алексей', 'Кузнецов', 'Новосибирск', '9999999999'),);