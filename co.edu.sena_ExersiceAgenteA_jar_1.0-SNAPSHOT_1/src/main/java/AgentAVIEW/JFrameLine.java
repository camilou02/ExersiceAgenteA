/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgentAVIEW;

import AgentAMODEL.Line;
import AgenteACONTROLLER.ILineController;
import AgenteACONTROLLER.LineController;
import Utils.MessageUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * fecha:29/10/2026 objetivo: hacer el jframe de linea
 *
 * @author Camilo
 */

public class JFrameLine extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameLine.class.getName());
    private final ILineController lineController = new LineController();
    private int selectedNumber = 0;

    public JFrameLine() {
        initComponents();
        fillTable();
        clean();
    }

    public void fillTable() {
        DefaultTableModel model = new DefaultTableModel();
        jTableLines.setModel(model);
        model.addColumn("Código línea");
        model.addColumn("Nombre línea");
        String[] rows = new String[2];
        for (Line l : LineController.lineList) {
            rows[0] = String.valueOf(l.getNumber());
            rows[1] = l.getName();
            model.addRow(rows);
        }
    }

    public void clean() {
        jTextFieldName.setText("");
        selectedNumber = 0;
        jButtonRegister.setEnabled(true);
        jButtonModify.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jTableLines.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLines = new javax.swing.JTable();
        jLabelLine = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableLines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Linea", "Nombre"
            }
        ));
        jTableLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLinesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLines);

        jLabelLine.setText("nombre linea:");

        jLabelTitle.setText("Gestion de informacion de linea");

        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(this::jButtonRegisterActionPerformed);

        jButtonModify.setText("Modificar");
        jButtonModify.addActionListener(this::jButtonModifyActionPerformed);

        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);

        jButtonClean.setText("Limpiar");
        jButtonClean.addActionListener(this::jButtonCleanActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRegister)
                    .addComponent(jLabelLine))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonModify)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButtonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLine)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister)
                    .addComponent(jButtonModify)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clean();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        try {
            Line line = new Line();
            line.setName(jTextFieldName.getText());
            lineController.insert(line);
            fillTable();
            clean();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyActionPerformed
        try {
            Line line = new Line();
            line.setNumber(selectedNumber);
            line.setName(jTextFieldName.getText());
            lineController.update(line);
            fillTable();
            clean();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonModifyActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(this,
                    "¿Desea eliminar la línea?", "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                lineController.delete(selectedNumber);
                fillTable();
                clean();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableLinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLinesMouseClicked
        int row = jTableLines.getSelectedRow();
        if (row >= 0) {
            selectedNumber = Integer.parseInt(jTableLines.getValueAt(row, 0).toString());
            jTextFieldName.setText(jTableLines.getValueAt(row, 1).toString());
            jButtonRegister.setEnabled(false);
            jButtonModify.setEnabled(true);
            jButtonDelete.setEnabled(true);
        }
    }//GEN-LAST:event_jTableLinesMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameLine().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelLine;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLines;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
