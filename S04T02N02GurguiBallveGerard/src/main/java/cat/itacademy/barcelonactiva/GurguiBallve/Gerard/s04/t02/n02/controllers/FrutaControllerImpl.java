package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.controllers;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitIdException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.model.Fruta;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.service.IfrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*le asignamos a esta clase @RestController
* Con esto conseguimos una comunicación entre nuestra aplicación y algún servicio externo
* Peticiones HTTP a través del puerto asignado
* también nos permite trabajar con formato JSON y convertirlo a lenguaje java directamente y al revés
* 
* Importante que la capa controladora se limite a cumplir su función, controlar/gestionar peticiones y respuestas.
* */

@RestController
@RequestMapping("/api/frutas")
public class FrutaController{


    //Inyectamos el servicio correspondiente a este controlador
    @Autowired
    IfrutaService ifrutaService;

    //--> CREATE

    @Override
    @PostMapping("/add")
    public ResponseEntity<Fruta> addFruit(@RequestBody Fruta frutaNew) throws FruitIdException {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ifrutaService.saveFruit(frutaNew));
    }


    //--> READ

    @Override
    @GetMapping("/findAll")
    public List<Fruta> getFruits() {
        return ifrutaService.findAllFruits();
    }


    @Override
    @GetMapping("/findById/{id}")
    public ResponseEntity<Fruta> getFruitById(@PathVariable Integer id) throws FruitNotFoundException {

        return ResponseEntity.ok(ifrutaService.findFruitById(id).get());

    }

    //--> UPDATE

    @Override
    @PutMapping("/update")
    public ResponseEntity<Fruta> updateFruit(@RequestBody Fruta frutaNew) throws FruitNotFoundException, FruitIdException {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ifrutaService.updateFruit(frutaNew));

    }

    //--> DELETE

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Fruta> deleteFruit(@PathVariable Integer id) throws FruitNotFoundException {

        ifrutaService.deleteFruit(id);
        return ResponseEntity.noContent().build();

    }
}
