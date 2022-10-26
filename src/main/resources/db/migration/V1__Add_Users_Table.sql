create table user (
    id int primary key auto_increment not null,
    UserName varchar(255) not null,
    Email varchar(255) not null,
    Password varchar(255) not null,
    IsActive tinyint(1) not null
)