/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prestamo;

import java.util.Date;

/**
 *
 * @author ALY
 */

        
public class Prestamo {
    private int id;
    private int libro_id;
    private int usuario_id;
    private java.sql.Date fecha_prestamo;
    private java.sql.Date fecha_devolucion;
    private String titulo;
    private String nombre;

    
    // Crear los metodos Getters y Setters

    public Prestamo(int id, int libro_id, int usuario_id, java.sql.Date fecha_prestamo, java.sql.Date fecha_devolucion) {
        this.id = id;
        this.libro_id = libro_id;
        this.usuario_id = usuario_id;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }
    
      public Prestamo(int id, String titulo, String nombre, java.sql.Date fecha_prestamo, java.sql.Date fecha_devolucion) {
        this.id = id;
        this.titulo = titulo;
        this.nombre = nombre;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public java.sql.Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(java.sql.Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public java.sql.Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(java.sql.Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
   
    
}
