package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.controllers;

import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitIdException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n02.model.Fruta;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IfrutaController {

    public ResponseEntity<Fruta> addFruit(Fruta frutaNew) throws FruitIdException;

    public List<Fruta> getFruits();

    public ResponseEntity<Fruta> getFruitById(Integer id) throws FruitNotFoundException;

    public ResponseEntity<Fruta> updateFruit(Fruta frutaUpdate) throws FruitNotFoundException, FruitIdException;

    public  ResponseEntity<Fruta> deleteFruit(Integer id) throws FruitNotFoundException;



}
