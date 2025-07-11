package formulario;

import clases.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mod_Usuario extends javax.swing.JFrame {
    
    public static Controlador control;
    public static ResultSet rs;
    public static int res;
    public static int idUsuario;
    private String rolUsuario; 
    private String nombreUsuario;
    

    
    public Mod_Usuario(String nombreUsuario, String rolUsuario) throws SQLException{
        initComponents();
        llenarComboBox();
        this.rolUsuario = rolUsuario;
        this.nombreUsuario = nombreUsuario;
        this.setLocationRelativeTo(null);
        
        java.net.URL imgURL = getClass().getResource("/imagenes/Ipchilelogo.png");
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            lbIcons.setIcon(icon);
        } else {
            System.out.println("No se encontró la imagen en /imagenes/Ipchilelogo.png");
        }

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
        this.setIconImage(icon.getImage());
    }
    
    void llenarComboBox() throws SQLException {
        try {
            control = new Controlador();
            control.crearConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Con_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            cbbUsu.removeAllItems();

            String sql = "SELECT us_nom FROM Usuarios"; 
            rs = control.mandarQUERY(sql);

            while (rs.next()) {
                cbbUsu.addItem(rs.getString("us_nom"));
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(Con_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbbUsu = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNomCom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfRol = new javax.swing.JTextField();
        btModif = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        lbIcons = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Costo del Sistema");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modificar Usuarios");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        cbbUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbbUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btBuscar)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Clave:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Completo:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Rol:");

        btModif.setText("Modificar");
        btModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        lbIcons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ipchilelogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(tfRol))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btModif)
                .addGap(46, 46, 46)
                .addComponent(btEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVolver)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(171, 171, 171)
                        .addComponent(lbIcons)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbIcons, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfUsuario))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModif)
                    .addComponent(btEliminar)
                    .addComponent(btVolver))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifActionPerformed
        try{
            control = new Controlador();
            control.crearConexion();
        } catch(SQLException ex) {
            Logger.getLogger(Mod_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            String sql_upd = "UPDATE Usuarios SET us_nom ='" + tfUsuario.getText()+"', " + "us_nom_com='" + tfNomCom.getText() + "'" + "where ud_id=" + idUsuario;
            
            res = control.mandarSQL(sql_upd);
            
        }catch(SQLException ex) {
            Logger.getLogger(Mod_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (res == -1){
            JOptionPane.showMessageDialog(null, "ERROR");
        } else {
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
        }
    }//GEN-LAST:event_btModifActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try{
            control = new Controlador();
            control.crearConexion();
        } catch(SQLException ex) {
            Logger.getLogger(Mod_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            
            String sql = "SELECT ud_id, us_nom, us_nom_com, " + "(SELECT rol_nombre From Roles Where rol_id=us_rol_id) as ROL From Usuarios " + " Where us_nom='" + cbbUsu.getSelectedItem().toString()+"'";
            rs = control.mandarQUERY(sql);
            
            while(rs.next()){
                idUsuario = Integer.parseInt(rs.getString("ud_id"));
                tfUsuario.setText(rs.getString("us_nom"));
                tfNomCom.setText(rs.getString("us_nom_com"));
                tfRol.setText(rs.getString("ROL"));
            }
        
        } catch(SQLException ex) {
            Logger.getLogger(Con_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        Menu menu = new Menu(nombreUsuario, rolUsuario);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btVolverActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        try {
            control = new Controlador();
            control.crearConexion();
        } catch (SQLException ex) {

            Logger.getLogger(Mod_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String sql_del = "DELETE FROM Usuarios WHERE ud_id=" + idUsuario;
            res = control.mandarSQL(sql_del);
        } catch (SQLException ex) {
            Logger.getLogger(Mod_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (res == -1) {
            JOptionPane.showMessageDialog(null, "ERROR");
        } else {
            JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModif;
    private javax.swing.JButton btVolver;
    private javax.swing.JComboBox<String> cbbUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbIcons;
    private javax.swing.JTextField tfNomCom;
    private javax.swing.JTextField tfRol;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
