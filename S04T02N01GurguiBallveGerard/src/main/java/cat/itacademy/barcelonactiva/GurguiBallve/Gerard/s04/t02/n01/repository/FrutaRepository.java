package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.repository;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.model.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Interfaz que hereda del repositorio JPA DATA (dependencia) que contiene las operaciones CRUD
* creando la herencia adaptandolo a nuestro proyecto, podremos acceder a todos los metodos necesarios
* para una BDD
* */

@Repository
public interface FrutaRepository extends JpaRepository<Fruta,Integer> {
}
