package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*le asignamos a esta clase @RestController
* Con esto conseguimos una comunicación entre nuestra aplicación y algún servicio externo (API RESTFUL)
* Peticiones HTTP a través del puerto asignado
* también nos permite trabajar con formato JSON y convertirlo a lenguaje java directamente y al revés
* */
@RestController
public class HelloWorldController {


    //@GetMapping per establir una ruta executable desde fora del programa
    //asignem un parametre al metode que será especificat desde fora del programa
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "name") String name) {

        String retorna;

        if (name.isEmpty()) {

            retorna = "Unknown";

        } else {

            retorna = "Hola " + name + " Estàs exectutant desde maven";
        }

        return retorna;
    }

    //Asignamos una variable en la URL que indicaremos desde el exterior
    @GetMapping("/HelloWorld2/{name}")
    public String saluda2(@PathVariable String name) {

        return "Hola " + name + " estàs executant desde Maven";

    }

}
