/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author osman
 */
public class Estados_Financieros extends javax.swing.JPanel {

    

    //Contacto listar, añadir
    public Estados_Financieros() {
        
        
        initComponents();
 
        conexion con=new conexion();
           Connection cn =con.getConnection();
  
             try {
            java.sql.Statement pst=cn.createStatement();            

        String sql2 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Caja' ";
                     ResultSet result = pst.executeQuery(sql2);                     
                     int valor=0;
                while (result.next()) {                 
                 valor=valor+result.getInt(1);                                 
                } String sql3 = "SELECT SUM(Efectivo) FROM saldos  ";
                     ResultSet result1 = pst.executeQuery(sql3); while (result1.next()) {                 
                 valor=valor+result1.getInt(1); 
                //// 
                 
                  String sql4 = "SELECT SUM(Inventario) FROM saldos ";
                     ResultSet result2 = pst.executeQuery(sql4);                     
                     int valor2=0;
                while (result2.next()) {                 
                 valor2=valor2+result2.getInt(1);                                                 
               } 
                ///
                String sql5 = "SELECT SUM(Iva) FROM saldos ";
                     ResultSet result3 = pst.executeQuery(sql5);                     
                     int valor3=0;
                while (result3.next()) {                 
                 valor3=valor3+result3.getInt(1);                                                 
               } 
                ///
                 String sql6 = "SELECT SUM(Provedores) FROM saldos ";
                     ResultSet result4 = pst.executeQuery(sql6);                     
                     int valor4=0;
                while (result4.next()) {                 
                 valor4=valor4+result4.getInt(1);                                                 
               } 
                ///
                 String sql7 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Muebles y enseres'";
                     ResultSet result5 = pst.executeQuery(sql7);                     
                     int valor5=0;
                while (result5.next()) {                 
                 valor5=valor5+result5.getInt(1);                                                 
               } 
       ///
                 String sql8 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Cuentas de ahorro'";
                     ResultSet result6 = pst.executeQuery(sql8);                     
                     int valor6=0;
                while (result6.next()) {                 
                 valor6=valor6+result6.getInt(1);                                                 
               } 
                
                ///
                 String sql9 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Aportes sociales'";
                     ResultSet result7 = pst.executeQuery(sql9);                     
                     int valor7=0;
                while (result7.next()) {                 
                 valor7=valor7+result7.getInt(1);                                                 
               } 
                
                ///
                 String sql10 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Gastos legales'";
                     ResultSet result8 = pst.executeQuery(sql10);                     
                     int valor8=0;
                while (result8.next()) {                 
                 valor8=valor8+result8.getInt(1);                                                 
               } 
                ///
                 String sql11 = "SELECT SUM(valor) FROM contabilidad WHERE auxiliar='Bancos del exterior'";
                     ResultSet result9 = pst.executeQuery(sql11);                     
                     int valor9=0;
                while (result9.next()) {                 
                 valor9=valor9+result9.getInt(1);                                                 
               } 
                  caja.setText(""+valor);
                  invent.setText(""+valor2);
                iva.setText(""+valor3);
                proveedores.setText(""+valor4);
                muebles.setText(""+valor5);
                  ahorro.setText(""+valor6);
                  social.setText(""+valor7);
                   legales.setText(""+valor8);
                   exterior.setText(""+valor9);
                   //sumas
                   int activoss=0;
                   activoss=(valor+valor2+valor6+valor5);
                   tactivo.setText(""+activoss);
                   int pasivoss=0;
                     NominaTotal b=new NominaTotal();
                     double jk=b.getY3();
                  nomi.setText(""+jk);
                   pasivoss=(valor3+valor4+valor8+valor9+(int)jk);
                   tpasivo.setText(""+pasivoss);
                   int patri=0;
              
                  EstadosResultados1 nj= new EstadosResultados1();
                  int asdd=nj.resultados();
                  uo.setText(""+asdd);
                
                
                       patri=(valor7+Integer.parseInt(uo.getText()));
                   tpatrimonio.setText(""+patri);
                     }}catch (SQLException ex) {
           System.out.println(""+ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        caja = new javax.swing.JTextField();
        invent = new javax.swing.JTextField();
        ahorro = new javax.swing.JTextField();
        muebles = new javax.swing.JTextField();
        tactivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tpatrimonio = new javax.swing.JTextField();
        uo = new javax.swing.JTextField();
        social = new javax.swing.JTextField();
        tpasivo = new javax.swing.JTextField();
        nomi = new javax.swing.JTextField();
        exterior = new javax.swing.JTextField();
        legales = new javax.swing.JTextField();
        proveedores = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1242, 698));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 160, 133));
        jLabel1.setText("Estados Financieros");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Activo");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Corriente");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Disponible:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Inventario:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Cuenta de ahorros:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("No corriente:");

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Muebles y enceres:");

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Total Activo:");

        caja.setEditable(false);
        caja.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        caja.setText(" ");
        caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaActionPerformed(evt);
            }
        });

        invent.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        invent.setText(" ");
        invent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventActionPerformed(evt);
            }
        });

        ahorro.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        ahorro.setText(" ");
        ahorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahorroActionPerformed(evt);
            }
        });

        muebles.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        muebles.setText(" ");
        muebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mueblesActionPerformed(evt);
            }
        });

        tactivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tactivo.setText(" ");
        tactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tactivoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pasivo");

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Pasivo corriente");

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Iva:");

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Proveedores:");

        jLabel18.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Gastos Legales:");

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Bancos del exterior:");

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Salarios por pagar");

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Total pasivo:");

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Patrimonio");

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Aporte social:");

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Utilidad operacional:");

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Total Patrimonio:");

        tpatrimonio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tpatrimonio.setText(" ");
        tpatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpatrimonioActionPerformed(evt);
            }
        });

        uo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        uo.setText(" ");
        uo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uoActionPerformed(evt);
            }
        });

        social.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        social.setText(" ");
        social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialActionPerformed(evt);
            }
        });

        tpasivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tpasivo.setText(" ");
        tpasivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasivoActionPerformed(evt);
            }
        });

        nomi.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nomi.setText(" ");
        nomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomiActionPerformed(evt);
            }
        });

        exterior.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        exterior.setText(" ");
        exterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exteriorActionPerformed(evt);
            }
        });

        legales.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        legales.setText(" ");
        legales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legalesActionPerformed(evt);
            }
        });

        proveedores.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        proveedores.setText(" ");
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });

        iva.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        iva.setText(" ");
        iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Estado.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Balance.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_Nomina.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tactivo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                                .addComponent(muebles, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ahorro, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(invent, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(caja, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                        .addComponent(tpasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(nomi)
                                                    .addComponent(exterior)
                                                    .addComponent(proveedores)
                                                    .addComponent(jLabel24)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel18)
                                                    .addComponent(legales)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel14)))
                                        .addGap(62, 62, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)
                                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tpatrimonio))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(social, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(legales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(exterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muebles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tpasivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaActionPerformed

    }//GEN-LAST:event_cajaActionPerformed

    private void inventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventActionPerformed

    private void ahorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahorroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ahorroActionPerformed

    private void mueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mueblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mueblesActionPerformed

    private void tactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tactivoActionPerformed

    private void tpatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpatrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpatrimonioActionPerformed

    private void uoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uoActionPerformed

    private void socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socialActionPerformed

    private void tpasivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpasivoActionPerformed

    private void nomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomiActionPerformed

    private void exteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exteriorActionPerformed

    private void legalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legalesActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedoresActionPerformed

    private void ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ivaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      EstadosResultados1 a=new EstadosResultados1();
      a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       nomina2 a=new nomina2();
      a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            NominaTotal a=new NominaTotal();
      a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ahorro;
    private javax.swing.JTextField caja;
    private javax.swing.JTextField exterior;
    private javax.swing.JTextField invent;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField legales;
    private javax.swing.JTextField muebles;
    private javax.swing.JTextField nomi;
    private javax.swing.JTextField proveedores;
    private javax.swing.JTextField social;
    private javax.swing.JTextField tactivo;
    private javax.swing.JTextField tpasivo;
    private javax.swing.JTextField tpatrimonio;
    private javax.swing.JTextField uo;
    // End of variables declaration//GEN-END:variables
}
