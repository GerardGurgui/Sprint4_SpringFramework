package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t01.n02.S04T01N02GurguiBallveGerard.controllers;

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


    //@GetMapping para establecer una ruta desde fuera del programa, Get para obtener
    //@RequestParam indica una petición de parametro para el metodo 
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

    //Asignamos una variable de URL para poder indicarle un valor desde el exterior
    @GetMapping("/HelloWorld2/{name}")
    public String saluda2(@PathVariable String name) {

        return "Hola " + name + " estàs executant desde Maven";

    }

}
