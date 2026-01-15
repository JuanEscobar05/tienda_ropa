# Tienda de Ropa – Backend

## Descripción general

Este proyecto corresponde al **backend de la aplicación tienda_ropa_front**, desarrollado con **Java y Spring Boot**. Su objetivo principal es proporcionar una **API REST** para la gestión de usuarios, funcionando como capa intermedia entre el frontend y la base de datos.

El sistema está construido siguiendo una **arquitectura en capas**, lo que permite una correcta separación de responsabilidades, facilitando el mantenimiento, la escalabilidad y la comprensión del código.

---

## Tecnologías utilizadas

* **Java**
* **Spring Boot**
* **Spring Web (REST)**
* **Spring Data JPA**
* **Maven**
* **Base de datos relacional** 
* **H2 DataBase**

---

## Estructura del proyecto

```
TIENDA_ROPA-MAIN/
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
```

---

## Arquitectura del sistema

El backend implementa una **arquitectura en capas**, compuesta por:

* **Controladores**: reciben y gestionan las solicitudes HTTP.
* **Servicios**: contienen la lógica de negocio.
* **Repositorios**: manejan la persistencia de datos.
* **Modelos**: representan las entidades del sistema.

Esta arquitectura permite una aplicación organizada, escalable y fácil de mantener.

---

## Descripción de carpetas y archivos

### 🔹 `TiendaRopaApplication.java`

Clase principal del proyecto. Contiene el método `main` que inicia la aplicación Spring Boot.

---

### 🔹 Paquete `controladores`

* **UsuarioControlador.java**
  Gestiona las peticiones HTTP relacionadas con los usuarios y expone los endpoints REST que serán consumidos por el frontend.

---

### 🔹 Paquete `modelos`

* **Usuario.java**
  Define la entidad Usuario y sus atributos, los cuales se mapean a la base de datos mediante JPA.

---

### 🔹 Paquete `repositorios`

* **IusuarioResositorio.java**
  Interfaz que extiende `JpaRepository`, permitiendo realizar operaciones CRUD sobre la entidad Usuario.

---

### 🔹 Paquete `servicios`

* **UsuarioServicio.java**
  Implementa la lógica de negocio relacionada con los usuarios y actúa como intermediario entre el controlador y el repositorio.

---

### 🔹 Carpeta `resources`

* **application.properties**
  Archivo de configuración donde se definen propiedades como:

  * Puerto del servidor
  * Configuración de la base de datos
  * Parámetros generales de Spring Boot

---

### 🔹 Carpeta `test`

* **TiendaRopaApplicationTests.java**
  Contiene pruebas básicas para validar el correcto funcionamiento de la aplicación.

---

## Funcionalidades principales

* Gestión de usuarios
* Exposición de servicios REST
* Persistencia de datos con JPA
* Comunicación con el frontend
* Código estructurado y mantenible

---

## Ejecución del proyecto

1. Clonar o descargar el repositorio
2. Abrir el proyecto en un IDE (IntelliJ IDEA, Eclipse o VS Code)
3. Ejecutar la clase `TiendaRopaApplication.java`
4. El backend se iniciará en el puerto configurado (por defecto **8080**)

---

## Relación con el Frontend

El frontend de la **Tienda de Ropa** consume los endpoints REST expuestos por este backend para la gestión de usuarios y la interacción con los datos del sistema.

---

## Posibles mejoras

* Implementación de autenticación con JWT
* Manejo de roles (administrador / cliente)
* CRUD de productos
* Carrito de compras
* Seguridad con Spring Security

---

## Autor

Juan Escobar


Dime y lo dejamos **nivel ingeniería profesional** 💼🔥
