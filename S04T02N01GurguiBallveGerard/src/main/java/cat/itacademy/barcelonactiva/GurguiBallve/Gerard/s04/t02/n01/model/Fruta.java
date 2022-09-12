package cat.itacademy.barcelonactiva.GurguiBallve.Gerard.s04.t02.n01.model;

import javax.persistence.*;

//Indicamos que esta clase será una entidad en nuestra bdd
//de forma opcional, podemos añadirle otro nombre la tabla
@Entity
@Table(name = "Frutas")
public class Fruta {

    //Indicamos el atributo de llave primaria, con un autoincrement del id por cada objeto creado
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer cantidadQuilos;

    public Fruta() {
    }

    public Fruta(Integer id, String nombre, Integer cantidadQuilos) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadQuilos = cantidadQuilos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadQuilos() {
        return cantidadQuilos;
    }

    public void setCantidadQuilos(Integer cantidadQuilos) {
        this.cantidadQuilos = cantidadQuilos;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadQuilos=" + cantidadQuilos +
                '}';
    }
}
