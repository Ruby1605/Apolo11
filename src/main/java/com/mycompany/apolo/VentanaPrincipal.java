/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.apolo;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Rubén
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private CuentaAtras cuentaAtras ;
    private Logger logger;
    
    public VentanaPrincipal() {
        initComponents();
        try {
            logger = new Logger();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
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
        txtSegundos = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        etiSegundos = new javax.swing.JLabel();
        etiEstado = new javax.swing.JLabel();
        etiFase1 = new javax.swing.JLabel();
        etiFase2 = new javax.swing.JLabel();
        etiFase3 = new javax.swing.JLabel();
        etiFase4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Segundos: ");

        txtSegundos.setText("10");
        txtSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundosActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        etiSegundos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiSegundos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiSegundos.setText("0");

        etiEstado.setText("-------");

        etiFase1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiFase1.setText("IGNICIÓN");
        etiFase1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiFase1.setOpaque(true);

        etiFase2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiFase2.setText("DESACOPLE");
        etiFase2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiFase2.setOpaque(true);

        etiFase3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiFase3.setText("MÓDULO");
        etiFase3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiFase3.setOpaque(true);

        etiFase4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiFase4.setText("ÓRBITA");
        etiFase4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiFase4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel))
                            .addComponent(etiSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(etiFase1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiFase2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiFase3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiFase4)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart)
                    .addComponent(btnCancel))
                .addGap(33, 33, 33)
                .addComponent(etiSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFase1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiFase2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiFase3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiFase4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiEstado)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundosActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        etiFase1.setBackground(new Color (242,242,242));
        etiFase2.setBackground(new Color (242,242,242));
        etiFase3.setBackground(new Color (242,242,242));
        etiFase4.setBackground(new Color (242,242,242));
       
        try {
            logger.info("Se pulso boton Start");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        cuentaAtras = new CuentaAtras(this);
        Thread cuenta = new Thread(cuentaAtras);
        cuenta.start();
        Monitor monitor = new Monitor(cuentaAtras,this);
        Thread hiloMonitor = new Thread(monitor);
        hiloMonitor.start();
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cuentaAtras.setActivo(false);
        try {
            logger.error("Lanzamiento Cancelado");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            logger.cerrar();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel etiEstado;
    private javax.swing.JLabel etiFase1;
    private javax.swing.JLabel etiFase2;
    private javax.swing.JLabel etiFase3;
    private javax.swing.JLabel etiFase4;
    private javax.swing.JLabel etiSegundos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSegundos;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtSegundos(){
        return txtSegundos;
    }
    public JLabel getEtiSegundos(){
        return etiSegundos;
    }
     public JLabel getEtiEstado(){
        return etiEstado;
    }
    public void finCuentaAtras(boolean resultado){
        String texto = "Lanzamiento!!!";
        int tipoDialogo = JOptionPane.INFORMATION_MESSAGE;
        if (!resultado ){
            texto = "Lanzamiento Abortado";
            tipoDialogo = JOptionPane.ERROR_MESSAGE;
        }
        JOptionPane.showMessageDialog(this, texto , "Resultado", tipoDialogo);
        if(resultado){
            fases();
        }
    }
    public void fases(){
        Fase fase1 = new Fase(etiFase1,600);
        Thread hiloFase1 = new Thread(fase1);
        hiloFase1.start();
        
        try {
            logger.info("Se inicio la Ignicion");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            hiloFase1.join();
        } catch (InterruptedException ex) {
        }
        
        Fase fase2 = new Fase(etiFase2,600);
        Thread hiloFase2 = new Thread(fase2);
        hiloFase2.start();
        
         try {
            logger.info("Se inicio el Desacople");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            hiloFase2.join();
        } catch (InterruptedException ex) {
        }
        
        Fase fase3 = new Fase(etiFase3,600);
        Thread hiloFase3 = new Thread(fase3);
        hiloFase3.start();
        
         try {
            logger.info("Se inicio el Módulo ");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            hiloFase3.join();
        } catch (InterruptedException ex) {
        }
        
        Fase fase4 = new Fase(etiFase4,600);
        Thread hiloFase4 = new Thread(fase4);
        hiloFase4.start();
        
         try {
            logger.info("Se inicio la órbita");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            hiloFase4.join();
        } catch (InterruptedException ex) {
        }
    }

   
}
