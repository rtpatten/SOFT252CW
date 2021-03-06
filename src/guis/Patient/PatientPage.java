package guis.Patient;

import guis.Patient.Patient_RateDoctor;

public class PatientPage extends javax.swing.JFrame {

    /**
     * Creates new form PatientPage
     */
    public PatientPage() {
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

        jLabel1 = new javax.swing.JLabel();
        RateDocbtn = new javax.swing.JButton();
        ViewRatebtn = new javax.swing.JButton();
        Requestbtn = new javax.swing.JButton();
        ViewAppointbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Historybtn = new javax.swing.JButton();
        PatientLogOffbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(901, 485));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Patient Main Menu");

        RateDocbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RateDocbtn.setText("Rate Doctor");
        RateDocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateDocbtnActionPerformed(evt);
            }
        });

        ViewRatebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewRatebtn.setText("View Rating");

        Requestbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Requestbtn.setText("Request Appointment");
        Requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestbtnActionPerformed(evt);
            }
        });

        ViewAppointbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewAppointbtn.setText("View Appointment");
        ViewAppointbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAppointbtnActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Deletebtn.setText("Delete Account");

        Historybtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Historybtn.setText("History");

        PatientLogOffbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PatientLogOffbtn.setText("Log off");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Requestbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewRatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RateDocbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Historybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewAppointbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(Deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(213, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PatientLogOffbtn)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Historybtn)
                        .addGap(46, 46, 46)
                        .addComponent(ViewAppointbtn)
                        .addGap(53, 53, 53)
                        .addComponent(Deletebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PatientLogOffbtn))
                        .addGap(96, 96, 96)
                        .addComponent(RateDocbtn)
                        .addGap(46, 46, 46)
                        .addComponent(ViewRatebtn)
                        .addGap(53, 53, 53)
                        .addComponent(Requestbtn)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RateDocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateDocbtnActionPerformed
        this.dispose();
        new Patient_RateDoctor().setVisible(true); // Main Form to show after the Login Form..
    }//GEN-LAST:event_RateDocbtnActionPerformed

    private void ViewAppointbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAppointbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAppointbtnActionPerformed

    private void RequestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestbtnActionPerformed
        this.dispose();
        new guis.Patient.Patient_RequestAppointment().setVisible(true);
    }//GEN-LAST:event_RequestbtnActionPerformed

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
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Historybtn;
    private javax.swing.JButton PatientLogOffbtn;
    private javax.swing.JButton RateDocbtn;
    private javax.swing.JButton Requestbtn;
    private javax.swing.JButton ViewAppointbtn;
    private javax.swing.JButton ViewRatebtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
