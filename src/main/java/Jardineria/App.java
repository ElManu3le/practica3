package Jardineria;

import Jardineria.ModelClass.cliente;
import Jardineria.ModelClass.cliente.DocumentoIdentidad;
import Jardineria.ModelClassDao.clienteDao;
import Jardineria.ModelClassDao.pedidosDao;
import Jardineria.PatronBuilder.BuilderCliente;

public class App {

    public static void main(String[] args) {

        clienteDao clienteDao = new clienteDao();
        //cliente clientitos = new cliente(1, nombre_cliente, domicilio, telefono, limite_credit, codigo_empleado_rep_ventas, tipoDocumento, dNI, email, password);

        try {// DNI no llega a 9 digios totales
            clienteDao.save(BuilderCliente.crearcliente(1, "Manuel", DocumentoIdentidad.DNI, "7316A",
                    "0311msanch@e-itaca.es", "nonono"));
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        }

        try {// DNI tienes una letra al final
            clienteDao.save(BuilderCliente.crearcliente(2, "Dario", DocumentoIdentidad.DNI, "731698766", "jeñe@lol.es",
                    "nonono"));
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {// Esta bien formado
            clienteDao.save(BuilderCliente.crearcliente(10, "mariconazo", DocumentoIdentidad.NIE, "12345678A",
                    "msancho620@yahoo.es", "gt2rsmanuel620"));
        } catch (Exception e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            clienteDao.save(BuilderCliente.crearcliente(4, "Juan", DocumentoIdentidad.DNI, "98765432R",
                    "juancorredor@lol.es", "nonono"));
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        pedidosDao pDao = new pedidosDao();
        //System.out.println(clientitos);
        
        

    }

}
