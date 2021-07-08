# MySqlDemo

This project works with a Docker container running a MySQL instance.

To setup the Docker container running MySQL instance, follow the blog [post](https://medium.com/@jayantporwal05/spring-boot-on-host-with-mysql-running-on-a-docker-container-19905c685ae4).

## SQL to use for creating tables in databases (db0 and db1)

Both tables need to be created in each of the databases.

- Database db0 is on docker container mysql0
- Database db1 is on docker container mysql1

```roomsql
create table user_0 ( 
    id bigint(10) not null auto_increment, 
    name varchar(50), 
    email varchar(100), 
    primary key (id) 
);
```
```roomsql
create table user_1 ( 
    id bigint(10) not null auto_increment, 
    name varchar(50), 
    email varchar(100), 
    primary key (id) 
);
```

## CURL commands for REST endpoints

For inserting data: 

```curl localhost:8080/demo/add -d name=Jayant -d email=jayantporwal05@gmail.com```

```curl localhost:8080/demo/add -d name=Payal -d email=payalporwal23@gmail.com```

```curl localhost:8080/demo/add -d name=Pinak -d email=pinakporwal12@gmail.com```

```curl localhost:8080/demo/add -d name=Ravindra -d email=ravindraporwal12@gmail.com```

```curl localhost:8080/demo/add -d name=Kiran -d email=kiranporwal17@gmail.com```

For querying data:

```curl localhost:8080/demo/all```
