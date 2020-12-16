/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author osman
 */
public class ChatBot extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar
     */
    private int l, y;

    
    public ChatBot() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(41, 128, 185));
        jLabel1.setFont(new java.awt.Font("bold_year", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 128, 185));
        jLabel1.setText("Pregunta:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chatbot.gif"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(41, 128, 185));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("bold_year", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enviar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setBackground(new java.awt.Color(230, 126, 34));
        jLabel23.setForeground(new java.awt.Color(230, 126, 34));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Minimizar.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:             
        l = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - l, point.y - y);
        //enviamos la posicion de la ventana segun el arrastre del mouse
    }//GEN-LAST:event_formMouseDragged

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
       
        if(null == jTextField1.getText()){
            JOptionPane.showMessageDialog(null, "Ummm, nose");
        }else // TODO add your handling code here:
        switch (jTextField1.getText()) {
            case "Como te llamas":
                JOptionPane.showMessageDialog(null, "Mi nombre es Atomix.");
                jTextField1.setText("");
                break;
            case "Quien es tu padre":
                JOptionPane.showMessageDialog(null, "Darth Vader.Que la Fuerza te acompañe.");
                jTextField1.setText("");
                break;    
            case "Que es un activo":
                JOptionPane.showMessageDialog(null, "Un activo es un bien que la empresa posee y que puede convertirse en dinero u otros medios líquidos equivalentes.");
                jTextField1.setText("");
                break;
            case "Que es un pasivo":
                JOptionPane.showMessageDialog(null,"El pasivo consiste en las deudas que la empresa posee, recogidas en el balance de situación, y comprende las obligaciones actuales de la compañía que tienen origen en transacciones financieras pasadas.");
                jTextField1.setText("");
                break;
            case "Que es un Abono":
                JOptionPane.showMessageDialog(null," Anotación registrada en el Haber de una cuenta.");
                jTextField1.setText("");
                break;  
            case "Abrir Menu":
                Menu jFrame = new Menu();
                jFrame.setVisible(true);
                this.setVisible(false);
                break;  
            case "Abrir Calculadora":
                Calculadora jFrame1 = new Calculadora();
                jFrame1.setVisible(true);
                this.setVisible(false);
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Ummm, nose");
                break;
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
       
        if(null == jTextField1.getText()){
            JOptionPane.showMessageDialog(null, "Ummm, nose");
        }else // TODO add your handling code here:
        switch (jTextField1.getText()) {
            case "Como te llamas":
                JOptionPane.showMessageDialog(null, "Mi nombre es Atomix.");
                jTextField1.setText("");
                break;
            case "Quien es tu padre":
                JOptionPane.showMessageDialog(null, "Darth Vader.Que la Fuerza te acompañe.");
                jTextField1.setText("");
                break;    
            case "Que es un activo":
                JOptionPane.showMessageDialog(null, "Un activo es un bien que la empresa posee y que puede convertirse en dinero u otros medios líquidos equivalentes.");
                jTextField1.setText("");
                break;
            case "Que es un pasivo":
                JOptionPane.showMessageDialog(null,"El pasivo consiste en las deudas que la empresa posee, recogidas en el balance de situación, y comprende las obligaciones actuales de la compañía que tienen origen en transacciones financieras pasadas.");
                jTextField1.setText("");
                break;
            case "Que es un Abono":
                JOptionPane.showMessageDialog(null," Anotación registrada en el Haber de una cuenta.");
                jTextField1.setText("");
                break;  
            case "Abrir Menu":
                Menu jFrame = new Menu();
                jFrame.setVisible(true);
                this.setVisible(false);
                break;  
            case "Abrir Calculadora":
                Calculadora jFrame1 = new Calculadora();
                jFrame1.setVisible(true);
                this.setVisible(false);
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Ummm, nose");
                break;
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
        //minimizar ventana
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    // End of variables declaration//GEN-END:variables
}
