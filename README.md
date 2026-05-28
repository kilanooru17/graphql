# GraphQL Sample Repository

A Spring Boot GraphQL application demonstrating a simple book management system with queries and mutations.

## Overview

This project showcases how to build a GraphQL API using Spring GraphQL. It provides a backend service for managing books with operations to retrieve all books, search by ID, and add new books.

## Technology Stack

- **Java 17+**
- **Spring Boot** - Web framework
- **Spring GraphQL** - GraphQL integration
- **Maven** - Build tool

## Project Structure

## Key Components

### Core Classes

- **GraphqlApplication.java** - Main Spring Boot application class
- **Book.java** - Book entity/model class representing the book data structure
- **BookService.java** - Service layer containing business logic for book operations
- **BookController.java** - GraphQL controller handling GraphQL queries and mutations

## Technologies Used

- **Spring Boot** 3.5.14
- **Java** 17
- **Spring GraphQL** - GraphQL starter
- **Spring Web** - Web framework
- **Lombok** - Annotation processing for reducing boilerplate code
- **Maven** - Build tool

## Dependencies

```xml
- spring-boot-starter-graphql
- spring-boot-starter-web
- spring-boot-starter-test (test)
- spring-graphql-test (test)
- lombok (provided)
