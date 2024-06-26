/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categoria;

import java.util.List;

/**
 *
 * @author ALY
 */
public class CategoriaController {
    
       private CategoriaDAO modeloCategoria;
       private CategoriaView view;

    public CategoriaController(CategoriaView vista, CategoriaDAO modelo) {
        this.view = vista;
        this.modeloCategoria = modelo;
        // Inicializar y añadir oyentes a los botones
    }

    
   public CategoriaController(CategoriaDAO categoriaDAO) {
        this.modeloCategoria = categoriaDAO;
    }
    
    
    public List<Categoria> obtenerTodosCategorias() {
        return modeloCategoria.obtener();
    }

    public boolean eliminar(int id) {
        return modeloCategoria.eliminar(id);
    }
    
    public void crear(String nombre) {
        Categoria categoria = new Categoria(0, nombre);
        modeloCategoria.agregar(categoria);
    }
    
     public List<Categoria> listar() {
        return modeloCategoria.obtener();
    }
     
    public void Actualizar(int id,String nombre) {
     Categoria categoria = new Categoria(id, nombre);
      modeloCategoria.actualizar(categoria);
  }
    // Métodos para manejar eventos de los botones (crear, leer, actualizar, eliminar)
}

