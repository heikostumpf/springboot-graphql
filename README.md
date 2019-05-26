# GraphQL Tester
This application provides an example how to implement a GraphQL endpoint using Java, SpringBoot and MySQL.

### Installing

Before running the application it is necessary to start the MySQL database provided as docker container.
The MySQL instance comes with a pre-configured environment (table, schema,...) and is ready to use once 
the container is up and running.
```
docker-compose up
```

Use the spring-boot specific maven plugin the compile and run the application.

```
$ mvn spring-boot:run
```

## Testing
Once the application is compiled and running call the endpoint with the following URL:

```
http://localhost:8080/graphiql
```

Use the graphical interface and query the endpoint for all available pets including the name, age and type attribute.
```
{
    pets {
        name
        age
        type
    }
}
```

```
{
    petsById(id: 1) {
        id
        name
        age
        type
    }
}
```

## Source
* [graphql.org](https://graphql.org)
* [dev.to](https://dev.to/sambenskin/howto-integrate-a-mysql-database-into-your-java-spring-boot-graphql-service-26c) - HowTo: Integrate a MySQL Database into your Java Spring Boot GraphQL Service by Sam Benskin
* [pluralsight.com](https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot) Building a GraphQL Server with Spring Boot by Esteban Herrera