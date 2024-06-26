/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import java.util.List;
/**
 *
 * @author ALY
 */
public class LibroController {
    private LibroDAO modeloLibro;
    private LibroView view;


    public LibroController(LibroDAO libroDAO) {
        this.modeloLibro = libroDAO;
    }
    
    public List<Libro> obtenerTodosLosLibros() {
        return modeloLibro.obtenerLibros();
    }

    public boolean eliminarLibro(int id) {
        return modeloLibro.eliminarLibro(id);
    }
    
    public void crearLibro(String titulo, String autor, String editorial, int anioPublicacion,String isbn) {
        Libro libro = new Libro(0, titulo, autor, editorial, anioPublicacion,isbn);
        modeloLibro.agregarLibro(libro);
    }
    
     public List<Libro> listarLibros() {
        return modeloLibro.obtenerLibros();
    }
     
    public void ActualizarLibro(int id,String titulo, String autor, String editorial, int anioPublicacion,String isbn) {
      Libro libro = new Libro(id, titulo, autor, editorial, anioPublicacion,isbn);
      modeloLibro.actualizarLibro(libro);
  }
     
      public int obtenerIdLibro(String titulo) {
        return modeloLibro.obtenerLibrosId(titulo);
    }
}

