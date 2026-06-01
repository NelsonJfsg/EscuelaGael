package com.mycompany.escuela;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Screen extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Screen.class.getName());

    public Screen() {
        initComponents();
        cargarTabla();
        table.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tfClave = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Apellidos"
            }
        ));
        table.setCellSelectionEnabled(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        tfClave.setEnabled(false);
        tfClave.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                none(evt);
            }
        });

        tfNombres.addActionListener(this::tfNombresActionPerformed);

        tfApellidos.addActionListener(this::tfApellidosActionPerformed);

        saveButton.setText("Grabar Alumno");
        saveButton.addActionListener(this::saveButtonActionPerformed);

        updateButton.setText("Modificar Alumno");
        updateButton.addActionListener(this::updateButtonActionPerformed);

        deleteButton.setText("Eliminar Alumno");
        deleteButton.addActionListener(this::deleteButtonActionPerformed);

        exitButton.setText("Salir");
        exitButton.addActionListener(this::exitButtonActionPerformed);

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(tfNombres)
                            .addComponent(tfClave)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addComponent(saveButton)
                        .addGap(32, 32, 32)
                        .addComponent(updateButton)
                        .addGap(33, 33, 33)
                        .addComponent(deleteButton)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if (tfNombres.getText().equals("") || tfApellidos.equals("")) {
            JOptionPane.showMessageDialog(
                this,
                "Llene los campos necesarios"
            );
            return;
        }
        
        Estudiante estudiante = new Estudiante(
                0,
                tfNombres.getText(),
                tfApellidos.getText()
        );
        
        try {
            EstudianteEntity.createEstudiante(estudiante);
        }catch(Exception e){
            System.out.println("Error al crear estudiante");
        }
        
        tfClave.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        
        cargarTabla();
        
        JOptionPane.showMessageDialog(
                this,
                "Estudiante creado con exito"
            );
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void tfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombresActionPerformed

    private void none(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_none
        System.out.println("Evento de escribir" + evt);
    }//GEN-LAST:event_none

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int fila = table.getSelectedRow();

        if (fila != -1) {

            int clave = (int) table.getValueAt(fila, 0);
            String nombres = (String) table.getValueAt(fila, 1);
            String apellidos = (String) table.getValueAt(fila, 2);
            
            tfClave.setText(String.valueOf(clave));
            tfNombres.setText(nombres);
            tfApellidos.setText(apellidos);
            
        }
    }//GEN-LAST:event_tableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if (tfClave.getText().equals("")) {
            JOptionPane.showMessageDialog(
                this,
                "Seleccione un estudiante para eliminar"
            );
            return;
        }
        
        try{
            EstudianteEntity.deleteEstudiante(Integer.parseInt(tfClave.getText()));
        }catch(Exception e){
            System.out.println("Algo salio mal al eliminar" + e);
        }
        
        tfClave.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        cargarTabla();
        
        JOptionPane.showMessageDialog(
                this,
                "Estudiante eliminado con exito"
            );
        

        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (tfNombres.getText().equals("") || tfApellidos.equals("") || tfClave.getText().equals("")) {
           JOptionPane.showMessageDialog(
                this,
                "Verifique la información"
            );
            return;
        }
        
         Estudiante estudiante = new Estudiante(
                Integer.parseInt(tfClave.getText()),
                tfNombres.getText(),
                tfApellidos.getText()
        );
        
        try{
            EstudianteEntity.updateEstudiante(estudiante);
        }catch(Exception e){
            System.out.println("Algo salio mal al actualizar" + e);
        }
        
        tfClave.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        cargarTabla();
        
        JOptionPane.showMessageDialog(
                this,
                "Usuario actualizado con exito"
            );
    }//GEN-LAST:event_updateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new Screen().setVisible(true));
    }
    
    private void cargarTabla() {

        List<Estudiante> estudiantes = EstudianteEntity.allEstudiantes();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Clave");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        
        for (Estudiante estudiante : estudiantes) {

            modelo.addRow(new Object[]{
                estudiante.getClave(),
                estudiante.getNombres(),
                estudiante.getApellidos()
            });

        }

        table.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
