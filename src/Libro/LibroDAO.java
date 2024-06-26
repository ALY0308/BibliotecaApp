/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author ALY
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    private Connection conexion;

    public LibroDAO(Connection conexion) {
        this.conexion = conexion;
    }

    // Crear los metodos CRUD: crear, leer, actualizar y eliminar
    
    //metodo para insertar los libros dentro de la base de datos
        public boolean agregarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, editorial, anio_publicacion, isbn) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getEditorial());
            statement.setInt(4, libro.getAnioPublicacion());
            statement.setString(5, libro.getIsbn());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
        //metodo para consultar los libros dentro de la base de datos
         public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String editorial = resultSet.getString("editorial");
                int anioPublicacion = resultSet.getInt("anio_publicacion");
                String isbn = resultSet.getString("isbn");
                Libro libro = new Libro(id, titulo, autor, editorial, anioPublicacion, isbn);
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

   //metodo para actualizar los libros dentro de la base de datos
    public boolean actualizarLibro(Libro libro) {
        String sql = "UPDATE libros SET titulo = ?, autor = ?, editorial = ?, anio_publicacion = ?, isbn = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, libro.getTitulo());
            statement.setString(2, libro.getAutor());
            statement.setString(3, libro.getEditorial());
            statement.setInt(4, libro.getAnioPublicacion());
            statement.setString(5, libro.getIsbn());
            statement.setInt(6, libro.getId());
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //metodo para eliminar los libros dentro de la base de datos
    public boolean eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        
    
   public int obtenerLibrosId(String titulo) {
        int id = 0;
        String sql = "SELECT ID FROM libros WHERE titulo = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, titulo);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    id = resultSet.getInt("ID");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
        
}
    