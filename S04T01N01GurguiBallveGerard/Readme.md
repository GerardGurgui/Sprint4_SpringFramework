
# S4.01 - Introducción a Spring (Maven)

Este ejercicio es un primer contacto con Spring y Maven.

Accede a la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:

Importarlo en Eclipse con la opción File > Import > Existing Maven Project.

En el archivo application.properties, configura la variable server.port con el valor 9000.

Convertiremos esta aplicación en una API REST:
Dependiendo del package principal, crea otro subpackage llamado Controllers, y en su interior, añade la clase HelloWorldController.


Tendrá que tener dos métodos:
String saluda
String saluda2

Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:

"Hola, " + nombre + ". Estás ejecutando un proyecto Maven”.


El primer método responderá a una petición GET y deberá ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.

Deberá responder a:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nombre=Mi nombre

 

El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como PathVariable. El parámetro "nombre" será opcional.

Deberá responder a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/mi nombre

  Muy Importante

Además del enlace a Git de la tarea resuelta, deberás incluir al menos dos enlaces diferentes de los recursos que te hemos proporcionado en el campus, que te hayan servido o hubiesen podido hacerlo, para resolver la totalidad de la tarea o algunas partes.
