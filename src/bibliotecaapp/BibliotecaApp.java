/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaapp;

/**
 *
 * @author ALY
 */

import Libro.LibroController;
import Libro.LibroDAO;
import Libro.LibroView;
import java.sql.Connection;

public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            // Obtener la conexión
            conexion = DatabaseConnection.getConnection();

            // Crear instancias del modelo, vista y controlador
            LibroDAO modeloLibro = new LibroDAO(conexion);
            LibroView vistaLibro = new LibroView();
            //LibroView vistaLibro = new LibroView();
            LibroController controladorLibro = new LibroController(modeloLibro);

            // Mostrar la vista de libros
            vistaLibro.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        //finally {
            // Cerrar la conexión
          // DatabaseConnection.closeConnection();
        //}
    }
    
}
