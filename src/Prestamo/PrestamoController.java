/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prestamo;


import Libro.Libro;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALY
 */
public class PrestamoController {
     private PrestamoDAO modelo;
    private PrestamoView view;
    
     public PrestamoController(PrestamoView vista, PrestamoDAO modelo) {
        this.view = vista;
        this.modelo = modelo;
        // Inicializar y añadir oyentes a los botones
    }
     
     public PrestamoController(PrestamoDAO prestamoDAO) {
        this.modelo = prestamoDAO;
    }
    
    public List<Prestamo> obtenerTodosLosPrestamos() {
        return modelo.obtener();
    }

    public boolean eliminar(int id) {
        return modelo.eliminar(id);
    }
    
    public void crear(int libro_id, int usuario_id, java.sql.Date fecha_prestamo, java.sql.Date fecha_devolucion) {
        Prestamo prestamo = new Prestamo(0, libro_id, usuario_id, fecha_prestamo, fecha_devolucion);
        modelo.agregar(prestamo);
    }
    
     public List<Prestamo> listar() {
        return modelo.obtener();
    }
     
    public void Actualizar(int id,int libro_id, int usuario_id, Date fecha_prestamo, Date fecha_devolucion) {
      Prestamo prestamo = new Prestamo(id, libro_id, usuario_id, fecha_prestamo, fecha_devolucion);
      modelo.actualizar(prestamo);
  }

   public List<String> obtenerTodosLosLibros() {
        try {
            return modelo.obtenerLibros();
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Manejar errores adecuadamente en una aplicación real
        }
    }
   
    public List<String> obtenerUsuarios() {
        try {
            return modelo.obtenerUsuarios();
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Manejar errores adecuadamente en una aplicación real
        }
    }
   
    // Métodos para manejar eventos de los botones (crear, leer, actualizar, eliminar)
    
}
