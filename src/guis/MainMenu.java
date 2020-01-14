/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;
import guis.Patient.Patient_Request;
import source.Data;
import guis.MessageBox;
import source.User;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        //inst.setup();
        //System.out.println(Data.patients[0].getPassword());
        //System.out.println(Data.patients[0].getId());

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
        passwordtxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userIDtxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MainSubmitbtn = new javax.swing.JButton();
        mainNewUserbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        passwordtxt.setColumns(20);
        passwordtxt.setRows(5);
        jScrollPane1.setViewportView(passwordtxt);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DOCTOR SURGERY");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        userIDtxt.setColumns(20);
        userIDtxt.setRows(5);
        jScrollPane2.setViewportView(userIDtxt);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");

        MainSubmitbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MainSubmitbtn.setForeground(new java.awt.Color(51, 51, 51));
        MainSubmitbtn.setText("Enter");
        MainSubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSubmitbtnActionPerformed(evt);
            }
        });

        mainNewUserbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mainNewUserbtn.setForeground(new java.awt.Color(51, 51, 51));
        mainNewUserbtn.setText("New Account");
        mainNewUserbtn.setToolTipText("");
        mainNewUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainNewUserbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(315, 315, 315))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(mainNewUserbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainSubmitbtn)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainSubmitbtn)
                    .addComponent(mainNewUserbtn))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainNewUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainNewUserbtnActionPerformed
        this.dispose();
        new Patient_Request().setVisible(true); // Main Form to show after the Login Form..
    }//GEN-LAST:event_mainNewUserbtnActionPerformed

    private void check(String ID, User[] user) {
        
        int value = Data.findByID(ID);
        System.out.println("Value: " + value);
        if (value != -1) {
            int position = Data.findByID(ID);
            if (user[position].getPassword().equals(passwordtxt.getText()) ) {
                this.dispose();
                
            }
            else {
                MessageBox.infoBox("Incorrect Password", "WRONG INFO");
            }
        }
       
    }
    
    private void MainSubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSubmitbtnActionPerformed
        String ID = userIDtxt.getText();
        
        System.out.println(userIDtxt.getText().charAt(0));
        System.out.println(ID);
        if (userIDtxt.getText().charAt(0) == 'P') { 
            
            check(ID, Data.patients);
            this.dispose();
            new guis.Patient.PatientPage().setVisible(true);
        }
        else if (userIDtxt.getText().charAt(0) == 'D') {
            check(ID, Data.doctors);
            this.dispose();
            new guis.Doctor.DoctorPage().setVisible(true);
        }
        else if (userIDtxt.getText().charAt(0) == 'S') {
            check(ID, Data.secretaries);
            this.dispose();
            new guis.Secretary.SecretaryPage().setVisible(true);
        }
        else if (userIDtxt.getText().charAt(0) == 'A') {
            check(ID, Data.admins);
            this.dispose();
            new guis.Admin.AdminPage().setVisible(true);
        }
        else {
            MessageBox.infoBox("Incorrect User Type", "WRONG INFO");
        }

        

        
        
    }//GEN-LAST:event_MainSubmitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainSubmitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainNewUserbtn;
    private javax.swing.JTextArea passwordtxt;
    private javax.swing.JTextArea userIDtxt;
    // End of variables declaration//GEN-END:variables
}
