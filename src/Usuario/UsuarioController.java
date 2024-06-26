/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.List;

/**
 *
 * @author ALY
 */
public class UsuarioController {
    
       private UsuarioDAO modeloUsuario;
       private UsuarioView view;
    
      public UsuarioController(UsuarioDAO usuarioDAO) {
        this.modeloUsuario = usuarioDAO;
    }
    
    
    public List<Usuario> obtenerTodosLosUsuarios() {
        return modeloUsuario.obtenerUsuarios();
    }

    public boolean eliminarUsuario(int id) {
        return modeloUsuario.eliminarUsuario(id);
    }
    
    public void crearUsuario(String nombre, String email, String telefono) {
        Usuario usuario = new Usuario(0, nombre, email, telefono);
        modeloUsuario.agregarUsuario(usuario);
    }
    
     public List<Usuario> listarUsuario() {
        return modeloUsuario.obtenerUsuarios();
    }
     
    public void ActualizarUsuario(int id,String nombre, String email, String telefono) {
     Usuario usuario = new Usuario(id, nombre, email, telefono);
      modeloUsuario.actualizarUsuario(usuario);
  }
 
    
     public int obtenerIdusuario(String nombre) {
        return modeloUsuario.obtenerUsuariosId(nombre);
    }
}
