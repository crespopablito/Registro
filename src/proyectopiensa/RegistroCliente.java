
package proyectopiensa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroCliente extends javax.swing.JFrame {

     coneccion con = new coneccion();
    Connection coneccion = con.conectar();
    public RegistroCliente() {
        initComponents();
    }
     public void verdatos(String valor){
    DefaultTableModel modelo = new DefaultTableModel(); 
    
    modelo.addColumn("Id_Cliente");
    modelo.addColumn("Nombre del Cliente");
    modelo.addColumn("Direccion");
    modelo.addColumn("Telefono");
    modelo.addColumn("E-mail");
    
    TablaDeValores.setModel(modelo);
    
    String sql = "";
    if (valor.equals("")){
        sql="SELECT * from Clientes";
    }else{
        sql="SELECT * from Clientes WHERE Nombre = '"+valor+"'" ;
     }
    String datos[] = new String[5];
        try {
            Statement st= coneccion.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos [0] = rs.getString(1);
                 datos [1] = rs.getString(2);
                  datos [2] = rs.getString(3);
                   datos [3] = rs.getString(4);
                    datos [4] = rs.getString(5);
                     
                    modelo.addRow(datos);
            }
            TablaDeValores.setModel(modelo);
        } catch (SQLException e) {
        }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminarReg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeValores = new javax.swing.JTable();
        txtId_Cliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSalirPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardarReg.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnGuardarReg.setForeground(new java.awt.Color(255, 51, 51));
        btnGuardarReg.setText("GUARDAR REGISTRO");
        btnGuardarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("VER REGISTROS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 51, 51));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminarReg.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnEliminarReg.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminarReg.setText("ELIMINAR");
        btnEliminarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TablaDeValores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ID DEL CLIENTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("DIRECCION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("NOMBRE DEL CLIENTE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("E-MAIL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("TELEFONO");

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 102, 0));
        jButton2.setText("REGISTAR UNA VENTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSalirPrograma.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnSalirPrograma.setForeground(new java.awt.Color(255, 51, 51));
        btnSalirPrograma.setText("SALIR");
        btnSalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardarReg)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId_Cliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(43, 43, 43)
                                .addComponent(btnEliminarReg)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btnSalirPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarReg)
                    .addComponent(jButton1)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminarReg)
                    .addComponent(btnSalirPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegActionPerformed
    try {
            
            String Query= "INSERT INTO Clientes(Id_Cliente, Nombre,  Direccion, Telefono, Email) values(?,?,?,?,?)";
            PreparedStatement statement = coneccion.prepareStatement(Query);
            

            statement.setString(1,txtId_Cliente.getText());
            statement.setString(2,txtNombre.getText());
            statement.setString(3,txtDireccion.getText());
            statement.setString(4,txtTelefono.getText());
            statement.setString(5,txtEmail.getText());
               
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "LOS DATOS DE GRABARON CORRECTAMENTE");
            
            

        } catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null, "LOS DATOS NO FUERON GRABADOS" +e);
        }
    }//GEN-LAST:event_btnGuardarRegActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            txtId_Cliente.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtEmail.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verdatos("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegActionPerformed
       int fila = TablaDeValores.getSelectedRow();

        if  (fila>=0){
            txtId_Cliente.setText(TablaDeValores.getValueAt(fila,0).toString());
            txtNombre.setText(TablaDeValores.getValueAt(fila,1).toString());
            txtDireccion.setText(TablaDeValores.getValueAt(fila,2).toString());
            txtTelefono.setText(TablaDeValores.getValueAt(fila,3).toString());
            txtEmail.setText(TablaDeValores.getValueAt(fila,4).toString());
           
           
            

        }else{
            JOptionPane.showMessageDialog(null, "SELECCION UN REGISTRO A ELIMINAR");
        }
        
         fila = TablaDeValores.getSelectedRow();
        String cod = "";
        cod = TablaDeValores.getValueAt(fila,1).toString();
        try {
            PreparedStatement pst= coneccion.prepareStatement("DELETE   from Clientes Where Id_Cliente = '"+txtId_Cliente.getText()+"'");
            pst.executeUpdate();
            verdatos("");
            JOptionPane.showMessageDialog(null, "EL REGISTRO HA SIDO ELIMINADO");
            txtId_Cliente.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtEmail.setText("");
           
        } catch (HeadlessException | SQLException e) {
        }
        
    }//GEN-LAST:event_btnEliminarRegActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    RegistroVenta regventa = new RegistroVenta();
    regventa.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProgramaActionPerformed
    JOptionPane.showMessageDialog(null, "HA SALIDO DEL SISTEMA");
        System.exit(0); 
    }//GEN-LAST:event_btnSalirProgramaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeValores;
    private javax.swing.JButton btnEliminarReg;
    private javax.swing.JButton btnGuardarReg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalirPrograma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId_Cliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
