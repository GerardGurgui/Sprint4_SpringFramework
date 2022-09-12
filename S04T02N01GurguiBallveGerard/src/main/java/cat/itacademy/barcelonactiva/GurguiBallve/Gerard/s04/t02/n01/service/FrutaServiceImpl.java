package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.service;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.exceptions.FruitIdException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.model.Fruta;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.repository.FrutaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Implementamos y definimos los metodos necesarios para nuestro proyecto
 * accediendo a los de JpaRepository a través de la interfaz creada e inyección de dependencias
 * */

@Service
public class FrutaServiceImpl implements IfrutaService {

    //Mensajes informativos por consola
    private final Logger log = LoggerFactory.getLogger(FrutaServiceImpl.class);

    //Inyectamos la interfaz que hemos heredado de JpaRepository con los metodos CRUD
    @Autowired
    FrutaRepository frutaRepository;


    //---> CREATE

    @Override
    public Fruta saveFruit(Fruta frutaNew) throws FruitIdException {

        //Comprobamos que recibimos un producto sin id, ya que sino, estaríamos actualizandolo
        if (frutaNew.getId() != null){
            throw new FruitIdException("El producto a añadir no puede tener valor de id");
        }

        log.warn("Producto añadido correctamente");

        frutaRepository.save(frutaNew);

        return frutaNew;

    }

    //--> READ

    @Override
    public List<Fruta> findAllFruits() {

        return frutaRepository.findAll();

    }


    @Override
    public Optional<Fruta> findFruitById(Integer id) throws FruitNotFoundException {

        //Optional para poder trabajar con nulos
        Optional<Fruta> frutaOptional = frutaRepository.findById(id);

        //Comprobamos si existe un produto con ese id
        if (frutaOptional.isPresent()){
            return frutaRepository.findById(id);
        } else {
            throw new FruitNotFoundException("No existe el producto");
        }

    }


    //--> UPDATE

    @Override
    public Fruta updateFruit(Fruta frutaUpdate) throws FruitNotFoundException, FruitIdException {

        if (frutaUpdate.getId() == null){
            throw new FruitIdException("El id del producto a actualizar no puede ser nulo");
        }

        if (!frutaRepository.existsById(frutaUpdate.getId())){
            throw new FruitNotFoundException("No existe el producto");
        }

        Optional<Fruta> frutaNew = findFruitById(frutaUpdate.getId());
        frutaNew.get().setNombre(frutaUpdate.getNombre());
        frutaNew.get().setCantidadQuilos(frutaUpdate.getCantidadQuilos());

        log.warn("Producto actualizado correctamente");

        return frutaRepository.save(frutaNew.get());

    }

    //--> DELETE

    @Override
    public void deleteFruit(Integer id) throws FruitNotFoundException {

        if (!frutaRepository.existsById(id)){
            throw new FruitNotFoundException("No existe el producto");
        }

        frutaRepository.deleteById(id);

        log.warn("Producto eliminado correctamente");

    }


}
