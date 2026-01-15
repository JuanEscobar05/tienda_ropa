# Tienda de Ropa – Backend

## 1. Descripción general
Este proyecto corresponde al backend de la aplicación Tienda de Ropa, desarrollado con Java y Spring Boot. Su función principal es proporcionar servicios REST para la gestión de usuarios, actuando como intermediario entre el frontend y la base de datos.
El proyecto sigue una arquitectura en capas, separando controladores, servicios, repositorios y modelos, lo que facilita el mantenimiento, la escalabilidad y la comprensión del sistema.

## 2. Tecnologías utilizadas:
* Java
* Spring Boot
* Spring Web (REST)
* Spring Data JPA
* Maven
* Base de datos relacional
* H2 Database

## 3. Estructura del proyecto:
tienda_ropa/
├── .mvn/
│   └── wrapper
│       └── maven-wrapper.properties
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.tienda.tienda_ropa
│   │   │       ├── controladores
│   │   │       │   └── UsuarioControlador.java
│   │   │       ├── modelos
│   │   │       │   └── Usuario.java
│   │   │       ├── repositorios
│   │   │       │   └── IusuarioResositorio.java
│   │   │       ├── servicios
│   │   │       │   └── UsuarioServicio.java
│   │   │       └── TiendaRopaApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com.tienda.tienda_ropa
│               └── TiendaRopaApplicationTests.java
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

