create table owners(id int AUTO_INCREMENT PRIMARY KEY, name int not null);
create table dogs (id int NOT NULL, name varchar(50) NOT NULL, age int, owner_id int, FOREIGN KEY(owner_id) references (id));