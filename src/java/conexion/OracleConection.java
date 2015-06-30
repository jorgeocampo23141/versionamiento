// importar parametros de conexion con sql
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Esta clase define la conexion de la dase de datos oracle 11g como se define al crear un objeto
 * @author Jorge Armando londoño Ocampo
 * @version 20/06/2015/A
 */
public class OracleConection {

    // campos de la clase
    private Connection conexion;

    /** 
     * main para ejecutar la clase
     */
    public static void main(String[] args) {
        /**
         * obconection objeto creado de la claseOracle Conection para ejecutar la conecion
         */
       OracleConection obconeccion=new OracleConection();
       obconeccion.Conectar();
     }
    
    /**
     * metodo que devuelve el estado de la conecion
     * @return conexion con el servidor 
     */
    public Connection getConeexion (){
    return conexion;
    }
    
    /**
     *
     * @param conexion el parametro conexion define la conexion 
     */
    public void setConexion(Connection conexion){
    this.conexion = conexion;
    }
 
    /**
     * metodo de verificacion de datos para conectar la base de datos
     * @return mensaje de conexion exitosa o fallida segun los parametros que se asignen como "user","password","localhost"
     */
    public OracleConection Conectar()
    {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion= DriverManager.getConnection(BaseDeDatos,"BDDEMO","123");
        if(conexion!=null)
        {
        System.out.println("Conexion exitosa a esquema BDDEMO");
        }
        else{System.out.println("Conexion fallida");}
        }
        catch(Exception e)
        {e.printStackTrace();}
       
    return this;
    } 
    // cierre del metodo Conectar

}
// cierre de la clase OracleConection
