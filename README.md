
---

# Web API de Libro con control de excepciones y mejor descripción de API - DEBER CESAR NAVAS

Haciendo las modificaciones que se piden en la tarea, creamos un nuevo folder llamado ```exception``` en donde agregamos una clase llamada ```LibroException```.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/04a9a680-ab23-4459-b9d0-bb1f1a22a7e6)

- En esta clase, ```LibroException``` se define como una excepción personalizada que extiende ```RuntimeException```. Al extender RuntimeException, ```LibroException``` se convierte en una excepción no verificada (unchecked exception), lo que significa que no es obligatorio que sea declarada o capturada explícitamente en el código.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/ea8b1066-abd4-441d-a27a-6a60b247e3e0)

Luego, debemos modificar la clase ```LibroController``` para modificar el API de forma que creamos una línea de código que define un método que maneja excepciones de tipo ```LibroException``` en un controlador de Spring. Usando la anotación @ExceptionHandler(LibroException.class), el método handleLibroException intercepta cualquier LibroException lanzada dentro del controlador.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/251f1a10-a33b-46ab-8f52-c1d34f22f67a)

Y a su vez, modificar el @GetMapping específicamente el método que obtiene el Id, en nuestro caso ```obtenerLibroPorId```.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/54b2c484-e19e-4f88-a5ba-63f4d26f83fc)

## EJECUCIÓN DEL CÓDIGO - PRUEBA EN NAVEGADOR - PRUEBA EN POSTMAN

Ahora, en el navegador al momento de buscar un libro que no sea existente, el API lo ejecuta y muestra en pantalla el mensaje "No se encontró el libro" (mensaje personalizado).

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/eaaca8dc-1e83-4d7f-81c3-0dddede9227a)

Pero para ver que todos los libros están creados y ver cuáles faltan, pondríamos nuestro URL ```http://localhost:8080/libros```.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/619b51ff-317a-47fb-84d8-82a7fd48f130)

Y ahora, en la APLICACIÓN POSTMAN, primero buscamos cuáles libros hay en nuestra API.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/d8ab93c3-8d0d-440b-8660-9a5012f87769)

Y con la URL ```http://localhost:8080/libros/``` y poniendo después del "/", un número que no exista en nuestros libros.

![imagen](https://github.com/cesar-navasug/Web-API-de-Libro/assets/147842405/26d40056-6459-42d3-88a5-e31cc6af0cdd)

## MUCHAS GRACIAS

---
