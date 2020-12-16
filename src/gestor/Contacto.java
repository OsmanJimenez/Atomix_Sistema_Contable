/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osman
 */
public class Contacto extends javax.swing.JPanel {

    DefaultTableModel modeloTabla;
    DefaultTableModel modeloTabla1;

    //Contacto listar, añadir
    public Contacto() {
        modeloTabla = new DefaultTableModel(null, getColumnas());
        modeloTabla1 = new DefaultTableModel(null, getColumnas());
        //Definimos la cantidad de columnas de nuestra tabla
        setFilas();
        setFilas1();
        
        
        try{
            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception ex){
                    
                    }
        
        initComponents();

        
    }

    private String[] getColumnas() {
        String columna[] = new String[]{
            "Codigo", "Nombre", "Correo", "Telefono", "Producto", "Fecha"
        };
        //Definimos los nombres de las columnas
        return columna;
    }

    public void setFilas() {
        //Ejecutamos la conexion a la base de datos para provedores   
        mysql();

    }

    public void setFilas1() {
        //Ejecutamos la conexion a la base de datos para compradores    
        mysql1();

    }

    public void mysql() {
        conexionmysql();
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/contabilidad", "osman", "armando9812");
            java.sql.Statement st = conexion.createStatement();
            String sql
                    = "SELECT codigo, nombre, correo, telefono, producto, fecha FROM provedor2";
            try ( //llamamos los datos necesarios de nuestra tabla y le asignamos un orden
                    ResultSet result = st.executeQuery(sql)) {
                Object datos[] = new Object[6];
                while (result.next()) {
                    for (int i = 0; i < 6; i++) {
                        datos[i] = result.getObject(i + 1);
                        //se incrementa el la posicion donde se mostrara el valor almacenado en la tabla
                    }
                    modeloTabla.addRow(datos);
                }
            }
        } catch (ClassNotFoundException | SQLException E) {
            System.out.println("Error weon");
        }
    }

    public void mysql1() {
        conexionmysql();
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/contabilidad", "osman", "armando9812");
            java.sql.Statement st = conexion.createStatement();
            String sql
                    = "SELECT codigo, nombre, correo, telefono, producto, fecha FROM comprador";
            //llamamos los datos necesarios de nuestra tabla y le asignamos un orden
            ResultSet result = st.executeQuery(sql);
            Object datos[] = new Object[6];
            while (result.next()) {
                for (int i = 0; i < 6; i++) {
                    datos[i] = result.getObject(i + 1);
                    //se incrementa el la posicion donde se mostrara el valor almacenado en la tabla
                }
                modeloTabla1.addRow(datos);
            }
            result.close();
        } catch (Exception E) {
            System.out.println("Error weon");
        }
    }

    public void conexionmysql() {
        Connection conectar = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/contabilidad", "osman", "armando9812");
            if (conectar != null) {
                System.out.println("Conexion exitosa a esquema base mysql");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BuscarT2 = new javax.swing.JTextField();
        BuscarT = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(979, 698));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(979, 698));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(modeloTabla);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(26);
        jTable1.setSelectionBackground(new java.awt.Color(142, 68, 173));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable2.setForeground(new java.awt.Color(102, 102, 102));
        jTable2.setModel(modeloTabla1);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(26);
        jTable2.setSelectionBackground(new java.awt.Color(142, 68, 173));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setBackground(new java.awt.Color(142, 68, 173));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 68, 173));
        jLabel1.setText("Compradores");

        jLabel2.setBackground(new java.awt.Color(142, 68, 173));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 68, 173));
        jLabel2.setText("Vendedores");

        jLabel7.setBackground(new java.awt.Color(142, 68, 173));
        jLabel7.setFont(new java.awt.Font("bold_year", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(142, 68, 173));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Modificar.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(142, 68, 173));
        jLabel6.setFont(new java.awt.Font("bold_year", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(142, 68, 173));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Agregar.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        BuscarT2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        BuscarT2.setForeground(new java.awt.Color(102, 102, 102));
        BuscarT2.setBorder(null);
        BuscarT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscarT2KeyPressed(evt);
            }
        });

        BuscarT.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        BuscarT.setForeground(new java.awt.Color(102, 102, 102));
        BuscarT.setBorder(null);
        BuscarT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscarTKeyPressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(142, 68, 173));
        jSeparator3.setForeground(new java.awt.Color(142, 68, 173));

        jSeparator4.setBackground(new java.awt.Color(142, 68, 173));
        jSeparator4.setForeground(new java.awt.Color(142, 68, 173));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BuscarT2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BuscarT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarT2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
       
        Contacto_Agregar p1 = new Contacto_Agregar();
        
        p1.setSize(1289, 720);
        p1.setLocation(0, 0);     
        
        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        //ContactoAgregar jFrame = new ContactoAgregar();
        //jFrame.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void BuscarTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarTKeyPressed
        String[] titulos = {"Codigo"," Nombre"," Correo", "Telefono"," Producto","Fecha"};
        String[] registros = new String[50];

        String sql = "SELECT *FROM provedor2 WHERE Codigo LIKE '%" + BuscarT.getText() + "%' "
        + "OR Nombre LIKE '%" + BuscarT.getText() + "%'";
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        //Conectar cc = new Conectar();
        //Connection conect = cc.conexion();
        conexion a=new conexion();
        Connection cn = a.getConnection();
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("correo");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("producto");
                registros[5] = rs.getString("fecha");
                model.addRow(registros);
            }
            jTable1.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BuscarTKeyPressed

    private void BuscarT2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarT2KeyPressed
        String[] titulos = {"Codigo"," Nombre"," Correo", "Telefono"," Producto","Fecha"};
        String[] registros = new String[6];

        String sql = "SELECT *FROM comprador WHERE Codigo LIKE '%" + BuscarT2.getText() + "%' "
        + "OR Nombre LIKE '%" + BuscarT2.getText() + "%'";
        DefaultTableModel model2 = new DefaultTableModel(null, titulos);
        //Conectar cc = new Conectar();
        //Connection conect = cc.conexion();
        conexion a=new conexion();
        Connection cn = a.getConnection();
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("correo");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("producto");
                registros[5] = rs.getString("fecha");

                model2.addRow(registros);
            }
            jTable2.setModel(model2);
        }catch(SQLException e){
 JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarT2KeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        Contacto_Consultar p1 = new Contacto_Consultar();

        p1.setSize(1289, 720);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarT;
    private javax.swing.JTextField BuscarT2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
