package presentation;

import models.auth.IUserOperation;
import models.auth.User;
import models.library.PersonFactory;

/**
 *
 * @author cleyf
 */
public class ControlUserPanel extends javax.swing.JFrame {

   
    public ControlUserPanel() {
        initComponents();
        lblLoggedUser.setText("Usuário logado: "+ User.getInstance().getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPermissoesUsuario = new javax.swing.JLabel();
        btnApplyLoan = new javax.swing.JButton();
        btnReturnLoan = new javax.swing.JButton();
        btnViewFines = new javax.swing.JButton();
        btnPayFines = new javax.swing.JButton();
        lblLoggedUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jPanel2.setBackground(new java.awt.Color(17, 111, 159));
        jPanel2.setPreferredSize(new java.awt.Dimension(481, 563));
        jPanel2.setRequestFocusEnabled(false);

        lblPermissoesUsuario.setFont(new java.awt.Font("Futura Md BT", 1, 36)); // NOI18N
        lblPermissoesUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblPermissoesUsuario.setText("Menu Principal");

        btnApplyLoan.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnApplyLoan.setText("Realizar Empréstimo");
        btnApplyLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyLoanActionPerformed(evt);
            }
        });

        btnReturnLoan.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnReturnLoan.setText("Realizar Devolução");
        btnReturnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLoanActionPerformed(evt);
            }
        });

        btnViewFines.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnViewFines.setText("Visualizar Multas");
        btnViewFines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFinesActionPerformed(evt);
            }
        });

        btnPayFines.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        btnPayFines.setText("Pagamento de Multas");
        btnPayFines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayFinesActionPerformed(evt);
            }
        });

        lblLoggedUser.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        lblLoggedUser.setForeground(new java.awt.Color(255, 255, 255));
        lblLoggedUser.setText("Nenhum login registrado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLoggedUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnReturnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPayFines, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewFines, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnApplyLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPermissoesUsuario)
                        .addGap(81, 81, 81))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblPermissoesUsuario)
                .addGap(73, 73, 73)
                .addComponent(btnApplyLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReturnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnViewFines, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnPayFines, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblLoggedUser)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    IUserOperation operation = new PersonFactory().createUser();
    
    private void btnApplyLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyLoanActionPerformed
        new ApplyLoan(operation).setVisible(true);
    }//GEN-LAST:event_btnApplyLoanActionPerformed

    private void btnReturnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnLoanActionPerformed

    private void btnViewFinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewFinesActionPerformed

    private void btnPayFinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayFinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayFinesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyLoan;
    private javax.swing.JButton btnPayFines;
    private javax.swing.JButton btnReturnLoan;
    private javax.swing.JButton btnViewFines;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLoggedUser;
    private javax.swing.JLabel lblPermissoesUsuario;
    // End of variables declaration//GEN-END:variables
}
