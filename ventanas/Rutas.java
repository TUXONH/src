package ventanas;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import java.awt.Dimension;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import maps.java.*;
import static sun.management.Agent.error;
import org.jsoup.Jsoup;
/**
 *
 * @author danielandrademaglioni
 */
public class Rutas extends javax.swing.JFrame {
    private Route ObjRoute=new Route();
    //private StreetView ObjStreetView=new StreetView();
    clases.StreetView ObjStreetView = new clases.StreetView();
    clases.Route route = new clases.Route();            
    Main2 main = new Main2();
    String x,y,x2,y2;        
    String seleccion;
    String cxo = null,cyo = null,cxd,cyd;
    String sqlOrigen="Select FolioOrdenServicio,CveTipoViviendaOrigen,EstadoOrigen,MunicipioOrigen,NombreCteOrigen,Ape_PatOrigen,Ape_MatOrigen,DirOrigen,ColPoblOrigen,RefOrigen,TelOrigen,TelCelOrigen,NumPisosOrigen,NombreRecibe,Anticipo,Saldo,Total,VolTotal,CoordenadaXOrigen,CoordenadaYOrigen,CoordenadaXDestino,CoordenadaYDestino from catordenesservicios";
    String sqlDestino="Select FolioOrdenServicio,Usuario,EstadoDestino,MunicipioDestino,FechaOrdServ,FechaServicio,FolioCliente,NombreRecibe,DirDestino,ColPoblDest,RefDest,TelDest,TelCelDestino,NumPisosDest,FechaCotizacion,ComentariosCte,ServAgreg,VentasArt,Anticipo,Saldo,SubTotal,IVA,Total,VolTotal,Observaciones,CoordenadaXOrigen,CoordenadaYOrigen,CoordenadaXDestino,CoordenadaYDestino from catordenesservicios";
    /**
     * Creates new form Rutas
     */
    public Rutas() throws SQLException {
        initComponents();        
        //main.pasar_valores(tabla, sqlOrigen);   
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo3 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        JLabel_Ruta_Copyright = new javax.swing.JLabel();
        JLabel_Ruta_Resumen = new javax.swing.JLabel();
        JText_Ruta_Hito = new javax.swing.JTextField();
        jCheckBox_Ruta_Hito = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        JText_Ruta_Tiempo = new javax.swing.JTextField();
        jButton_Peticiones1 = new javax.swing.JButton();
        JText_Ruta_Distancia = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Ruta_Tramos = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        JText_Ruta_DirecOrigen = new javax.swing.JTextField();
        JText_Ruta_DirecDestin = new javax.swing.JTextField();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        JText_SV_horizontal = new javax.swing.JTextField();
        jSlider2 = new javax.swing.JSlider();
        JText_SV_zoom = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JLabel_SV_Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Origen", "Ver Destino" }));
        combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3ActionPerformed(evt);
            }
        });

        jLabel20.setText("Dirección destino");

        JLabel_Ruta_Copyright.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        JLabel_Ruta_Copyright.setText("Copyright");

        JLabel_Ruta_Resumen.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        JLabel_Ruta_Resumen.setText("Resumen");

        jCheckBox_Ruta_Hito.setText("Hito intermedio");

        jLabel25.setText("Tiempo total (horas)");

        jLabel26.setText("Distancia total (km)");

        JText_Ruta_Tiempo.setEditable(false);

        jButton_Peticiones1.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Peticiones1.setText("Calcular");
        jButton_Peticiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Peticiones1ActionPerformed(evt);
            }
        });

        JText_Ruta_Distancia.setEditable(false);

        jTable_Ruta_Tramos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Duración tramo", "Distancia tramo", "Indicaciones", "Latitud", "Longitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_Ruta_Tramos);

        jLabel19.setText("Dirección origen");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Folio de ordenes de servicio", "Nombre Cliente", "Direccion" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(360);
        jSlider1.setValue(180);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        JText_SV_horizontal.setText("180");

        jSlider2.setMaximum(120);
        jSlider2.setMinimum(10);
        jSlider2.setValue(90);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        JText_SV_zoom.setText("90");
        JText_SV_zoom.setToolTipText("");

        jLabel24.setText("Horizontal");

        jLabel27.setText("Zoom");

        JLabel_SV_Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_SV_Imagen.setText("Imagen StreetView");
        jScrollPane5.setViewportView(JLabel_SV_Imagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Peticiones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(JText_Ruta_DirecOrigen)
                    .addComponent(JText_Ruta_DirecDestin)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox_Ruta_Hito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JText_Ruta_Hito))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JText_Ruta_Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JText_Ruta_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(JLabel_Ruta_Copyright)
                                        .addComponent(JLabel_Ruta_Resumen)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(JText_SV_horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel27)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JText_SV_zoom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JText_Ruta_DirecOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JText_Ruta_DirecDestin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_Ruta_Hito)
                    .addComponent(JText_Ruta_Hito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_Ruta_Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_Ruta_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_Ruta_Copyright)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel_Ruta_Resumen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_SV_horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JText_SV_zoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Peticiones1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3ActionPerformed
        
    }//GEN-LAST:event_combo3ActionPerformed

    private void jButton_Peticiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Peticiones1ActionPerformed
        try {
            crearRuta();
            if (combo3.getSelectedItem()=="Ver Origen")
            {
                cargarStreetView(JText_Ruta_DirecOrigen);
            }
            if (combo3.getSelectedItem()=="Ver Destino")
            {
                cargarStreetView(JText_Ruta_DirecDestin);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton_Peticiones1ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        combo2.removeAllItems();
        if (combo1.getSelectedItem()=="Folio de ordenes de servicio")
        {
            seleccion="FolioOrdenServicio";
            String sql ="SELECT "+seleccion+" FROM catordenesservicios ";
            try {
                main.pasar_filas_combo(combo2, sql);
            } catch (SQLException ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (combo1.getSelectedItem()=="Nombre Cliente")
        {
            seleccion="NombreCteOrigen";
            String sql ="SELECT "+seleccion+" FROM catordenesservicios ";
            try {
                main.pasar_filas_combo(combo2, sql);
            } catch (SQLException ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (combo1.getSelectedItem()=="Direccion")
        {
            if (combo3.getSelectedItem()=="Ver Origen")
            {
                seleccion="DirOrigen";
                String sql ="SELECT "+seleccion+" FROM catordenesservicios ";
                try {
                    main.pasar_filas_combo(combo2, sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (combo3.getSelectedItem()=="Ver Destino")
            {
                seleccion="DirDestino";
                String sql ="SELECT "+seleccion+" FROM catordenesservicios ";
                try {
                    main.pasar_filas_combo(combo2, sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_combo1ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        String sql="Select CoordenadaXOrigen From catordenesservicios Where "+seleccion+" = \""+combo2.getSelectedItem()+"\"";

        try {

            String sql1="Select CoordenadaXOrigen From catordenesservicios Where "+seleccion+" = \""+combo2.getSelectedItem()+"\"";
            String sql2="Select CoordenadaYOrigen From catordenesservicios Where "+seleccion+" = \""+combo2.getSelectedItem()+"\"";           
            String sql3="Select CoordenadaXDestino From catordenesservicios Where "+seleccion+" = \""+combo2.getSelectedItem()+"\"";
            String sql4="Select CoordenadaYDestino From catordenesservicios Where "+seleccion+" = \""+combo2.getSelectedItem()+"\"";
                cxo = pasar_filas(sql1);
                cyo = pasar_filas(sql2);
                cxd = pasar_filas(sql3);
                cyd = pasar_filas(sql4);                        
            } catch (SQLException ex) {
                Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        JText_Ruta_DirecOrigen.setText(cxo+", "+cyo);
        JText_Ruta_DirecDestin.setText(cxd+", "+cyd);                                                           
    }//GEN-LAST:event_combo2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        this.JText_SV_horizontal.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        this.JText_SV_zoom.setText(String.valueOf(jSlider2.getValue()));
    }//GEN-LAST:event_jSlider2StateChanged
    public String pasar_filas( String sql)
    throws SQLException
  {
      String c = null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mudandote", "root", "");
      Statement stm = con.createStatement();
      ResultSet rst = stm.executeQuery(sql);
      ResultSetMetaData rsMd = rst.getMetaData();
      
      int NumeroColumnas = rsMd.getColumnCount();
      
      while (rst.next())
      {
        Object[] fila = new Object[NumeroColumnas];
        for (int j = 0; j < NumeroColumnas; j++) {
          fila[j] = rst.getObject(j+1);
          //System.out.println("Filas "+fila[j]);
          c=(String) fila[j];
        }
        
      }
    }
    catch (ClassNotFoundException|SQLException ce) {}
    return c;
  }
    
    
    private void rellenarTablaRuta(String[][] ruta){
        String[] columnas=new String[5];
        columnas[0]="Duración tramo";columnas[1]="Distancia tramo";columnas[2]="Indicaciones";columnas[3]="Latitud";columnas[4]="Longitud";
        for(int i=0;i<ruta.length;i++){
            try {
                 ruta[i][2]=Jsoup.parse(ruta[i][2]).text();
            } catch (Exception e) {
            }
        }
        TableModel tableModel=new DefaultTableModel(ruta, columnas);
        this.jTable_Ruta_Tramos.setModel(tableModel);
    }
    private void rellenarDatosrRuta(){
         this.JLabel_Ruta_Copyright.setText("");
         this.JLabel_Ruta_Resumen.setText("");
         this.JText_Ruta_Tiempo.setText("");
         this.JText_Ruta_Distancia.setText("");
         //this.JLabel_Ruta_Status.setText(MapsJava.getLastRequestStatus());
         ArrayList<Integer> tiempoTotal=ObjRoute.getTotalTime();
         int tiempoAux=0;
         for(Integer item:tiempoTotal){
             tiempoAux+=item;
         }
         ArrayList<Integer> distanciaTotal=ObjRoute.getTotalDistance();
         int distanciaAux=0;
         for(Integer item:distanciaTotal){
             distanciaAux+=item;
         }
         double tiempo=(double)(tiempoAux);
         tiempo=(tiempo/60)/60;
         tiempo=redondeoDosDecimales(tiempo);
         double distancia=(double)(distanciaAux);
         distancia=distancia/1000;
         this.JLabel_Ruta_Copyright.setText(ObjRoute.getCopyright());
         this.JLabel_Ruta_Resumen.setText(ObjRoute.getSummary());
         this.JText_Ruta_Tiempo.setText(String.valueOf(tiempo));
         this.JText_Ruta_Distancia.setText(String.valueOf(distancia));

    } 
    double redondeoDosDecimales(double d) {
        return Math.rint(d*1000)/1000;
    }
    private void crearRuta() throws MalformedURLException, UnsupportedEncodingException{
         if(!JText_Ruta_DirecOrigen.getText().isEmpty() && !JText_Ruta_DirecDestin.getText().isEmpty()){
             ArrayList<String> hitos=new ArrayList<>();
             //if(jCheckBox_Ruta_Hito.isSelected() && !JText_Ruta_Hito.getText().isEmpty()){
             //    hitos.add(JText_Ruta_Hito.getText());
             //}
             String[][] arrayRoute=ObjRoute.getRoute(JText_Ruta_DirecOrigen.getText(), JText_Ruta_DirecDestin.getText(),
                     hitos, Boolean.TRUE,Route.mode.driving,Route.avoids.nothing);               
//,
//hitos, Boolean.TRUE,this.seleccionarModoRuta(),this.seleccionarRestricciones());  
             rellenarTablaRuta(arrayRoute);
             rellenarDatosrRuta();
            
         }
    }
    private void cargarStreetView(JTextField direccion) throws MalformedURLException, UnsupportedEncodingException{
        if(!direccion.getText().isEmpty()){
            JLabel_SV_Imagen.setText("");
            Image imagenStreet=ObjStreetView.getStreetView(direccion.getText(), new Dimension(500,500), 
                    Double.valueOf(JText_SV_horizontal.getText()), Double.valueOf(JText_SV_zoom.getText()),
                    -100);
            if(imagenStreet!=null){
                ImageIcon imgIcon=new ImageIcon(imagenStreet);
                Icon iconImage=(Icon)imgIcon;
                JLabel_SV_Imagen.setIcon(iconImage);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new Rutas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Rutas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Ruta_Copyright;
    private javax.swing.JLabel JLabel_Ruta_Resumen;
    private javax.swing.JLabel JLabel_SV_Imagen;
    private javax.swing.JTextField JText_Ruta_DirecDestin;
    private javax.swing.JTextField JText_Ruta_DirecOrigen;
    private javax.swing.JTextField JText_Ruta_Distancia;
    private javax.swing.JTextField JText_Ruta_Hito;
    private javax.swing.JTextField JText_Ruta_Tiempo;
    private javax.swing.JTextField JText_SV_horizontal;
    private javax.swing.JTextField JText_SV_zoom;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JButton jButton_Peticiones1;
    private javax.swing.JCheckBox jCheckBox_Ruta_Hito;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTable jTable_Ruta_Tramos;
    // End of variables declaration//GEN-END:variables
}
