/**
 * importacion de librerias necesarias.
 * se importo el driver ojbdc para establecer la conexion con oracle y traer los datos de la tabla. 
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jorge Armando Londoño Ocampo
 */


/**
 *  esta clase fue creada por defecto al conectarse con la base de datos, 
 *  al utilizar la clase (Entity Class For DataBase.java)
 *  la cual extrajo todos los datos de la base de datos de la tabla Usuarios.
 */
@Entity
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByDirecion", query = "SELECT u FROM Usuarios u WHERE u.direcion = :direcion")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DIRECION")
    private String direcion;

    /**
     * Metodo publico que no de retorna ningun dato,
     * inicializa el constructor con los datos de la clase.
     */
    public Usuarios() {
    }

    /**
     *
     * @param nombre
     
     * 
     */
    public Usuarios(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param nombre
     * @param direcion
     */
    public Usuarios(String nombre, String direcion) {
        this.nombre = nombre;
        this.direcion = direcion;
    }

    /**
     *
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return D
     */
    public String getDirecion() {
        return direcion;
    }

    /**
     *
     * @param direcion
     */
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "modelo.Usuarios[ nombre=" + nombre + " ]";
    }
    
}
