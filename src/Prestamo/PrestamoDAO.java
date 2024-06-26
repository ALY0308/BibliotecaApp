/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prestamo;

/**
 *
 * @author ALY
 */
import Libro.Libro;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO {
        private Connection conexion;

    public PrestamoDAO(Connection conexion) {
        this.conexion = conexion;
    }
  
 
        public boolean agregar(Prestamo prestamo) {
        String sql = "INSERT INTO Prestamos (libro_id, usuario_id, fecha_prestamo, fecha_devolucion) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, prestamo.getLibro_id());
            statement.setInt(2, prestamo.getUsuario_id());
            statement.setDate(3, (Date) prestamo.getFecha_prestamo());
            statement.setDate(4, (Date) prestamo.getFecha_devolucion());
            
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
        //metodo para consultar los libros dentro de la base de datos
         public List<Prestamo> obtener() {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT P.id, L.titulo,U.nombre,fecha_prestamo,fecha_devolucion\n" +
                    "FROM Prestamos P\n" +
                    "INNER JOIN Libros L ON P.libro_id = L.id\n" +
                    "INNER JOIN usuarios U ON P.usuario_id = u.id";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String nombre = resultSet.getString("nombre");
                Date fecha_prestamo = resultSet.getDate("fecha_prestamo");
                Date fecha_devolucion = resultSet.getDate("fecha_devolucion");
                Prestamo prestamo = new Prestamo(id, titulo, nombre, fecha_prestamo, fecha_devolucion);
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestamos;
    }

   //metodo para actualizar los libros dentro de la base de datos
    public boolean actualizar(Prestamo prestamo) {
        String sql = "UPDATE Prestamos SET libro_id = ?, usuario_id = ?, fecha_prestamo = ?, fecha_devolucion = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            
            statement.setInt(1, prestamo.getLibro_id());
            statement.setInt(2, prestamo.getUsuario_id());
            statement.setDate(3, (Date) prestamo.getFecha_prestamo());
            statement.setDate(4, (Date) prestamo.getFecha_devolucion());
            statement.setInt(5, prestamo.getId());

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //metodo para eliminar los libros dentro de la base de datos
    public boolean eliminar(int id) {
        String sql = "DELETE FROM Prestamos WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
     public List<String> obtenerNombresLibros() throws SQLException {
        List<String> libros = new ArrayList<>();
        String sql = "SELECT titulo FROM libros";
        
        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String nombreLibro = rs.getString("titulo");
                libros.add(nombreLibro);
            }
        }
        
        return libros;
    }
     
       public List<String> obtenerLibros() throws SQLException {
        List<String> libros = new ArrayList<>();
        String sql = "SELECT titulo FROM libros";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String titulo = rs.getString("titulo");

                libros.add(titulo);
            }
        }

        return libros;
    }
       
        public List<String> obtenerUsuarios() throws SQLException {
        List<String> usuarios = new ArrayList<>();
        String sql = "SELECT nombre FROM Usuarios";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");

                usuarios.add(nombre);
            }
        }

        return usuarios;
    }
}
