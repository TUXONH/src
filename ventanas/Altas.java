package ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josegonzalez
 */
import clases.conexion;
import javax.swing.JOptionPane;
public class Altas extends javax.swing.JFrame {

    /**
     * Creates new form Altas
     */
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCombo2 = new DefaultComboBoxModel();
    public int maestra;
    public int ventas;
    public boolean bandera;
    public boolean bandera2;
    conexion con;
    public Altas() {
        initComponents();
        con = new conexion();
        con.getConnection();
          Ver();
        llenar_est();
        jComboBox1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg) {
           llenar_muni((String) jComboBox1.getSelectedItem());
          }
         });  
         jRadioButton1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg) {
            if(jRadioButton1.isSelected()==true)
        {
            maestra =1;
            bandera=true;
        }
        else
        {
             maestra=0;
             bandera=false;
        }
          }
         });
          jRadioButton2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg) {
            if(jRadioButton1.isSelected()==true)
        {
            ventas =1;
            bandera2=true;
        }
        else
        {
             ventas=0;
             bandera2=false;
        }
          }
         });
          jButton4.setVisible(false);
          jButton5.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Origenes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 3, 12), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Municipio");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 3, 12), new java.awt.Color(255, 102, 0))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jRadioButton1.setText("Administrador");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jRadioButton2.setText("Agentes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 3, 11), new java.awt.Color(255, 153, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jLabel2.setText("Contraseña");

        jTextField3.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jLabel3.setText("Serie");

        jLabel4.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N
        jLabel4.setText("Plaza");

        jTextField1.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N

        jTextField4.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N

        jTextField2.setFont(new java.awt.Font("SansSerif", 2, 11)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4))
                        .addGap(103, 103, 103)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NuevoProducto(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),maestra,ventas,jComboBox1.getSelectedItem().toString(),jComboBox2.getSelectedItem().toString());
        Ver();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int idx = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        
        try
        {
            PreparedStatement pstm =(PreparedStatement)
            con.getConnection().prepareStatement("DELETE FROM catusuarios WHERE cve_usuario="+idx);
            int variable = pstm.executeUpdate();
            if(variable>0)
            {
                System.out.println("Se elimino");
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Altas.class.getName()).log(Level.SEVERE, null, ex);
        }
    Ver();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()==true)
        {
            maestra=1;
        }
        else
        {
            maestra=0;
        }
        if(jRadioButton2.isSelected()==true)
        {
            ventas=1;
        }
        else
        {
            ventas=0;
        }
   
        int idx =Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
      System.out.println("Ventas: "+ventas+" Maestra: "+maestra);
        Modificar(idx,jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),maestra,ventas,jComboBox1.getSelectedItem().toString(),jComboBox2.getSelectedItem().toString());
        Ver();
           jButton4.setVisible(false);
            jButton5.setVisible(false);
           
            jButton1.setVisible(true);
            jButton2.setVisible(true);
           jButton3.setVisible(true);
           jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if (jTable1.getSelectedRow()!=-1)
        {
            String Serie = (String) jTable1.getValueAt(jTable1.getSelectedRow(),4);
            String NombreUsuario = (String) jTable1.getValueAt(jTable1.getSelectedRow(),1);
            String Contraseña = (String) jTable1.getValueAt(jTable1.getSelectedRow(),2);
            String Plaza = (String) jTable1.getValueAt(jTable1.getSelectedRow(),3);
            String Ventas = (String) jTable1.getValueAt(jTable1.getSelectedRow(),5);
            String Maestra = (String) jTable1.getValueAt(jTable1.getSelectedRow(),6);
             String Estado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),8);
              String Municipio = (String) jTable1.getValueAt(jTable1.getSelectedRow(),7);
           int Bajaint=Integer.parseInt(Ventas.toString());
           int Bajaint2=Integer.parseInt(Maestra.toString());
           boolean Baja,Baja1;
         
          if(Bajaint==1)
          {
              Baja=true;
          }
          else
          {
              Baja=false;
          }
          if(Bajaint2==1)
          {
              Baja1=true;
          }
          else
          {
              Baja1=false;
          }
       System.out.println("Ventas: "+Baja+" Maestra: "+Baja1);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            jTextField1.setText(NombreUsuario);
            jTextField2.setText(Contraseña);
            jTextField3.setText(Plaza);
            jTextField4.setText(Serie); 
            jComboBox1.setSelectedItem(Estado);
            jComboBox2.setSelectedItem(Municipio);
            jRadioButton1.setSelected(Baja1);
            jRadioButton2.setSelected(Baja);
             
             
             
             
        }
        
        else {
            JOptionPane.showMessageDialog(null,"Para Modificar primero debes seleccionar en la tabla que registro quieres modificar");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton4.setVisible(false);
            jButton5.setVisible(false);
           
            jButton1.setVisible(true);
            jButton2.setVisible(true);
           jButton3.setVisible(true);
           jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
      public void llenar_est() {
        try {
            this.jComboBox1.removeAllItems();
             //System.out.println("Error 3");
           // Class.forName("com.mysql.jdbc.Driver");
           //  System.out.println("Error 4");
           // Connection conexion =DriverManager.getConnection("jdbc:mysql://localhost/mudandote", "root", "");
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM estados");
            modeloCombo.addElement("Seleccione un Estado");
            this.jComboBox1.setModel(modeloCombo);
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombre"));
                this.jComboBox1.setModel(modeloCombo);
            }
 
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error 1");
            System.out.println(ex);
        } 
      }
      public void llenar_muni(String est){
    this.jComboBox2.setEnabled(true);
    this.jComboBox2.removeAllItems();
 try {
           // Class.forName("com.mysql.jdbc.Driver");
          //  Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mudandote", "root", "");
            Statement st = con.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM municipios,estados where municipios.id_estado=estados.id_estado and estados.nombre='"+est+"'");
            modeloCombo2.addElement("Seleccione un Municipio");
            this.jComboBox2.setModel(modeloCombo2);
            while (rs.next()) {
                modeloCombo2.addElement(rs.getObject("mun_nombre"));
                this.jComboBox2.setModel(modeloCombo2);
            }
 
            st.close();
        } catch (SQLException ex) {
             System.out.println(ex);
        } 
}
    public void Ver()
{
//con.getConnection();
        String Titulos[]={"Clave","Usuario","Contraseña","Plaza","Serie","Ventas","Maestra","Municipio","Estado"};
        DefaultTableModel m = new DefaultTableModel(null,Titulos);
        jTable1.setModel(m);
        int registro=0;
       
        try{
            
         PreparedStatement pstm =(PreparedStatement)
         con.getConnection().prepareStatement("SELECT count(1) as total FROM catusuarios ");
         ResultSet res = pstm.executeQuery();
         res.next();
         registro = res.getInt("total");
         System.out.println(registro);
         res.close();
         
        
        
        } catch (SQLException e) {
           System.out.println(e);
        }
        Object [][] datos = new String[registro][9];
        
        try {
                    PreparedStatement   pstm = (PreparedStatement)
                    con.getConnection().prepareStatement("SELECT catusuarios.cve_usuario,catusuarios.nombre_usuario,catusuarios.password,catusuarios.plaza,catusuarios.serie,catusuarios.ventas,catusuarios.maestra,estados.nombre,municipios.mun_nombre from catusuarios LEFT JOIN estados ON estados.id_estado=catusuarios.id_estado LEFT JOIN municipios ON municipios.id_municipio=catusuarios.id_municipio");
                      ResultSet res = pstm.executeQuery();
                      int i=0;
                      while(res.next()){
                          String ClaveUs = res.getString("catusuarios.cve_usuario");
                          String nombreUs = res.getString("catusuarios.nombre_usuario");
                          String PassU = res.getString("catusuarios.password");
                          String PlazaU = res.getString("catusuarios.plaza");
                          String SerieU = res.getString("catusuarios.serie");
                           String VentasU = res.getString("catusuarios.ventas");
                            String MaestraU = res.getString("catusuarios.maestra");
                           String Municipio  = res.getString("municipios.mun_nombre");
                          String Estado = res.getString("estados.nombre");
                          datos[i][0]=ClaveUs;
                          datos[i][1]=nombreUs;
                          datos[i][2]=PassU;
                          datos[i][3]=PlazaU;
                          datos[i][4]=SerieU;
                          datos[i][5]=VentasU;
                          datos[i][6]=MaestraU;
                           datos[i][7]=Municipio;
                            datos[i][8]=Estado;
                          m.addRow(datos[i]);
                          i++;
                      
                      
                      }
                    
        } catch (SQLException ex) {
             System.out.println(ex);
        }
}
    public void NuevoProducto(String TMPnombre_usuario,String TMPpassword,String TMPplaza,String TMPserie,int TMPmaestra,int TMPventas,String TMPid_estado,String TMPid_municipio)
{
    try{
       // PreparedStatement PreparedStatement = null;
        PreparedStatement pstm =(PreparedStatement)
        con.getConnection().prepareStatement("Select id_municipio,id_estado from municipios where mun_nombre= '"+TMPid_municipio+"'");
        ResultSet res1 = pstm.executeQuery();
        res1.next();
       String aux_idmun = res1.getObject("id_municipio").toString();
        String aux_idest = res1.getObject("id_estado").toString();
        System.out.println("Valor "+ TMPnombre_usuario);
       pstm = con.getConnection().prepareStatement("insert into catusuarios (nombre_usuario,password,plaza,serie,ventas,maestra,id_municipio,id_estado) values ('"+TMPnombre_usuario+"','"+TMPpassword+"','"+TMPplaza+"','"+TMPserie+"',"+TMPventas+","+TMPmaestra+","+aux_idmun+","+aux_idest+")");
       pstm.execute();   
       pstm.close();
           
    
    }catch(SQLException e){
            
                System.out.println(e);
            }

}
     public void Modificar(int idx,String TMPnombre_usuario,String TMPpassword,String TMPplaza,String TMPserie,int TMPmaestra,int TMPventas,String TMPid_estado,String TMPid_municipio)
   {
   
    // TODO add your handling code here:
          
      
        try {            
            PreparedStatement pst =(PreparedStatement)     
           con.getConnection().prepareStatement("Select id_municipio,id_estado from municipios where mun_nombre= '"+TMPid_municipio+"'");
             ResultSet res1 = pst.executeQuery();
             res1.next();
            String aux_idmun = res1.getObject("id_municipio").toString();
             String aux_idest = res1.getObject("id_estado").toString();
            pst=con.getConnection().prepareStatement("UPDATE catusuarios SET nombre_usuario='"+TMPnombre_usuario+"',password='"+TMPpassword+"',plaza='"+TMPplaza+"',serie='"+TMPserie+"',maestra="+TMPmaestra+",ventas="+TMPventas+",id_estado="+aux_idest+",id_municipio="+aux_idmun+" WHERE cve_usuario="+idx);                                                        
            pst.executeUpdate();
            pst.close();
         
            //JOptionPane.showMessageDialog(null,"Se modifico el registro con exito!");
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   }
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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
