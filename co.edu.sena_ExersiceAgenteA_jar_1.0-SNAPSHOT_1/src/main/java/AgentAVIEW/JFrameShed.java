/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgentAVIEW;

import AgentAMODEL.Shed;
import AgenteACONTROLLER.IShedController;
import AgenteACONTROLLER.ShedController;
import Utils.MessageUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 * fecha:29/10/2026
 * objetivo: hacer el jframe de galpon
 * @author Camilo
 */
public class JFrameShed extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameShed.class.getName());
    private final IShedController shedController = new ShedController();

    /**
     * Creates new form JFrameShed
     */
    public JFrameShed() {
        initComponents();
        fillTable();
    }

    public void fillTable() {
        DefaultTableModel model = new DefaultTableModel();
        jTableSheds.setModel(model);
        model.addColumn("Numero");
        model.addColumn("Estado");
        String[] rows = new String[2];
        for (Shed s : ShedController.shedList) {
            rows[0] = String.valueOf(s.getNumber());
            rows[1] = s.getState();
            model.addRow(rows);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSheds = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "DISPONIBLE", "OCUPADO" }));

        jLabel1.setText("Estado Galpon");

        jLabelNumber.setText("Numero Galpon");

        jLabelTitle.setText("Gestion Galpon");

        jButtonInsert.setText("insertar");
        jButtonInsert.addActionListener(this::jButtonInsertActionPerformed);

        jButtonUpdate.setText("actualizar");
        jButtonUpdate.setEnabled(false);
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonDelete.setText("eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);

        jButtonClean.setText("limpiar");
        jButtonClean.addActionListener(this::jButtonCleanActionPerformed);

        jTableSheds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableSheds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShedsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSheds);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInsert)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabelNumber)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonUpdate)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonDelete)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitle)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTitle)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumber)
                    .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int option = MessageUtils.getInstance().showConfirm("Está seguro de eliminar el registro?");
        if (option == JOptionPane.YES_OPTION) {
            try {
                shedController.delete(Integer.parseInt(jTextFieldNumber.getText()));
                MessageUtils.getInstance().showInfo("Registro eliminado exitosamente");
                clear();
                fillTable();
            } catch (Exception ex) {
                MessageUtils.getInstance().showError(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        
    try {
        Shed shed = new Shed();

        shed.setId(Integer.parseInt(jTextFieldNumber.getText()));
        shed.setState(jComboBoxStatus.getSelectedItem().toString());

        shedController.insert(shed);

        MessageUtils.getInstance().showInfo("El registro fue creado exitosamente");
        clear();
        fillTable();

    } catch (NumberFormatException ex) {
        MessageUtils.getInstance().showError("El número del galpón debe contener solo números");
    } catch (Exception ex) {
        MessageUtils.getInstance().showError(ex.getMessage());
    }

    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Shed shed = new Shed();
            shed.setNumber(Integer.parseInt(jTextFieldNumber.getText()));
            shed.setState(jComboBoxStatus.getSelectedItem().toString());

            shedController.update(shed);
            MessageUtils.getInstance().showInfo("El registro fue modificado exitosamente");
            clear();
        } catch (NumberFormatException ex) {
            MessageUtils.getInstance().showError("El número del galpón debe contener solo números");
        } catch (Exception ex) {
            MessageUtils.getInstance().showError(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableShedsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShedsMouseClicked
        int rowSelected = jTableSheds.getSelectedRow();
        if (rowSelected != -1) {
            jButtonUpdate.setEnabled(true);
            jButtonDelete.setEnabled(true);
            jButtonInsert.setEnabled(false);

            int numberSelected = Integer.parseInt(jTableSheds.getValueAt(rowSelected, 0).toString());
            try {
                //CONSULTAR POR ID
                Shed shed = shedController.find(numberSelected);
                jTextFieldNumber.setText(String.valueOf(shed.getNumber()));
                jComboBoxStatus.setSelectedItem(shed.getState());
            } catch (Exception ex) {
                MessageUtils.getInstance().showError(ex.getMessage());
            }

        }

    }//GEN-LAST:event_jTableShedsMouseClicked
    public void clear() {
        jTextFieldNumber.setText("");
        jComboBoxStatus.setSelectedIndex(0);
        jTableSheds.clearSelection();
        jButtonInsert.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }

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
        java.awt.EventQueue.invokeLater(() -> new JFrameShed().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSheds;
    private javax.swing.JTextField jTextFieldNumber;
    // End of variables declaration//GEN-END:variables

}
