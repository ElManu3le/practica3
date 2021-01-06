package Jardineria;

import java.util.Calendar;
<<<<<<< HEAD

import Jardineria.ModelClass.cliente;
import Jardineria.ModelClass.pedido;
import Jardineria.ModelClassDao.Dao;
=======
import java.util.Scanner;
import Jardineria.ModelClass.cliente.DocumentoIdentidad;
import Jardineria.ModelClassDao.clienteDao;
>>>>>>> 8af56308c513ad95a8f102dd4b87aad72c37ba4a
import Jardineria.ModelClassDao.pedidosDao;
import Jardineria.ModelClassDao.clienteDao;
import Jardineria.PatronBuilder.BuilderCliente;

public class App {

    public static void main(String[] args) {
<<<<<<< HEAD
        clientesDao = new clienteDao();
        pedidosDao = new pedidosDao();
=======
        clienteDao clienteDao = new clienteDao();
        Scanner teclado = new Scanner(System.in);
>>>>>>> 8af56308c513ad95a8f102dd4b87aad72c37ba4a

        try {//DNI no llega a 9 digios totales
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
        try {// ESta bien formado
            clienteDao.save(BuilderCliente.crearcliente(3, "Elmanuele", DocumentoIdentidad.DNI, "12345678A",
                    "msancho@lol.es", "nonono"));
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        try {
            clienteDao.save(BuilderCliente.crearcliente(4, "Juan", DocumentoIdentidad.DNI, "98765432R",
                    "juancorredor@lol.es", "nonono"));
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }



        pedidosDao pDao = new pedidosDao();
        



    }

    

}
