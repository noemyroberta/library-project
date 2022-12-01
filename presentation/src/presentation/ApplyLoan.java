package presentation;

import models.auth.IUserOperation;
import models.library.Material;
import repository.MaterialRepository;
import utils.DateFormat;

/**
 *
 * @author cleyf
 */
public class ApplyLoan extends javax.swing.JFrame {

    /**
     * Creates new form Loan
     */
    private IUserOperation operation;
    
    public ApplyLoan(IUserOperation operation) {
        initComponents();
        this.operation = operation;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRealizarEmprestimo = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        lblCodigoLivro = new javax.swing.JLabel();
        btnApplyLoan = new javax.swing.JButton();
        lblTituloLivro1 = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblEditor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        editionField = new javax.swing.JTextField();
        btnLivro = new javax.swing.JRadioButton();
        btnExemplar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 111, 159), 2, true));

        lblRealizarEmprestimo.setFont(new java.awt.Font("Futura Md BT", 1, 36)); // NOI18N
        lblRealizarEmprestimo.setForeground(new java.awt.Color(17, 111, 159));
        lblRealizarEmprestimo.setText("Realizar Empréstimo");

        isbnField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        isbnField.setForeground(new java.awt.Color(51, 51, 51));
        isbnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnFieldActionPerformed(evt);
            }
        });

        lblCodigoLivro.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblCodigoLivro.setForeground(new java.awt.Color(51, 51, 51));
        lblCodigoLivro.setText("Digite o Código do Material");

        btnApplyLoan.setFont(new java.awt.Font("Futura Md BT", 0, 16)); // NOI18N
        btnApplyLoan.setForeground(new java.awt.Color(51, 51, 51));
        btnApplyLoan.setText("Enviar");
        btnApplyLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyLoanActionPerformed(evt);
            }
        });

        lblTituloLivro1.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        lblTituloLivro1.setForeground(new java.awt.Color(51, 51, 51));

        titleField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        titleField.setForeground(new java.awt.Color(51, 51, 51));
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Título");

        lblAutor.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(51, 51, 51));
        lblAutor.setText("Autor/Autora");

        lblEditor.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblEditor.setForeground(new java.awt.Color(51, 51, 51));
        lblEditor.setText("Edição");

        lblAno.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblAno.setForeground(new java.awt.Color(51, 51, 51));
        lblAno.setText("Ano");

        lblQuantidade.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(51, 51, 51));
        lblQuantidade.setText("Quantidade");

        yearField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        yearField.setForeground(new java.awt.Color(51, 51, 51));
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        authorField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        authorField.setForeground(new java.awt.Color(51, 51, 51));
        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });

        quantityField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        quantityField.setForeground(new java.awt.Color(51, 51, 51));
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        editionField.setFont(new java.awt.Font("Futura Md BT", 0, 14)); // NOI18N
        editionField.setForeground(new java.awt.Color(51, 51, 51));
        editionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionFieldActionPerformed(evt);
            }
        });

        btnLivro.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        btnLivro.setForeground(new java.awt.Color(51, 51, 51));
        btnLivro.setText("Livro");
        btnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroActionPerformed(evt);
            }
        });

        btnExemplar.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        btnExemplar.setForeground(new java.awt.Color(51, 51, 51));
        btnExemplar.setText("Exemplar");
        btnExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloLivro1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAutor)
                                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantityField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo)
                                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAno)
                                    .addComponent(yearField)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCodigoLivro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRealizarEmprestimo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExemplar)
                        .addGap(18, 18, 18)
                        .addComponent(btnApplyLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblRealizarEmprestimo)
                .addGap(34, 34, 34)
                .addComponent(lblCodigoLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApplyLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLivro)
                    .addComponent(btnExemplar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloLivro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEditor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isbnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnFieldActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void editionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editionFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFieldActionPerformed

    private void btnApplyLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyLoanActionPerformed
        String isbn = isbnField.getText();
        
        if (btnExemplar.isSelected()) {
           operation.applyLoan("Exemplar", isbn);
        } else {
            operation.applyLoan("Livro", isbn);
        }
        
        Material material = MaterialRepository.searchMaterialByISBN(isbn);
              
        titleField.setText(material.getName());
        authorField.setText(material.getAuthor());
        yearField.setText(String.valueOf(material.getRegisterDate().getYear()));
        quantityField.setText(String.valueOf(material.getQuantity()));
        editionField.setText(material.getEdition());
    }//GEN-LAST:event_btnApplyLoanActionPerformed

    private void btnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroActionPerformed
        btnExemplar.setSelected(false);
    }//GEN-LAST:event_btnLivroActionPerformed

    private void btnExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExemplarActionPerformed
        btnLivro.setSelected(false);
    }//GEN-LAST:event_btnExemplarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorField;
    private javax.swing.JButton btnApplyLoan;
    private javax.swing.JRadioButton btnExemplar;
    private javax.swing.JRadioButton btnLivro;
    private javax.swing.JTextField editionField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigoLivro;
    private javax.swing.JLabel lblEditor;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRealizarEmprestimo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloLivro1;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField titleField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
