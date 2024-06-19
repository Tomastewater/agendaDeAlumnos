/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaUniversitario;

import java.sql.SQLException;
import conectar.Conectar;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomas
 */

public class Registro extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel dtm;
    //ArrayList<Persona> lista = new ArrayList<Persona>();    // Creamos una lista de Personas
    String[][] matriz;
    int idDepartamento = 0;
    
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarUsuarios();
        tableDatos.setSelectionBackground(Color.getHSBColor(17, 100, 85));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        boxDepartamento = new javax.swing.JComboBox<>();
        testBoton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setBackground(new java.awt.Color(255, 255, 51));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("SISTEMA UNIVERSITARIO CM2T");
        labelTitulo.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(38, 117, 191));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        jLabel3.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(38, 117, 191));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido");
        jLabel2.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(38, 117, 191));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Departamento");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(38, 117, 191));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DNI");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(38, 117, 191));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tableDatos);

        btnRegistrar.setBackground(new java.awt.Color(55, 188, 74));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(217, 62, 1));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(50, 173, 224));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemaUniversitario/limpiar_icon (Personalizado).jpeg"))); // NOI18N
        btnBuscar1.setText("Limpiar cajas");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscar1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar1)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );

        boxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Comercio", "Contabilidad y Finanzas", "Licenciatura en Informática", "Gestion de Sistemas de información" }));
        boxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDepartamentoActionPerformed(evt);
            }
        });

        testBoton.setText("Ver Departamento");
        testBoton.setActionCommand("Ver departamento");
        testBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(testBoton)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(testBoton)
                        .addGap(25, 25, 25))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que realiza un SELEC * en la base de datos para recuperar a los usuarios registrados
     */
    public void mostrarUsuarios(){
        
        String[] campos = {"ID","DNI","Nombre", "Apellido", "Departamento"};
        String[] persona = new String[5];
        
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(campos);
        
        try{
            
            Conectar conectar = new Conectar();
            con = conectar.getConexion();
            ps = con.prepareStatement("SELECT * FROM vistapersonasdepartamentos");
            rs = ps.executeQuery();
            
            while(rs.next()){
                persona[0] = rs.getString("ID");
                persona[1] = rs.getString("DNI");
                persona[2] = rs.getString("Nombre");
                persona[3] = rs.getString("Apellido");
                persona[4] = rs.getString("Departamento");
                
                dtm.addRow(persona);
            }
            
            tableDatos.setModel(dtm);
            
        } catch (SQLException ex) {
            
        } catch (Exception e){
            
        }
        
    }
    
    /**
     * Establece como null las cajas de texto para el nuevo ingreso de datos
     */
    public void limpiarCajas(){
        txtId.setText(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        boxDepartamento.setSelectedIndex(0);
        this.idDepartamento = 0;

    }
    
    
    /**
     * Metodo que recibe un evento, al ejecutarse el toma ingresa un nuevo usuario a la base de datos
     * @param evt 
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try{
           
            Conectar conectar = new Conectar();
            con = conectar.getConexion();
            
            ps = con.prepareStatement("INSERT INTO personas (DNI, Nombre, Apellido, DepartamentoID) VALUES (?,?,?,?)");
            ps.setString(1, txtDni.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, String.valueOf(idDepartamento));
            int rs = ps.executeUpdate();
            
            
            if (rs > 0){
                JOptionPane.showMessageDialog(rootPane, "USUARIO REGISTRADO");
                limpiarCajas();
            } 
            
            else {
                JOptionPane.showMessageDialog(rootPane, "NO REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            con.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "ERROR DE LA BASE DE DATOS");
            if (boxDepartamento.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Faltan Datos por agregar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR DE CONEXION");
        } finally {
            mostrarUsuarios();
            
        }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        
        
        
    }//GEN-LAST:event_txtDniActionPerformed

    
    /**
     * Elimina un usuario de la base de datos dependiendo del id seleccionado
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        
        try{
            int fila = tableDatos.getSelectedRow();    // Obtengo la posicion de la fila seleccionada
            int id = Integer.parseInt(String.valueOf(dtm.getValueAt(fila, 0)));   // Obtengo el id que se encuentra en el campo 0 de la fila seleccionada
            
            Conectar conectar = new Conectar();
            con = conectar.getConexion();
            ps = con.prepareStatement("DELETE FROM personas WHERE ID = ?");
            ps.setInt(1, id);
            
            int rs = ps.executeUpdate();
            
            if (rs > 0){
                JOptionPane.showMessageDialog(rootPane, "Usuario eliminado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debes de elegir un usuario");
            }
            
            con.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROR DE LA BASE DE DATOS");
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Elige un usuario para eliminar");
        } finally {
            limpiarCajas();
            mostrarUsuarios();
        }
       
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try{
           
            Conectar conectar = new Conectar();
            con = conectar.getConexion();
            
            if (!txtDni.getText().isEmpty() && !txtNombre.getText().isEmpty()){  // Si DNI y Nombre no estan vacios entonces...
                
                ps = con.prepareStatement("UPDATE personas SET DNI = ?, Nombre = ?, Apellido = ?, DepartamentoID = ? WHERE ID = ?;");
                ps.setString(1, txtDni.getText());
                ps.setString(2, txtNombre.getText());
                ps.setString(3, txtApellido.getText());
                ps.setString(4, String.valueOf(boxDepartamento.getSelectedIndex()));
                ps.setString(5, txtId.getText());
                int rs = ps.executeUpdate();
            
                if (rs > 0){
                    JOptionPane.showMessageDialog(rootPane, "USUARIO ACTUALIZADO");
                    
                    limpiarCajas();
                } 
            
            } else {
                    JOptionPane.showMessageDialog(rootPane, "CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            con.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "ERROR DE LA BASE DE DATOS");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR DE CONEXION");
        } finally {
            mostrarUsuarios();
        }
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (!txtDni.getText().isEmpty()){
            
            try{
            
                Conectar conectar = new Conectar();
                con = conectar.getConexion();
                ps = con.prepareStatement("SELECT * FROM personas WHERE DNI = ?");
                ps.setString(1, txtDni.getText());

                rs = ps.executeQuery();

                if(rs.next()){

                    txtId.setText(rs.getString("ID"));
                    txtDni.setText(rs.getString("DNI"));
                    txtNombre.setText(rs.getString("Nombre"));
                    txtApellido.setText(rs.getString("Apellido"));
                    boxDepartamento.setSelectedIndex(Integer.parseInt(rs.getString("DepartamentoID")));
                    
                    
                    
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El usuario no existe");
                    
                    txtNombre.requestFocus();
                }
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "ERROR DE LA BASE DE DATOS");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "ERROR DE CONEXION");
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escribir DNI"
                    + "\npara buscar");
        }
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        
        
        
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            btnRegistrar.doClick();
            limpiarCajas();
        }
        
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            btnBuscar.doClick();
        }
        
    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        
        this.limpiarCajas();
        
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void boxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDepartamentoActionPerformed
        
        this.idDepartamento = boxDepartamento.getSelectedIndex();
        
    }//GEN-LAST:event_boxDepartamentoActionPerformed

    private void testBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBotonActionPerformed
        
        
        JOptionPane.showMessageDialog(rootPane, txtId.getText() + " " + txtDni.getText() + " " + txtNombre.getText() + " " + txtApellido.getText() + " Departamento = " + idDepartamento  );
        
    }//GEN-LAST:event_testBotonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDepartamento;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableDatos;
    private javax.swing.JButton testBoton;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}