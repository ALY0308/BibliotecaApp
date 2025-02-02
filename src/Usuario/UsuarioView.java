/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;

import Libro.LibroView;

import Usuario.UsuarioView;
import bibliotecaapp.DatabaseConnection;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ALY
 */
public class UsuarioView extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioView
     */
    public UsuarioView() {
        initComponents();
        ListarUsuario();
        R1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E1 = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        E2 = new javax.swing.JPanel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        R1 = new javax.swing.JTextField();
        R2 = new javax.swing.JTextField();
        R3 = new javax.swing.JTextField();
        R4 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        E1.setBackground(new java.awt.Color(153, 153, 255));

        TITULO.setBackground(new java.awt.Color(153, 153, 255));
        TITULO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 0, 0));
        TITULO.setText("Usuario");

        javax.swing.GroupLayout E1Layout = new javax.swing.GroupLayout(E1);
        E1.setLayout(E1Layout);
        E1Layout.setHorizontalGroup(
            E1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(E1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        E1Layout.setVerticalGroup(
            E1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(E1Layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        E2.setBackground(new java.awt.Color(204, 204, 255));
        E2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos De Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        E2.setForeground(new java.awt.Color(0, 0, 0));

        P1.setBackground(new java.awt.Color(204, 204, 255));
        P1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P1.setForeground(new java.awt.Color(0, 0, 0));
        P1.setText("Id:");

        P2.setBackground(new java.awt.Color(204, 204, 255));
        P2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P2.setForeground(new java.awt.Color(0, 0, 0));
        P2.setText("Nombre:");

        P3.setBackground(new java.awt.Color(204, 204, 255));
        P3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P3.setForeground(new java.awt.Color(0, 0, 0));
        P3.setText("Email:");

        P4.setBackground(new java.awt.Color(204, 204, 255));
        P4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P4.setForeground(new java.awt.Color(0, 0, 0));
        P4.setText("Telefono:");

        R1.setBackground(new java.awt.Color(204, 204, 255));
        R1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        R1.setForeground(new java.awt.Color(0, 0, 0));
        R1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        R2.setBackground(new java.awt.Color(204, 204, 255));
        R2.setForeground(new java.awt.Color(0, 0, 0));
        R2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        R3.setBackground(new java.awt.Color(204, 204, 255));
        R3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        R3.setForeground(new java.awt.Color(0, 0, 0));
        R3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        R4.setBackground(new java.awt.Color(204, 204, 255));
        R4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        R4.setForeground(new java.awt.Color(0, 0, 0));
        R4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        B1.setBackground(new java.awt.Color(153, 153, 255));
        B1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setText("Crear");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        Table1.setBackground(new java.awt.Color(153, 153, 255));
        Table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table1.setForeground(new java.awt.Color(0, 0, 0));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Email", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        B2.setBackground(new java.awt.Color(153, 153, 255));
        B2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(0, 0, 0));
        B2.setText("Seleccionar");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(153, 153, 255));
        B3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(0, 0, 0));
        B3.setText("Actualizar");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(153, 153, 255));
        B4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B4.setForeground(new java.awt.Color(0, 0, 0));
        B4.setText("Eliminar");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(153, 153, 255));
        B5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B5.setForeground(new java.awt.Color(0, 0, 0));
        B5.setText("Volver");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout E2Layout = new javax.swing.GroupLayout(E2);
        E2.setLayout(E2Layout);
        E2Layout.setHorizontalGroup(
            E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(E2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2)
                    .addComponent(P1)
                    .addComponent(P4))
                .addGap(27, 27, 27)
                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(E2Layout.createSequentialGroup()
                        .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(E2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        E2Layout.setVerticalGroup(
            E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(E2Layout.createSequentialGroup()
                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(E2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(E2Layout.createSequentialGroup()
                                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(E2Layout.createSequentialGroup()
                                        .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P1)
                                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(P2))
                                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(P3))
                            .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(E2Layout.createSequentialGroup()
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B2)
                        .addGap(18, 18, 18)
                        .addComponent(B3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P4)))
                .addGroup(E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(E2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, E2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(E2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void ListarUsuario()
    {
        
         try {
             Connection conexion = DatabaseConnection.getConnection();
              UsuarioDAO modeloLibro = new UsuarioDAO(conexion);
               
             UsuarioController controller = new UsuarioController(modeloLibro);
             conexion = DatabaseConnection.getConnection();
             List<Usuario> listaUsuario = controller.listarUsuario();
             
             DefaultTableModel model = (DefaultTableModel) Table1.getModel();
             model.setRowCount(0); // Limpiar la tabla antes de añadir nuevos datos

        for (Usuario usuario : listaUsuario) {
          Object[] row = {usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getTelefono()};
          model.addRow(row);
        }
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(LibroView.class.getName()).log(Level.SEVERE, null, ex);
         }
    } 
    
    public void LimpiarCampos()
    {
    
       R1.setText("");
       R2.setText("");
       R3.setText("");
       R4.setText("");
     
    }
    
    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
       
        dispose(); 
        LibroView u = new LibroView ();
        u.setVisible(true);
    }//GEN-LAST:event_B5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    
    //Crear
            
    String nombre = R2.getText();
    String email = R3.getText();
    String telefono = R4.getText();
   
    
         try {
              Connection conexion = DatabaseConnection.getConnection();
              UsuarioDAO modeloLibro = new UsuarioDAO(conexion);
               
             UsuarioController controller = new UsuarioController(modeloLibro);
             controller.crearUsuario(nombre, email, telefono);
             ListarUsuario();
             LimpiarCampos();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(LibroView.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       
        //Seleciconar
        
     int filaSeleccionada = Table1.getSelectedRow();
     DefaultTableModel model = (DefaultTableModel) Table1.getModel();

    // Obtener datos de la fila seleccionada
    Object id = model.getValueAt(filaSeleccionada, 0);  // Suponiendo que la columna 0 es el ID
    Object nombre = model.getValueAt(filaSeleccionada, 1);  // Suponiendo que la columna 1 es el título
    Object email = model.getValueAt(filaSeleccionada, 2);  // Suponiendo que la columna 2 es el autor
    Object telefono = model.getValueAt(filaSeleccionada, 3);  // Suponiendo que la columna 3 es la editorial
    

    
    // Mostrar los datos en los campos de edición
    R1.setText(id.toString());  // R1 es un JTextField donde se muestra el ID
    R2.setText(nombre.toString());  // R2 es un JTextField donde se muestra el título
    R3.setText(email.toString());  // R3 es un JTextField donde se muestra el autor
    R4.setText(telefono.toString());  // R4 es un JTextField donde se muestra la editorial

    B1.setEnabled(false);
    
        
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
     int id = Integer.parseInt(R1.getText());
     String nombre = R2.getText();
     String email = R3.getText();
     String telefono = R4.getText();
   
    
         try {
             Connection conexion = DatabaseConnection.getConnection();
              UsuarioDAO modeloLibro = new UsuarioDAO(conexion);
               
             UsuarioController controller = new UsuarioController(modeloLibro);
             controller.ActualizarUsuario(id,nombre, email, telefono);
             ListarUsuario();
             B1.setEnabled(true);
             LimpiarCampos();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(LibroView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
         int id = Integer.parseInt(R1.getText());
     String nombre = R2.getText();
     String email = R3.getText();
     String telefono = R4.getText();
   
    
         try {
             Connection conexion = DatabaseConnection.getConnection();
              UsuarioDAO modeloLibro = new UsuarioDAO(conexion);
               
             UsuarioController controller = new UsuarioController(modeloLibro);
             controller.eliminarUsuario(id);
             ListarUsuario();
             B1.setEnabled(true);
             LimpiarCampos();
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(LibroView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_B4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    public javax.swing.JButton B5;
    public javax.swing.JPanel E1;
    public javax.swing.JPanel E2;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JTextField R1;
    private javax.swing.JTextField R2;
    private javax.swing.JTextField R3;
    private javax.swing.JTextField R4;
    private javax.swing.JLabel TITULO;
    public javax.swing.JTable Table1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
