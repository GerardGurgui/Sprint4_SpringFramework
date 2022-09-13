package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//anotació @RestController ens permet treballar amb serveis de arquitectura RESTful web i format JSON
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

    //Asignem una variable a la url, al esciure la ruta li pasarem el nom que vulguem
    @GetMapping("/HelloWorld2/{name}")
    public String saluda2(@PathVariable String name) {

        return "Hola " + name + " estàs executant desde Maven";

    }

}
