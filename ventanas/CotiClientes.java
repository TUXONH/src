/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Encapsuladas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import clases.conexion;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pablo Delfin
 */
public class CotiClientes extends javax.swing.JFrame {

    /**
     * Creates new form CotiClientes
     */
    
       int id_Estado=0;
   
   conexion con = new conexion();
     String Titulos[] = {"Folio","Correo electronico","Nombre","Apellidos","Estado","Municipio","Telmovil"};
       DefaultTableModel m = new DefaultTableModel(null, Titulos);
      
       int registro = 0;
       
    
    public void buscar()
        {
           
        jTable1.setModel(m);
       //obtener la cantidad de registro de una tabla
       
       try{
           PreparedStatement pstm = (PreparedStatement)
           con.getConnection().prepareStatement("SELECT count(1) as total FROM catclientes");
           ResultSet res = pstm.executeQuery();
           res.next();
           registro = res.getInt("total");
           System.out.println(registro);
           res.close();
                   
       }
       
       catch(SQLException e)
       {
           System.out.println(e);
       }
       try
       {
       Object[][] datos = new String[registro][7];
         PreparedStatement pstm = (PreparedStatement)
            con.getConnection().prepareStatement("SELECT FolioCliente,CorreoElectronico,NombreContacto,NombreComercial,Estado,Municipio,Telmovil FROM catclientes where CorreoElectronico='"+Encapsuladas.getCorreoElectronico()+"'");
         ResultSet res = pstm.executeQuery();
         
         int i =0;
         
         while(res.next())
         {
             /*String estCodigo = res.getString("Codigo");
             String estDescripcion = res.getString("Codigo");
             String estCodigo = res.getString("Codigo");
             String estCodigo = res.getString("Codigo");*/
             
             datos[i][0] = res.getString("FolioCliente");
             datos[i][1] = res.getString("CorreoElectronico");
             datos[i][2] = res.getString("NombreContacto");
             datos[i][3] = res.getString("NombreComercial");
            id_Estado =Integer.parseInt(res.getString("Estado"));
             datos[i][6] = res.getString("Telmovil");
          
             m.addRow(datos[i]);
             i++;
         }
       
       }
       
       catch(SQLException e)
       {
           System.out.println(e);
          
       
       }
        }
    
     public void buscar1()
        {
          
        jTable1.setModel(m);
       //obtener la cantidad de registro de una tabla
       
       try{
           PreparedStatement pstm = (PreparedStatement)
           con.getConnection().prepareStatement("SELECT count(1) as total FROM estados");
           ResultSet res = pstm.executeQuery();
           res.next();
           registro = res.getInt("total");
           System.out.println(registro);
           res.close();
                   
       }
       
       catch(SQLException e)
       {
           System.out.println(e);
       }
       try
       {
       Object[][] datos = new String[registro][7];
         PreparedStatement pstm = (PreparedStatement)
            con.getConnection().prepareStatement("SELECT Nombre FROM estados where id_estado='"+id_Estado+"'");
         ResultSet res = pstm.executeQuery();
         
         int i =0;
         
         while(res.next())
         {
             /*String estCodigo = res.getString("Codigo");
             String estDescripcion = res.getString("Codigo");
             String estCodigo = res.getString("Codigo");
             String estCodigo = res.getString("Codigo");*/
             
             
            datos[i][4] = res.getString("Nombre");
            JOptionPane.showMessageDialog(null,res.getString("Nombre"));
            
            
          
             m.addRow(datos[i]);
             i++;
         }
       
       }
       
       catch(SQLException e)
       {
           System.out.println(e);
          
       
       }
        }
    
    public CotiClientes() {
        initComponents();
        buscar();   
        buscar1();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CotiClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CotiClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CotiClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CotiClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                  try 
    {
      UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
    } 
    catch (Exception e) 
      {
      e.printStackTrace();
    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CotiClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
