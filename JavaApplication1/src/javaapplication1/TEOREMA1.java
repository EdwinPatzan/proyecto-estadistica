
package javaapplication1;

public class TEOREMA1 extends javax.swing.JFrame {

    /**
     * Creates new form TEOREMA1
     */
    public TEOREMA1() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtFact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RESULTADO = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDatos = new javax.swing.JTextArea();
        MENU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("TEOREMA 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/teorema 1.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 230, 160));

        txtNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 183, 60, 30));

        txtFact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFactActionPerformed(evt);
            }
        });
        getContentPane().add(txtFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 183, 60, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("INGRESAR NUMERO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, -1));

        RESULTADO.setBackground(new java.awt.Color(255, 0, 0));
        RESULTADO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESULTADO.setText("RESULTADO");
        RESULTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTADOActionPerformed(evt);
            }
        });
        getContentPane().add(RESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("EL FACTORIAL ES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 130, -1));

        taDatos.setColumns(20);
        taDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        taDatos.setRows(5);
        jScrollPane1.setViewportView(taDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 290, 180));

        MENU.setBackground(new java.awt.Color(204, 204, 0));
        MENU.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MENU.setForeground(new java.awt.Color(204, 51, 0));
        MENU.setText("MENU");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/teorema 1.5.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESULTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTADOActionPerformed
    taDatos.setText("");
        int num = Integer.parseInt(txtNum.getText());
        int fact=1;
        for (int i=1; i<=num; i++){
            taDatos.append(i+"\n");
            fact=fact*i;
        }
        txtFact.setText("" + fact);
    }//GEN-LAST:event_RESULTADOActionPerformed

    private void txtFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
    OPERACIONES T1= new OPERACIONES  ();
    T1.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_MENUActionPerformed

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
            java.util.logging.Logger.getLogger(TEOREMA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEOREMA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEOREMA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEOREMA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEOREMA1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENU;
    private javax.swing.JButton RESULTADO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDatos;
    private javax.swing.JTextField txtFact;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}