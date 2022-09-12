package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.service;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitIdException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.model.Fruta;

import java.util.List;
import java.util.Optional;

public interface IfrutaService {

    public Fruta saveFruit(Fruta frutaNew) throws FruitIdException;

    public List<Fruta> findAllFruits();

    // Optional nos permite trabajar con nulos
    public Optional<Fruta> findFruitById(Integer id) throws FruitNotFoundException ;

    public Fruta updateFruit (Fruta frutaUpdate) throws FruitNotFoundException, FruitIdException;

    public void deleteFruit(Integer id) throws FruitNotFoundException;





}
