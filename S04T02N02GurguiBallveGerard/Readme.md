
# S4.02 - Api Rest Spring Boot y MySql



Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:

int id
String nombre
Int cantidadQuilos
Aprovechando la especificación JPA, deberás persistir esta entidad en una base de datos H2, siguiendo el patrón MVC. Para ello, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.controllers
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.model.domain
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.model.services
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.model.repository
La clase ubicada en el paquete controllers (FruitaController, por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:

http://localhost:8080/fruta/add

http://localhost:8080/fruta/update

http://localhost:8080/fruta/delete/{id}

http://localhost:8080/fruta/getOne/{id}

http://localhost:8080/fruta/getAll

 

  Importante

Tendrás que tener en cuenta las buenas prácticas de diseño de las API, utilizando correctamente los códigos de error y las respuestas en caso de invocaciones incorrectas. (Puedes consultar información sobre ResponseEntity).

  Muy Importante

Además del enlace a Git de la tarea resuelta, deberás incluir al menos dos enlaces diferentes de los recursos que te hemos proporcionado en el campus, que te hayan servido o pudieran hacerlo, para resolver la totalidad de la tarea o algunas partes.
