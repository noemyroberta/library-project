package presentation;

import models.auth.IAdminOperation;
import models.library.PersonFactory;

/**
 *
 * @author cleyf
 */
public class ControlAdminPanel extends javax.swing.JFrame {

    public ControlAdminPanel() {
        initComponents();
    }

    
    IAdminOperation operation = new PersonFactory().createAdmin();
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearchMaterial = new javax.swing.JButton();
        btnViewUserProfile = new javax.swing.JButton();
        btnRegisterUser = new javax.swing.JButton();
        btnRegisterMaterial = new javax.swing.JButton();
        btnViewMaterialCloseToReturnDate = new javax.swing.JButton();
        lblAdminLogado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 111, 159));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 111, 159));
        jLabel1.setText("Menu Principal");

        btnSearchMaterial.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnSearchMaterial.setText("Procurar Material");
        btnSearchMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMaterialActionPerformed(evt);
            }
        });

        btnViewUserProfile.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnViewUserProfile.setText("Visualizar Perfil do Usuário");
        btnViewUserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserProfileActionPerformed(evt);
            }
        });

        btnRegisterUser.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnRegisterUser.setForeground(new java.awt.Color(22, 22, 22));
        btnRegisterUser.setText("Cadastrar Usuário");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        btnRegisterMaterial.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnRegisterMaterial.setForeground(new java.awt.Color(22, 22, 22));
        btnRegisterMaterial.setText("Cadastrar Material");
        btnRegisterMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterMaterialActionPerformed(evt);
            }
        });

        btnViewMaterialCloseToReturnDate.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnViewMaterialCloseToReturnDate.setForeground(new java.awt.Color(22, 22, 22));
        btnViewMaterialCloseToReturnDate.setText("Ver Materiais Próximo da Data de Devolução");
        btnViewMaterialCloseToReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMaterialCloseToReturnDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewMaterialCloseToReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegisterMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(btnRegisterUser)
                .addGap(30, 30, 30)
                .addComponent(btnRegisterMaterial)
                .addGap(30, 30, 30)
                .addComponent(btnSearchMaterial)
                .addGap(30, 30, 30)
                .addComponent(btnViewUserProfile)
                .addGap(30, 30, 30)
                .addComponent(btnViewMaterialCloseToReturnDate)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        lblAdminLogado.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        lblAdminLogado.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblAdminLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAdminLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        new RegisterUser(operation).setVisible(true);
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnRegisterMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterMaterialActionPerformed
       new RegisterMaterial(operation).setVisible(true);
    }//GEN-LAST:event_btnRegisterMaterialActionPerformed

    private void btnViewUserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewUserProfileActionPerformed

    private void btnSearchMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMaterialActionPerformed

    private void btnViewMaterialCloseToReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMaterialCloseToReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewMaterialCloseToReturnDateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterMaterial;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnSearchMaterial;
    private javax.swing.JButton btnViewMaterialCloseToReturnDate;
    private javax.swing.JButton btnViewUserProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdminLogado;
    // End of variables declaration//GEN-END:variables
}
