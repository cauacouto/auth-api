create table users(

    id TEXT not null unique primary key,
    login TEXT not null unique,
    password TEXT not null,
    role TEXT not null


);