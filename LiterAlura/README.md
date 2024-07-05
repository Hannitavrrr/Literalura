Proyecto de Gestión de Libros y Autores
Este proyecto utiliza Spring Boot y PostgreSQL para gestionar un catálogo de libros y autores, interactuando con la API Gutendex para obtener datos iniciales y almacenándolos en una base de datos.

Configuración del Proyecto
Requisitos:

Java 8 o superior
Maven
PostgreSQL
Configuración de la Base de Datos:

Crear una base de datos PostgreSQL llamada libros_autores.
Configurar el archivo application.properties con las credenciales de tu base de datos.
Configuración del Proyecto:

Clonar el repositorio desde GitHub: git clone <url_del_repositorio>
Importar el proyecto en tu IDE como un proyecto Maven.
Funcionalidades Implementadas
Consulta de Libros:

Búsqueda de libros por título utilizando la API Gutendex.
Almacenamiento de libros y autores en la base de datos PostgreSQL.
Estadísticas:

Exhibición de la cantidad de libros en determinados idiomas utilizando Java Streams y derived queries.
Autores:

Listado de autores de los libros buscados.
Listado de autores vivos en un año específico.
Ejecución del Proyecto
Ejecución desde el IDE:

Ejecutar la clase principal Application.java como una aplicación Spring Boot.
Ejecución desde la línea de comandos:

Compilar el proyecto con Maven: mvn clean install
Ejecutar el archivo JAR generado: java -jar target/nombre-del-archivo.jar
Uso de la Aplicación
La aplicación presenta un menú interactivo a través de la línea de comandos.
Permite al usuario realizar operaciones como búsqueda de libros, visualización de estadísticas y listado de autores vivos.
Contribución
Si deseas contribuir a este proyecto, por favor crea un fork y envía un pull request con tus mejoras.
Autor
Nombre: [Tu Nombre]
Contacto: [Correo Electrónico]
Este es solo un ejemplo básico de cómo podrías estructurar tu README.md. Asegúrate de personalizarlo con detalles específicos de tu proyecto, instrucciones precisas de configuración y uso, así como información de contacto y créditos adecuados.